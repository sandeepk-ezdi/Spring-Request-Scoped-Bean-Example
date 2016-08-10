package com.ezdi.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import com.ezdi.beans.UserInfo;

@Service
public class UserSessionImpl implements UserSession {
	
	@Autowired
	private WebApplicationContext context;
	
	@Override
	public UserInfo getUserInfo() {
		return context.getBean(UserInfo.class);
	}
}
