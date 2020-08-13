package com.project.HibernatePract;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class LaptopUser {

	@Id
	private int luid;
	private String name;
	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private Collection<LaptopDetails> ld = new ArrayList<LaptopDetails>();

	public int getLuid() {
		return luid;
	}

	public void setLuid(int luid) {
		this.luid = luid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<LaptopDetails> getLd() {
		return ld;
	}

	public void setLd(Collection<LaptopDetails> ld) {
		this.ld = ld;
	}

	@Override
	public String toString() {
		return "LaptopUser [luid=" + luid + ", name=" + name + ", ld=" + ld + "]";
	}

}
