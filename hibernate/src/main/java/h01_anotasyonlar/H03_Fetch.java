package h01_anotasyonlar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class H03_Fetch {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
			addAnnotatedClass(H01_Sehir.class);
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tx =s.beginTransaction();
		
		
		
		System.out.println(s.get(H01_Sehir.class, 6));
		
		tx.commit();

	}

}
