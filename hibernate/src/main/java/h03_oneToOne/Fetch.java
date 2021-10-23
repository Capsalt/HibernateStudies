package h03_oneToOne;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Fetch {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Kisi.class).addAnnotatedClass(Gunluk.class);
			
			SessionFactory sf = con.buildSessionFactory();
			
			Session s = sf.openSession();
			
			Transaction tx =s.beginTransaction();
			
			System.out.println(s.get(Kisi.class, 102));
			
			System.out.println(s.get(Gunluk.class, 2));
			
			System.out.println();
			
			
			String sorgu= "SELECT k.kisiAd  , g.yazilar , k.kisiYas "
			 		+ "FROM kisiler k INNER JOIN gunlukler g ON k.kisiId=g.kisi_id "  ;    
			               
			   @SuppressWarnings("unchecked")
			List <Object[]> sonucList= s.createSQLQuery(sorgu).getResultList();    
			               
			               for( Object[]  w:sonucList) {
			            	   System.out.println("sql "+Arrays.toString(w));
			               }
			               
			               
			String sorgu1="SELECT k.kisiAd,  g.yazilar, k.kisiYas "
			               		+ " FROM Kisi k JOIN Gunluk g ON k.kisiId=g.kisi" ; 
			                          
			    @SuppressWarnings("unchecked")
				List <Object[]> sonucList1= s.createQuery(sorgu1).getResultList();    
			               
			               for( Object[]  w1:sonucList1) {
			            	   System.out.println("hql "+Arrays.toString(w1));
			               }      
			
			tx.commit();
			
			
			sf.close();
			s.close();

	}

}
