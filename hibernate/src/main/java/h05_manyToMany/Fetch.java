package h05_manyToMany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Fetch {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Mirascilar.class).addAnnotatedClass(Arsalar.class);
			
			SessionFactory sf = con.buildSessionFactory();
			
			Session s = sf.openSession();
			
			Transaction tx =s.beginTransaction();
			
			
			System.out.println(s.get(Arsalar.class, 22));
			
			System.out.println("-----------------------------------------");
			
			Object soru = s.createQuery("FROM Mirascilar m WHERE isim = 'Ali'").getSingleResult();
			
			System.out.println(soru);
			System.out.println("----------------------------------------------");
			
			List<Object[]> list = s.createQuery("SELECT sehir FROM Arsalar").getResultList();
			
			System.out.println(list);
			System.out.println("-------------------------------------------------------");
			
			
			
			tx.commit();
			
			sf.close();
			s.close();
			

	}

}
