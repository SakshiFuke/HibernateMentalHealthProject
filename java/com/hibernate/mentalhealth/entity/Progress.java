package com.hibernate.mentalhealth.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Progress {
	
	@Id
	private int pId;
	private int uId;
	private int testId;
	@Column (name="progress_desc")
	private String Description;
	
	@ManyToOne
	private Admin admin;
	@ManyToOne
	private User user;
	@OneToOne
	private SelfAssessment test;
	public Progress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Progress(int pId, int uId, int testId, String description, Admin admin, User user, SelfAssessment test) {
		super();
		this.pId = pId;
		this.uId = uId;
		this.testId = testId;
		Description = description;
		this.admin = admin;
		this.user = user;
		this.test = test;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
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
	public SelfAssessment getTest() {
		return test;
	}
	public void setTest(SelfAssessment test) {
		this.test = test;
	}
	@Override
	public String toString() {
		return "Progress [pId=" + pId + ", uId=" + uId + ", testId=" + testId + ", Description=" + Description
				+ ", admin=" + admin + ", user=" + user + ", test=" + test + "]";
	}
	
}
