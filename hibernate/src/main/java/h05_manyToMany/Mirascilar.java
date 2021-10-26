package h05_manyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Mirascilar")
public class Mirascilar {
	
	@Id
	private int tc;
	
	private String isim;
	
	private int yas;
	
	@ManyToMany
	@JoinTable(
			name = "BirlesenTablo",
			joinColumns = {@JoinColumn(name="m_id")},
			inverseJoinColumns= {@JoinColumn(name = "a_id")}
			)
	private List<Arsalar> arsaListesi = new ArrayList<>();

	
	public Mirascilar() {
		
	}
	
	public Mirascilar(int tc, String isim, int yas) {
		
		this.tc = tc;
		this.isim = isim;
		this.yas = yas;
	}

	public int getTc() {
		return tc;
	}

	public void setTc(int tc) {
		this.tc = tc;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public List<Arsalar> getArsaListesi() {
		return arsaListesi;
	}

	public void setArsaListesi(List<Arsalar> arsaListesi) {
		this.arsaListesi = arsaListesi;
	}

	@Override
	public String toString() {
		return "Mirascilar [tc=" + tc + ", isim=" + isim + ", yas=" + yas + ", arsaListesi=" + arsaListesi + "]";
	}
	
	
	

}
