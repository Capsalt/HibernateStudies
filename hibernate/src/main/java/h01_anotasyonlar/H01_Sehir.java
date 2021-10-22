package h01_anotasyonlar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//================================================================
//HIBERNATE ICIN TABLO TANIMLAMASININ YAPILMASI 
//tablo oluşturabilmek için içerik hazırlama )alttakiler)
//POJO: Plain Old Java Object									
//1) Private degiskenler tanimlanir.
//2) constructor olusturulur.
//3) Getter ve Setter metotlar tanimlanir.
//4) toString() metodu ile nesne yazdirilabilir hale getirilir.
//================================================================
/*
	Bir Class Hibernate ile tablo olusturmada kullanilacaksa degiskenlerin
	“final” veya “static” tanimlanMAMAsi gerekir. 
*/
//- @Entity anotasyonu bu class’ın bir tabloya donusturulmesi
//gerektigini Hibernate’e gosterir.(sql ortamına mapping yapıo uyarlıo,translate) Her bir degisken bir sutun olacaktir.
//- @Table annotasyonu tablo adinin degistirlmesini saglar.javada ve sql deki isimler aynı olmak zorunda değiliz
//- @Id anotasyonu tablo icerisinde primary key olusturur.
//- @Transient anotasyonu bir degiskenin (sutun) tabloda yer almayacagini gosterir.

@Entity
@Table(name="City")
public class H01_Sehir {
	
	@Id
	@Column(name="sehirPlaka")
	private int cityPlaka;
	
	private String sehirAd;
	
	public H01_Sehir() {
		
	}
	
	

	public H01_Sehir(int cityPlaka, String sehirAd) {
		this.cityPlaka = cityPlaka;
		this.sehirAd = sehirAd;
	}

	
	
	public int getCityPlaka() {
		return cityPlaka;
	}

	public void setCityPlaka(int cityPlaka) {
		this.cityPlaka = cityPlaka;
	}

	public String getSehirAd() {
		return sehirAd;
	}

	public void setSehirAd(String sehirAd) {
		this.sehirAd = sehirAd;
	}



	@Override
	public String toString() {
		return "H01_Sehir [cityPlaka=" + cityPlaka + ", sehirAd=" + sehirAd + "]";
	}
	

}
