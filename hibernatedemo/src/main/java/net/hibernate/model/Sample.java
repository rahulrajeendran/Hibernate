package net.hibernate.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Sample {
	
	public static void main(String[] args) {
		Student obj=new Student();
		obj.setId(100);
		obj.setFname("Abhi");
		obj.setLname("s");
		obj.setEmail("abc@gmail.com");
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf=con.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction ts=ss.beginTransaction();
		ss.save(obj);
		ts.commit();
	}
}
