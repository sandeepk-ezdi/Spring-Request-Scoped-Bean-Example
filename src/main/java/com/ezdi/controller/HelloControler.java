package com.ezdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ezdi.beans.UserInfo;
import com.ezdi.request.UserSession;
import com.ezdi.request.UserSessionImpl;




@RestController
public class HelloControler {
	
	@Autowired
	UserSession userSession;
	
	@RequestMapping("/")
	public UserInfo userInfo() {
		
		
		UserInfo uinfo = userSession.getUserInfo();
		System.out.println(uinfo);
		
		UserInfo xinfo = userSession.getUserInfo();
		System.out.println(xinfo);
		
		return xinfo;
	}
}
