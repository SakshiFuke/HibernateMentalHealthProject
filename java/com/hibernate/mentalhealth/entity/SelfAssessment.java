package com.hibernate.mentalhealth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class SelfAssessment {
	@Id
	private int testId;
	private int uId;
	@Column (name="assessment_type")
	private String testType;
	
	@ManyToOne
	private Admin admin;
	@ManyToOne
	private User user;
	@OneToOne
	private Progress progress;
	
	public SelfAssessment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SelfAssessment(int testId, int uId, String testType, Admin admin, User user, Progress progress) {
		super();
		this.testId = testId;
		this.uId = uId;
		this.testType = testType;
		this.admin = admin;
		this.user = user;
		this.progress = progress;
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
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

	public Progress getProgress() {
		return progress;
	}

	public void setProgress(Progress progress) {
		this.progress = progress;
	}

	@Override
	public String toString() {
		return "SelfAssessment [testId=" + testId + ", uId=" + uId + ", testType=" + testType + ", admin=" + admin
				+ ", user=" + user + ", progress=" + progress + "]";
	}

	
}
	