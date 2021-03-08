package com.vamshi.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vamshi.bo.PassengerBo;
@Repository("dao")
public class RegistractionDaoImpl implements RegistractionDao {
	@Autowired
	private JdbcTemplate jt;
	private static final String batch_insert="insert into passenger(pname,from_place,to_place,price) values(?,?,?,?)"; 
	

	@Override
	public int[] batchInsert(List<PassengerBo> pbo) {
		int[] a=jt.batchUpdate(batch_insert, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				System.out.println(
						"RegistractionDaoImpl.batchInsert(...).new BatchPreparedStatementSetter() {...}.setValues()");
				ps.setString(1, pbo.get(i).getName());
				ps.setString(2, pbo.get(i).getFrom());
				ps.setString(3, pbo.get(i).getTo());
				ps.setInt(4, pbo.get(i).getPrice());
				
				
			}
			
			@Override
			public int getBatchSize() {
				System.out.println(
						"RegistractionDaoImpl.batchInsert(...).new BatchPreparedStatementSetter() {...}.getBatchSize()");
				
				return pbo.size();
			}
		});
		
		
		return a;
	}

}
