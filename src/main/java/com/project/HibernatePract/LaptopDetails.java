package com.project.HibernatePract;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LaptopDetails {

	@Id
	private int lid;
	private String brand;
	private int price;
	@ManyToOne
	private LaptopUser user;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LaptopUser getUser() {
		return user;
	}

	public void setUser(LaptopUser user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "LaptopDetails [lid=" + lid + ", brand=" + brand + ", price=" + price + ", user=" + user + "]";
	}

}
