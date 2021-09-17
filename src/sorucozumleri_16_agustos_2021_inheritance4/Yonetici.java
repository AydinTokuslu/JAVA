package sorucozumleri_16_agustos_2021_inheritance4;

public class Yonetici extends Calisan{

	
	
	public Yonetici(String isim, int maas, String departman) {
		super(isim, maas, departman);
		
	}

	public void zamMiktari(int zam) {
		System.out.println("yapilacak zam miktari :" + zam);
	}
}
