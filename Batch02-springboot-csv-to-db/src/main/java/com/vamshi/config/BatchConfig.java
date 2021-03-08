package com.vamshi.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.JobFactory;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.vamshi.model.IExamResult;
import com.vamshi.model.OExamResult;
import com.vamshi.processer.ExamResultProcesser;

@Configuration
@EnableBatchProcessing
@ComponentScan(basePackages ="com.vamshi.processer")
public class BatchConfig {
	@Autowired
	private ExamResultProcesser processer;
    @Autowired
    private DataSource ds;
    @Autowired
    private StepBuilderFactory stepFactory;
    @Autowired
    private JobBuilderFactory jobFactory;
    
    @Bean
    public ItemReader<IExamResult> reader() {
    	FlatFileItemReader<IExamResult> reader=null;
    	reader=new FlatFileItemReader<IExamResult>();
    	reader.setResource(new ClassPathResource("classpath:superBrains.csv"));
    	reader.setLineMapper(new DefaultLineMapper<IExamResult>() {{
    		setLineTokenizer(new DelimitedLineTokenizer(){{
    			setNames("id","semester","percentage","dob");
    		}});
    		setFieldSetMapper(new BeanWrapperFieldSetMapper<IExamResult>() {{
    		setTargetType(IExamResult.class);	
    		}});
    	}});
    	
    	return reader;
    }
 @Autowired
    public JdbcBatchItemWriter<OExamResult> writer(){
    	JdbcBatchItemWriter<OExamResult> writer=null;
    	writer=new JdbcBatchItemWriter<>();
    	writer.setDataSource(ds);
    	writer.setSql("INSERT INTO EXAM_RESULT(ID,SEMESTER,PERCENTAGE,DOB) VALUES(:id,:semester,:percentage,:dob)");
    	writer.setItemSqlParameterSourceProvider(
    		new BeanPropertyItemSqlParameterSourceProvider<OExamResult>());
    	return writer;
    	
    }
 
 @Bean
 public Step createStep1() {
	 return stepFactory.get("createStep1").<IExamResult,OExamResult>chunk(10)
			 .reader(reader()).writer(writer()).processor(processer).build();
	 }
 @Bean
 public Job createJob1() {
	 return jobFactory.get("createJob1").incrementer(new RunIdIncrementer())
			 .flow(createStep1()).end().build();
 }
    
    
    
    
}
