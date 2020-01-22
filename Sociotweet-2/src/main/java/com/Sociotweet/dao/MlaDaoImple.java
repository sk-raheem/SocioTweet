package com.Sociotweet.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.tomcat.jni.Mmap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.Sociotweet.dto.MlaLogin;
@Repository
public class MlaDaoImple implements MlaDao  {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public boolean login(MlaLogin log) {
		String sql="select * from mla where username=? and password=?";
		
		MlaLogin temp=jdbcTemplate.queryForObject(sql, new Object[] {
				log.getUserName(),log.getPassword()
				},
				new RowMapper<MlaLogin>() {

			@Override
			public MlaLogin mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				MlaLogin la=new MlaLogin();
				
				la.setUserName(rs.getString(1));
				la.setPassword(rs.getString(2));
				return la;
			}
			
		});
		
		
		if(temp!=null) {
			return true;
		}
		
		
		return false;
	} 
}
