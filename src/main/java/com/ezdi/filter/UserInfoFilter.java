package com.ezdi.filter;

import java.io.IOException;
import java.util.Random;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.ezdi.beans.UserInfo;

@Component
public class UserInfoFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		System.out.println("==============Pre Processing===================");
//		UserInfo userInfo = (UserInfo)httpRequest.getSession().getAttribute("userInfo");
		
		
//		if(userInfo == null ) 
//			userInfo= new UserInfo();
//			userInfo.setUserId("Id:"+new Random().nextInt());
//			userInfo.setFacilityId("F_Id:"+new Random().nextInt());
			httpRequest.getSession().setAttribute("userid","123" );
			httpRequest.getSession().setAttribute("facilityid", "121");
		
		chain.doFilter(request, response);
		System.out.println("==============Post Processing===================");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
}
