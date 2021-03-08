package com.vamshi.processer;

import java.sql.Date;


import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.vamshi.model.IExamResult;
import com.vamshi.model.OExamResult;
@Component
public class ExamResultProcesser implements ItemProcessor<IExamResult, OExamResult>{

	@Override
	public OExamResult process(IExamResult item) throws Exception {
		OExamResult oResult=null;
		
		if(item.getPercentage()>=90) {
			oResult=new OExamResult();
			BeanUtils.copyProperties(item, oResult,"dob");
			oResult.setDob(Date.valueOf(item.getDob()));
			 
		}
		
	       
		return oResult;
	}

	
	
	
}
