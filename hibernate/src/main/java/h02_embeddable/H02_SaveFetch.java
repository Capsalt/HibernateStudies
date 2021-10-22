package h02_embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class H02_SaveFetch {

	public static void main(String[] args) {
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(H02_Ogrenciler.class);
			
			SessionFactory sf = con.buildSessionFactory();
			
			Session s = sf.openSession();
			
			Transaction tx =s.beginTransaction();
			
			
			H02_Dersler ders1 = new H02_Dersler("muzik","matematik");
			
			H02_Ogrenciler ogrenci1 = new H02_Ogrenciler(1, "Ali", 80, ders1);
			
			s.save(ogrenci1);
			
			tx.commit();
			
			sf.close();
			s.close();

	}

}
