package day36_Agustos_09_2021_dersi_inheritance01;

public class Memur extends Muhasebe{

	public static void main(String[] args) {
		Memur m1=new Memur(); 
			
		m1.isim="Cumali";
		m1.soyisim="Korkmaz";
		m1.adres="falan fesmekan";
		m1.saatUcreti=20;
		m1.statü="chief";
		m1.tel="12345";
		m1.id=m1.idAta();
		m1.maas=m1.maasHesapla();
		System.out.println("isim : "+m1.isim + "\n" + "soyadi : "+m1.soyisim+  "\n" +"tel no : "+m1.tel+ "\n" +"adresi : " + m1.adres + "\n" + "saat ucretiniz : "+m1.saatUcreti + " tl"+ "\n" +"id numaraniz : "+m1.id + "\n" + "bu ay ki maasiniz : "+m1.maas+" tl‘dir.");
		
		Memur m2=new Memur(); 
		
		m2.isim="Aydin";
		m2.soyisim="Tokuslu";
		m2.adres="falan2 fesmekan2";
		m2.saatUcreti=25;
		m2.statü="head of department";
		m2.tel="23456";
		m2.id=m2.idAta();
		m2.maas=m2.maasHesapla();
		
		System.out.println("");
		System.out.println("isim : "+m2.isim + "\n" + "soyadi : "+m2.soyisim+  "\n" +"tel no : "+m2.tel+ "\n" +"adresi : " + m2.adres + "\n" + "saat ucretiniz : "+m2.saatUcreti + " tl"+ "\n" +"id numaraniz : "+m2.id + "\n" + "bu ay ki maasiniz : "+m2.maas+" tl‘dir.");
		
		
	}
	
	
	
}
