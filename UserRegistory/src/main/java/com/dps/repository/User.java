package com.dps.repository;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
// 
@Table(name = "user")
public class User {

	
	private Long id;
    private String name;
    private String mobile;
    private String userloginid;
    private String userpassword;
    private String userstatus;
    private Date userlogintime;
    
    
	public User() {
		
	}
	
	public User(Long id, String name, String mobile, String userloginid, String userpassword, String userstatus,
			Date userlogintime) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.userloginid = userloginid;
		this.userpassword = userpassword;
		this.userstatus = userstatus;
		this.userlogintime = userlogintime;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserloginid() {
		return userloginid;
	}

	public void setUserloginid(String userloginid) {
		this.userloginid = userloginid;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getUserstatus() {
		return userstatus;
	}

	public void setUserstatus(String userstatus) {
		this.userstatus = userstatus;
	}

	public Date getUserlogintime() {
		return userlogintime;
	}

	public void setUserlogintime(Date userlogintime) {
		this.userlogintime = userlogintime;
	}
	
}