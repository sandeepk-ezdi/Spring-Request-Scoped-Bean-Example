package com.ezdi.beans;

import java.io.Serializable;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.INTERFACES)
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private String userId;
	private String facilityId;
	
    @Autowired
    public UserInfo(HttpSession session) {
		userId = (String)session.getAttribute("userid");
		facilityId = (String)session.getAttribute("facilityid");
    }
	
	public UserInfo(String userId, String facilityId) {
		this.userId = userId;
		this.facilityId = facilityId;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFacilityId() {
		return facilityId;
	}
	public void setFacilityId(String facilityId) {
		this.facilityId = facilityId;
	}
	
	public int getId() {
		return this.hashCode();
	}
	
	public void setId() {
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", facilityId=" + facilityId + ", getId()=" + getId() + "]";
	}
}
