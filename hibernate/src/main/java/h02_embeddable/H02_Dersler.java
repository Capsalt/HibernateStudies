package h02_embeddable;

import javax.persistence.Embeddable;

@Embeddable
public class H02_Dersler {
	
	
	private String secmeli;
	private String zorunlu;
	
	
	public H02_Dersler() {
		
	}
	
	public String getSecmeli() {
		return secmeli;
	}
	public void setSecmeli(String secmeli) {
		this.secmeli = secmeli;
	}
	public String getZorunlu() {
		return zorunlu;
	}
	public void setZorunlu(String zorunlu) {
		this.zorunlu = zorunlu;
	}

	public H02_Dersler(String secmeli, String zorunlu) {
		this.secmeli = secmeli;
		this.zorunlu = zorunlu;
	}

	@Override
	public String toString() {
		return "H02_Dersler [secmeli=" + secmeli + ", zorunlu=" + zorunlu + "]";
	}
	
	

}
