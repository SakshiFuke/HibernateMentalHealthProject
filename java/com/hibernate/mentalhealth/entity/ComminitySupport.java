package com.hibernate.mentalhealth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ComminitySupport {
	@Id
	private int csId;
	@Column (name="supporter_name")
	private int csName;
	@Column (name="cs_Designation")
	private int csDesign;
	
	@ManyToOne
	private Admin admin; 
	@ManyToOne
	private User user;
	
	public ComminitySupport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComminitySupport(int csId, int csName, int csDesign, Admin admin, User user) {
		super();
		this.csId = csId;
		this.csName = csName;
		this.csDesign = csDesign;
		this.admin = admin;
		this.user = user;
	}

	public int getCsId() {
		return csId;
	}

	public void setCsId(int csId) {
		this.csId = csId;
	}

	public int getCsName() {
		return csName;
	}

	public void setCsName(int csName) {
		this.csName = csName;
	}

	public int getCsDesign() {
		return csDesign;
	}

	public void setCsDesign(int csDesign) {
		this.csDesign = csDesign;
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
		return "ComminitySupport [csId=" + csId + ", csName=" + csName + ", csDesign=" + csDesign + ", admin=" + admin
				+ ", user=" + user + "]";
	}
	
}
