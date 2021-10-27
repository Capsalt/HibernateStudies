package h07_crudislemler;

public class Runner {

	public static void main(String[] args) {
		
		
		CrudMetotlar metod = new CrudMetotlar();
		metod.sessionFactoryOlustur();
		
		metod.personelEkle("Ali", "Veli", 5000);
		metod.personelEkle("Hasan", "Hüseyin", 6000);
		metod.personelEkle("Ayşe", "Fatma", 7000);
		
	
		metod.personelSil(7L);
		
		metod.personelSil(10L);
			
		metod.maasGuncelle(5L, 12000);

		metod.personelListele();

	}

}
