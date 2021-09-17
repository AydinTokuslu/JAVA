package day36_Agustos_09_2021_dersi_inheritance01;

public class Muhasebe extends Personel{

	public int saatUcreti;
	public String statü;
	public int maas;
	
	public int maasHesapla() {
		maas=saatUcreti*8*30;
		return maas;
	}
	
	
	
	
}
