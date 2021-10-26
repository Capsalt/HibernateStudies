package h05_manyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Arsalar")
public class Arsalar {
	
	@Id
	private int arsaNo;
	
	private String sehir;
	
	@ManyToMany(mappedBy = "arsaListesi")
	private List<Mirascilar> mirasciListesi = new ArrayList<>();

	
	public Arsalar() {
		
	}
	
	
	public Arsalar(int arsaNo, String sehir) {
		
		this.arsaNo = arsaNo;
		this.sehir = sehir;
	}


	public int getArsaNo() {
		return arsaNo;
	}


	public void setArsaNo(int arsaNo) {
		this.arsaNo = arsaNo;
	}


	public String getSehir() {
		return sehir;
	}


	public void setSehir(String sehir) {
		this.sehir = sehir;
	}


	public List<Mirascilar> getMirasciListesi() {
		return mirasciListesi;
	}


	public void setMirasciListesi(List<Mirascilar> mirasciListesi) {
		this.mirasciListesi = mirasciListesi;
	}


	@Override
	public String toString() {
		return "Arsalar [arsaNo=" + arsaNo + ", sehir=" + sehir + "]";
	}

}
