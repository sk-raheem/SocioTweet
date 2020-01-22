package com.Sociotweet.serv;

import org.springframework.stereotype.Service;

import com.Sociotweet.dto.MlaLogin;

@Service
public interface MlaServ {

	public boolean login(MlaLogin log);
	
	
}
