package day36_Agustos_09_2021_dersi_inheritance01;

public class Isci extends Muhasebe{

	public static void main(String[] args) {
		
		Isci i1=new Isci(); 
		
		i1.isim="Cumali";
		i1.soyisim="Korkmaz";
		i1.adres="falan fesmekan";
		i1.saatUcreti=10;
		i1.statü="chief";
		i1.tel="12345";
		i1.id=i1.idAta();
		i1.maas=i1.maasHesapla();
		System.out.println("isim : "+i1.isim + "\n" + "soyadi : "+i1.soyisim+  "\n" +"tel no : "+i1.tel+ "\n" +"adresi : " + i1.adres + "\n" + "saat ucretiniz : "+i1.saatUcreti + " tl"+ "\n" +"id numaraniz : "+i1.id + "\n" + "bu ay ki maasiniz : "+i1.maas+" tl‘dir.");
		
		Isci i2=new Isci();
		
		i2.isim="Aydin";
		i2.soyisim="Tokuslu";
		i2.adres="falan2 fesmekan2";
		i2.saatUcreti=15;
		i2.statü="head of department";
		i2.tel="23456";
		i2.id=i2.idAta();
		i2.maas=i2.maasHesapla();
		
		System.out.println("");
		System.out.println("isim : "+i2.isim + "\n" + "soyadi : "+i2.soyisim+  "\n" +"tel no : "+i2.tel+ "\n" +"adresi : " + i2.adres + "\n" + "saat ucretiniz : "+i2.saatUcreti + " tl"+ "\n" +"id numaraniz : "+i2.id + "\n" + "bu ay ki maasiniz : "+i2.maas+" tl‘dir.");
		
		

	}

}
