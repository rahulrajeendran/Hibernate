package sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mngtb {
	public static void main(String[] args) {
		Mangr ob=new Mangr();
		ob.setName("Abinand");
		ob.setBrnch("Distribution");
		ob.setSalary(100000);
		Configuration co=new Configuration().configure().addAnnotatedClass(Mangr.class);
		SessionFactory sf=co.buildSessionFactory();
		Session s=sf.openSession();
		Transaction ts=s.beginTransaction();
		s.save(ob);
		ts.commit();
	}

}
