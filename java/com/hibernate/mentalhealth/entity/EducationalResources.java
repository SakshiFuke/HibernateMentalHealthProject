package com.hibernate.mentalhealth.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class EducationalResources {
	
	@Id
	private int erId;
	@Column (name="EResource_type")
	private String erType;
	
	@ManyToOne
	private Admin admin; 
	@ManyToOne
	private User user;
	
	public EducationalResources() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EducationalResources(int erId, String erType, Admin admin, User user) {
		super();
		this.erId = erId;
		this.erType = erType;
		this.admin = admin;
		this.user = user;
	}

	public int getErId() {
		return erId;
	}

	public void setErId(int erId) {
		this.erId = erId;
	}

	public String getErType() {
		return erType;
	}

	public void setErType(String erType) {
		this.erType = erType;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "EducationalResources [erId=" + erId + ", erType=" + erType + ", admin=" + admin + ", user=" + user
				+ "]";
	}

}
