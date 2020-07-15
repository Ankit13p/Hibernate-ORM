package com.project.HibernatePract;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hibernate demo
 *
 */
public class App {
	public static void main(String[] args) {
		/*
		 * to store data
		 */
		ClientName cn = new ClientName();
		cn.setFname("Ankit");
		cn.setLname("Prajapati");

		Client c = new Client();
		c.setCid(101);
		c.setName(cn);
		c.setCompany("Oracle");

		/*
		 * to fetch data
		 */
		// Client c = null;

		Configuration con = new Configuration().configure().addAnnotatedClass(Client.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);
		Session s = sf.openSession();

		Transaction tran = s.beginTransaction();
		s.save(c); // to save data in db

		// c = (Client) s.get(Client.class, 101); // to fetch data from db
		tran.commit();
		System.out.println(c);

	}
}
