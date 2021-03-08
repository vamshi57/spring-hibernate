package com.vamshi.jdbcTemplate;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements Dao{
	private static final String GET_EMP_COUNT="SELECT COUNT(*) FROM EMP1 WHERE ENO=1";
	private static final String GET_EMP_ENAME="SELECT ENAME FROM EMP1 WHERE ENO=1";
	private static final String GET_EMP="SELECT * FROM EMP1 WHERE ENO=1";
	private static final String GET_EMP_BYNO="SELECT * FROM EMP1 WHERE ENO=?";
	private static final String GET_EMPS="SELECT * FROM EMP1";
	@Autowired
 private JdbcTemplate jt;

	public int getEmpNo() {
		Map<String , Object> map=null,map1=null;
		List<Map<String, Object>> listmap=null;
		
		int count=0;
		count=jt.queryForObject(GET_EMP_COUNT, Integer.class);
		String ename=null;
		ename=jt.queryForObject(GET_EMP_ENAME, String.class);
		System.out.println(ename);
		map=jt.queryForMap(GET_EMP);
		System.out.println(map);
		map1=jt.queryForMap(GET_EMP_BYNO, 2);
		System.out.println(map1);
		listmap=jt.queryForList(GET_EMPS);
		System.out.println(listmap);
		
		return count;
	}
	

}
