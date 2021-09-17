package sorucozumleri_16_agustos_2021_inheritance4;

public class Calisan {

	
	
	
	String isim;
	int maas;
	String departman;
	
	public Calisan(String isim, int maas, String departman) {
		
		this.isim = isim;
		this.maas = maas;
		this.departman = departman;
		
	}

	public void BilgileriGoster() {
		System.out.println("isim: "+ isim);
		System.out.println("maas : " +maas);
		System.out.println("departman : "+ departman);
	}
	
	
	
	
}
