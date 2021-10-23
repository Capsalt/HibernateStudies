package h04_oneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Save {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Ogrenci.class).addAnnotatedClass(Kitap.class);
			
			SessionFactory sf = con.buildSessionFactory();
			
			Session s = sf.openSession();
			
			Transaction tx =s.beginTransaction();
			
			
			Kitap k1 = new Kitap(1001, "mat kitabı");
			Kitap k2 = new Kitap(1002, "edeb kitabı");
			Kitap k3 = new Kitap(1003, "fizik kitabı");
			Kitap k4 = new Kitap(1004, "kimya kitabı");
			
			Ogrenci o1 = new Ogrenci(111, "Ali", 56);
			Ogrenci o2 = new Ogrenci(222, "Veli", 87);
			Ogrenci o3 = new Ogrenci(333, "Ayşe", 74);
			
			k1.setOgrenci(o1);
			k2.setOgrenci(o1);
			k3.setOgrenci(o2);
			k4.setOgrenci(o2);
			
			s.save(k1);
			s.save(k2);
			s.save(k3);
			s.save(k4);
			
			s.save(o1);
			s.save(o2);
			s.save(o3);
			
			tx.commit();
			
			sf.close();
			s.close();
			
	}

}
