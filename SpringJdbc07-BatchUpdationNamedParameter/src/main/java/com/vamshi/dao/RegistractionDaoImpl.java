package com.vamshi.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vamshi.bo.PassengerBo;
@Repository("dao")
public class RegistractionDaoImpl implements RegistractionDao {
	//@Autowired
	//private JdbcTemplate jt;
	@Autowired
	private NamedParameterJdbcTemplate npjt;
	private static final String GET_PGR_BYNAME="select * from passenger where pname=:pname";
	@Override
	public PassengerBo getPassenger(String pname) {
		System.out.println(pname);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("pname", pname);
		PassengerBo bo;
		bo=npjt.queryForObject(GET_PGR_BYNAME, map, new RowMapper<PassengerBo>() {

			@Override
			public PassengerBo mapRow(ResultSet rs, int rowNum) throws SQLException {
				System.out.println("mapRow");
				PassengerBo bo1=new PassengerBo();
				System.out.println(rs.getString(3));
				bo1.setName(rs.getString(2));
				bo1.setFrom(rs.getString(3));
				bo1.setTo(rs.getString(4));
				bo1.setPrice(rs.getInt(5));
				System.out.println("mapRow");
				
				return bo1;	
				}
		});
		
		
		
		return bo;
		
	} 
	

		
		
	
}
