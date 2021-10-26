package h04_oneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;

@Entity
@Table(name="ogrenciler1")
 public class Ogrenci {
	
	@Id
	private int ogrId;
	
	private String ogrAd;
	
	private int ogrNot;
	
	@OneToMany(mappedBy="ogrenci" )
	
	private List <Kitap> kitapListesi = new ArrayList<>();
	
	
	public Ogrenci() {
	
	}
	
	public Ogrenci(int ogrId, String ogrAd, int ogrNot) {
		this.ogrId = ogrId;
		this.ogrAd = ogrAd;
		this.ogrNot = ogrNot;
	}

	public int getOgrId() {
		return ogrId;
	}

	public void setOgrId(int ogrId) {
		this.ogrId = ogrId;
	}

	public String getOgrAd() {
		return ogrAd;
	}

	public void setOgrAd(String ogrAd) {
		this.ogrAd = ogrAd;
	}

	public int getOgrNot() {
		return ogrNot;
	}

	public void setOgrNot(int ogrNot) {
		this.ogrNot = ogrNot;
	}

	public List<Kitap> getKitapListesi() {

		return kitapListesi;
	}

	public void setKitapListesi(List<Kitap> kitapListesi) {
		this.kitapListesi = kitapListesi;
	}


	@Override
	public String toString() {
		return "Ogrenci ogrId=" + ogrId + ", ogrAd=" + ogrAd + ", ogrNot=" + ogrNot + ", kitapListesi="
				+ kitapListesi + "]";
	}
	
}