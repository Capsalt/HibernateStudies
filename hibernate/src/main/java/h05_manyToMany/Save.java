package h05_manyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Save {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Mirascilar.class).addAnnotatedClass(Arsalar.class);
			
			SessionFactory sf = con.buildSessionFactory();
			
			Session s = sf.openSession();
			
			Transaction tx =s.beginTransaction();
			
			
			
			Arsalar denizli = new Arsalar(11, "Denizli");
			
			Arsalar istanbul = new Arsalar(22, "İstanbul");
			
			Arsalar maras = new Arsalar(33, "Maraş");
			
			
			Mirascilar m1 = new Mirascilar(101, "Ali", 25);
			
			Mirascilar m2 = new Mirascilar(102, "Veli", 32);
			
			Mirascilar m3 = new Mirascilar(103, "Ayşe", 34);
			
			
			m1.getArsaListesi().add(denizli);
			
			m1.getArsaListesi().add(istanbul);
			
			m1.getArsaListesi().add(maras);
			
			m2.getArsaListesi().add(denizli);
			
			m3.getArsaListesi().add(istanbul);
			
			m3.getArsaListesi().add(maras);
			
			denizli.setMirasciListesi(denizli.getMirasciListesi());
			
			istanbul.setMirasciListesi(istanbul.getMirasciListesi());
			
			maras.setMirasciListesi(maras.getMirasciListesi());
			
			s.save(m1);
			s.save(m2);
			s.save(m3);
			
			s.save(denizli);
			s.save(istanbul);
			s.save(maras);
			
			tx.commit();
			
			
			sf.close();
			s.close();
			

	}

}
