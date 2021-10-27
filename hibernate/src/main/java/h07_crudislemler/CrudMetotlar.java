package h07_crudislemler;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CrudMetotlar {
	
	private static SessionFactory sf;
	
	public void sessionFactoryOlustur () {
		
		
		try {
			Configuration con = new Configuration().configure("hibernate.cfg.xml").
					addAnnotatedClass(Personel.class);
				
				sf = con.buildSessionFactory();
		} catch (Throwable e) {
			System.err.println("Session oluşurkekn hata oluştu" + e);
			
			throw new ExceptionInInitializerError();
		}
		
			
	}

	public void personelEkle(String ad, String soyAd, int maas) {
		
		Session s = sf.openSession();
		Transaction tx = null;
		
		try {
			
			tx = s.beginTransaction();
			Personel personel = new Personel(ad, soyAd, maas);
			s.save(personel);
			
			tx.commit();
			
			System.out.println("Personel Kaydoldu");
			
		} catch (HibernateException e) {
			if (tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();
			
		} finally {
			s.close();
			
		}
	}
	
	
	public void personelListele() {
		
		Session s = sf.openSession();
		Transaction tx = null;
		
		try {
			
			tx = s.beginTransaction();
			List<Personel> personeller = s.createQuery("FROM Personel").getResultList();
			
			personeller.stream().forEach((x)->System.out.println(x));
			
			tx.commit();
			
		} catch (HibernateException e) {
			if (tx!=null) {
				tx.rollback();
		}
			e.printStackTrace();
			
		}finally {
			s.close();
		}	
	}
	
	public void personelSil(Long id) {
		
		Session s = sf.openSession();
		Transaction tx = null;
		
		try {
			
			tx = s.beginTransaction();
			
			Personel personel = s.get(Personel.class, id);
			if (personel == null) {
				System.out.println("Personel bulunamadı");
			}else {
				s.delete(personel);
				tx.commit();
				System.out.println(personel + "Silindi");
			}				
		} catch (HibernateException e) {
			if (tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();
			
		} finally {
			s.close();
			
		}
	}
	
	public void maasGuncelle(Long id, int maas) {
		Session s = sf.openSession();
		Transaction tx = null;
		
		try {
			
			tx = s.beginTransaction();
			
			Personel personel = s.get(Personel.class, id);
			
			if (personel == null) {
				System.out.println("Personel bulunamadı");
			}else {
				personel.setMaas(maas);
				tx.commit();
				System.out.println("Maaş Güncellendi");
			}
							
		} catch (HibernateException e) {
			if (tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();
			
		} finally {
			s.close();
			
		}
		
		
	}
}

