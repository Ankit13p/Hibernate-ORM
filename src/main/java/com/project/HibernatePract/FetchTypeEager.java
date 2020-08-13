package com.project.HibernatePract;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class FetchTypeEager {

	public static void main(String[] args) {

		Configuration con = new Configuration().configure().addAnnotatedClass(LaptopUser.class)
				.addAnnotatedClass(LaptopDetails.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);
		Session s = sf.openSession();

		Transaction tran = s.beginTransaction();

		LaptopUser lu1 = (LaptopUser) s.get(LaptopUser.class, 102);
		System.out.println(lu1.getName());
//		/*
//		 * lazy fetch
//		 */
//		Collection<LaptopDetails> laps = lu1.getLd();
//		for (LaptopDetails l : laps)
//			System.out.println(l);
		tran.commit();

	}

}
