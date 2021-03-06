package com.project.HibernatePract;

import javax.persistence.Embeddable;

@Embeddable
public class ClientName {
	private String fname;
	private String lname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "ClientName [fname=" + fname + ", lname=" + lname + "]";
	}

}
