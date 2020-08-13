package com.project.HibernatePract;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity(name = "client_data") // create specific mentioned entity
// or @Entity -> defult entity will be class name

@Entity
// @Table(name = "client_data")
public class Client {

	@Id
	private int cid;
	// @Transient // it will not store name data in table
	private ClientName name;
	// @Column(name = "company_name") // to change column name from company to
	// company_name
	private String company;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public ClientName getName() {
		return name;
	}

	public void setName(ClientName name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Client [cid=" + cid + ", name=" + name + ", company=" + company + "]";
	}

}
