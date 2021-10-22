package h01_anotasyonlar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class H02_Save {
	public static void main(String[] args) {
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(H01_Sehir.class);
		
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction tx =s.beginTransaction();
		
		
		
		H01_Sehir city1 = new H01_Sehir(34, "İstanbul");
		H01_Sehir city2 = new H01_Sehir(35, "İzmir");
		H01_Sehir city3 = new H01_Sehir(6, "Ankara");
		H01_Sehir city4 = new H01_Sehir(1, "Adana");
		
		
		s.save(city1);
		s.save(city2);
		s.save(city3);
		s.save(city4);
		
		tx.commit();
		
		sf.close();
		s.close();
	
	}
}
