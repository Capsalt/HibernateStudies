package h03_oneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "gunlukler")
public class Gunluk {
	
	@Id
	private int id;
	
	private String yazilar;
	
	
	@OneToOne
	@JoinColumn(name = "kisi_id")
	private Kisi kisi;
	
	
	public Gunluk () {
		
	}


	public Gunluk(int id, String yazilar) {
		this.id = id;
		this.yazilar = yazilar;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getYazilar() {
		return yazilar;
	}


	public void setYazilar(String yazilar) {
		this.yazilar = yazilar;
	}


	public Kisi getKisi() {
		return kisi;
	}


	public void setKisi(Kisi kisi) {
		this.kisi = kisi;
	}


	@Override
	public String toString() {
		return "Gunluk [id=" + id + ", yazilar=" + yazilar + ", kisi=" + kisi + "]";
	}

}
