package com.vamshi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.stereotype.Repository;

import com.vamshi.bo.AccountBo;

public class BankDaoImpl implements BankDao {
	
	private static final String GET_ACCOUNT_DETAILS_ACCNO=
			"select accno,accholdername,balance from bank_account where accno=?";
	private static final String GET_ACCOUNT_DETAILS_BYBALANCE_RANG=
			"select accno,accholdername,balance from bank_account where balance between ? and ?";
	private static final String UPDATE_ACCOUNT_BALANCE_BYBALANCE_RANGE=
			"update bank_account set balance=balance+? where balance between ? and ?";
	
	private BankSelector1 bs1;
	private BankSelector2 bs2;
	private BankSelector3 bs3;
	private DataSource ds;
	
	
	public BankDaoImpl(DataSource ds) {
	    bs1=new BankSelector1(ds, GET_ACCOUNT_DETAILS_ACCNO);
	    bs2=new BankSelector2(ds,GET_ACCOUNT_DETAILS_BYBALANCE_RANG);
	    bs3=new BankSelector3(ds, UPDATE_ACCOUNT_BALANCE_BYBALANCE_RANGE);
	}
	
	
	public AccountBo getAccountByAccNo(int accNo) {
		AccountBo bo=bs1.findObject(accNo);
		
		return bo;
	}
	
	public List<AccountBo> getAccountByBalanceRang(float start,float end){
		List<AccountBo> listbo=null;
		listbo=bs2.execute(start,end);
		return listbo;	
	}
	public int updateByBalance(float increment,float start,float end) {
		int updatedRows=bs3.update(increment,start,end);
		return updatedRows;
	}
	
	
	
	
	//*********************************here from inner classes coms subclasses*****************************//
	
	
	
	private static class BankSelector1 extends MappingSqlQuery<AccountBo>{
		public BankSelector1(DataSource ds,String query) {
			super(ds,query);
			super.declareParameter(new SqlParameter(Types.INTEGER));
			super.compile();
			
		}

		@Override
		protected AccountBo mapRow(ResultSet rs, int rowNum) throws SQLException {
			AccountBo bo=new AccountBo();
			bo.setAccNo(rs.getInt(1));
			bo.setAccHolderName(rs.getString(2));
	        bo.setBalance(rs.getFloat(3));		
			return bo;
		}
		
	}
	
	
//********************* another subClasses comm innerclass for query*******************************************
	private static class BankSelector2 extends MappingSqlQuery<AccountBo>{
		public BankSelector2(DataSource ds,String query) {
			super(ds,query);
			super.declareParameter(new SqlParameter(Types.FLOAT));
			super.declareParameter(new SqlParameter(Types.FLOAT));
			super.compile();
			
		}

		@Override
		protected AccountBo mapRow(ResultSet rs, int rowNum) throws SQLException {
			AccountBo bo=new AccountBo();
			bo.setAccNo(rs.getInt(1));
			bo.setAccHolderName(rs.getString(2));
	        bo.setBalance(rs.getFloat(3));		
			return bo;
		}
		
	}
	//******************************another inner class for update query*******************************//
	private static class BankSelector3 extends SqlUpdate{
		public BankSelector3(DataSource ds,String query) {
			
			super(ds,query);
			super.declareParameter(new SqlParameter(Types.FLOAT));
			super.declareParameter(new SqlParameter(Types.FLOAT));
			super.declareParameter(new SqlParameter(Types.FLOAT));
			super.compile();
			
		}
	}

}
