package com.Sociotweet.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Sociotweet.dto.MlaLogin;
import com.Sociotweet.serv.MlaServ;

@RestController
public class MlaController {

	@Autowired
	private MlaServ mlaServ;
	
	public void setMlaServ(MlaServ mlaServ) {
		this.mlaServ = mlaServ;
	}


	@GetMapping("/signin")
	public String sign() {
		
		
		return "MlaLogin";
		
	}
	
	
	@PostMapping("/signin")
	public ModelAndView signIn(MlaLogin log) {
		ModelAndView mv=new ModelAndView();
		
		if(mlaServ.login(log)) {
			mv.setViewName("dashboard");
		}else {
			mv.setViewName("MlaLogin");
		}
		
		
		return mv;
	}
	
	
	
}
