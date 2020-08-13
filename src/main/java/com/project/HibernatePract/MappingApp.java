package com.project.HibernatePract;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MappingApp {

	public static void main(String[] args) {

		Laptop l = new Laptop();
		l.setLid(101);
		l.setLname("Dell");

		Student st = new Student();
		st.setRollno(1);
		st.setName("Ankit");
		st.setMarks(45);
		// st.setLaptop(l);
		st.getLaptop().add(l);

		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);
		Session s = sf.openSession();

		Transaction tran = s.beginTransaction();
		s.save(l); // to save data in db
		s.save(st);

		tran.commit();

	}

}
