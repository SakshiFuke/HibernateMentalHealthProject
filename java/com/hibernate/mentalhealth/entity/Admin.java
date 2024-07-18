package com.hibernate.mentalhealth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin {
	@Id
	private int aId;
	@Column (name="admin_name")
	private String aName;
	@Column (name="admin_email")
	private String aEmail;
	@Column (name="admin_pass")
	private String aPassword;
	
	@OneToMany
	private User user;
	@OneToMany
	private SelfAssessment test;
	@OneToMany
	private Progress progress;
	@OneToMany
	private ComminitySupport comminitySupport;
	@OneToMany
	private EducationalResources resources;
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int aId, String aName, String aEmail, String aPassword, User user, SelfAssessment test,
			Progress progress, ComminitySupport comminitySupport, EducationalResources resources) {
		super();
		this.aId = aId;
		this.aName = aName;
		this.aEmail = aEmail;
		this.aPassword = aPassword;
		this.user = user;
		this.test = test;
		this.progress = progress;
		this.comminitySupport = comminitySupport;
		this.resources = resources;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getaEmail() {
		return aEmail;
	}

	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}

	public String getaPassword() {
		return aPassword;
	}

	public void setaPassword(String aPassword) {
		this.aPassword = aPassword;
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
		return "Admin [aId=" + aId + ", aName=" + aName + ", aEmail=" + aEmail + ", aPassword=" + aPassword + ", user="
				+ user + ", test=" + test + ", progress=" + progress + ", comminitySupport=" + comminitySupport
				+ ", resources=" + resources + "]";
	}
	 
}
