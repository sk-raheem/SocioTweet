package com.Sociotweet.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sociotweet.dao.MlaDao;
import com.Sociotweet.dto.MlaLogin;

@Service
public class MlaServImple implements MlaServ {

	@Autowired
	private MlaDao mlaDao;
	
	public void setMlaDao(MlaDao mlaDao) {
		this.mlaDao = mlaDao;
	}

	@Override
	public boolean login(MlaLogin log) {
		
		
		
		return mlaDao.login(log);
	}

}
