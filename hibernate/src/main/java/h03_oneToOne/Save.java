package h03_oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Save {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Kisi.class).addAnnotatedClass(Gunluk.class);
			
			SessionFactory sf = con.buildSessionFactory();
			
			Session s = sf.openSession();
			
			Transaction tx =s.beginTransaction();
			
			
			Gunluk gunluk1 = new Gunluk(1, "Alinin Günlüğü");
			Gunluk gunluk2 = new Gunluk(2, "Velinin Günlüğü");
			Gunluk gunluk3 = new Gunluk(3, "Ayşenin Günlüğü");
			
			Kisi kisi1 = new Kisi(101, "Ali", 23);
			Kisi kisi2 = new Kisi(102, "Veli", 28);
			Kisi kisi3 = new Kisi(103, "Ayşe", 34);
			
			gunluk1.setKisi(kisi1);
			gunluk2.setKisi(kisi2);
			gunluk3.setKisi(kisi3);
			
			s.save(gunluk1);
			s.save(gunluk2);
			s.save(gunluk3);
			s.save(kisi1);
			s.save(kisi2);
			s.save(kisi3);
			
			
			tx.commit();
			
			sf.close();
			s.close();
			

	}

}
