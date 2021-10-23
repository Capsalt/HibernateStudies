package h04_oneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "kitaplar")
public class Kitap {
	
	@Id
	private int id;
	
	private String isim;
	
	
	@ManyToOne
	@JoinColumn(name="ogrfiyat")
	private Ogrenci ogrenci;

	
	public Kitap() {
		
	}
	
	public Kitap(int id, String isim) {
		
		this.id = id;
		this.isim = isim;
	}

	public int getId() {
		return id;
	}

	public void setFiyat(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}

	@Override
	public String toString() {
		return "Kitap [id=" + id + ", isim=" + isim + "]";
	}

}
