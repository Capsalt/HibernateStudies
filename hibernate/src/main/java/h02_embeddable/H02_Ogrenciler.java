package h02_embeddable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ogrenciler")
public class H02_Ogrenciler {
	
	@Id
	private int ogrId;
	
	private String ogrAd;
	
	private int ogrNot;
	
	private H02_Dersler dersler;
	
	public H02_Ogrenciler() {
		
	}

	public H02_Ogrenciler(int ogrId, String ogrAd, int ogrNot, H02_Dersler dersler) {
		
		this.ogrId = ogrId;
		this.ogrAd = ogrAd;
		this.ogrNot = ogrNot;
		this.dersler = dersler;
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

	public H02_Dersler getDersler() {
		return dersler;
	}

	public void setDersler(H02_Dersler dersler) {
		this.dersler = dersler;
	}

	@Override
	public String toString() {
		return "H02_Ogrenciler [ogrId=" + ogrId + ", ogrAd=" + ogrAd + ", ogrNot=" + ogrNot + ", dersler=" + dersler
				+ "]";
	}
	
	
	

}
