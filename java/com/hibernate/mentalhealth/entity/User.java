package com.hibernate.mentalhealth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {

	@Id
	private int uId;
	@Column (name="user_name")
	private String uName;
	@Column (name="user_email")
	private String uEmail;
	@Column (name="user_pass")
	private String uPassword;
	
	@ManyToOne
	private Admin admin; 
	@OneToMany
	private SelfAssessment test;
	@OneToOne
	private Progress progress;
	@OneToMany
	private ComminitySupport comminitySupport;
	@OneToMany
	private EducationalResources resources;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int uId, String uName, String uEmail, String uPassword, Admin admin, SelfAssessment test,
			Progress progress, ComminitySupport comminitySupport, EducationalResources resources) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uEmail = uEmail;
		this.uPassword = uPassword;
		this.admin = admin;
		this.test = test;
		this.progress = progress;
		this.comminitySupport = comminitySupport;
		this.resources = resources;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public SelfAssessment getTest() {
		return test;
	}

	public void setTest(SelfAssessment test) {
		this.test = test;
	}

	public Progress getProgress() {
		return progress;
	}

	public void setProgress(Progress progress) {
		this.progress = progress;
	}

	public ComminitySupport getComminitySupport() {
		return comminitySupport;
	}

	public void setComminitySupport(ComminitySupport comminitySupport) {
		this.comminitySupport = comminitySupport;
	}

	public EducationalResources getResources() {
		return resources;
	}

	public void setResources(EducationalResources resources) {
		this.resources = resources;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uEmail=" + uEmail + ", uPassword=" + uPassword + ", admin="
				+ admin + ", test=" + test + ", progress=" + progress + ", comminitySupport=" + comminitySupport
				+ ", resources=" + resources + "]";
	}
	
}
