package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru23 {

	public static void main(String[] args) {
		 /*  Problem Tanımı
        Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.
    ipucu: her else komutundan sonra return; komutu kullanınız...
        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen günü giriniz:");
		int gun=scan.nextInt();
		
		System.out.println("Lütfen ayı giriniz:");
		int ay=scan.nextInt();

		System.out.println("Lütfen yıli giriniz:");
		int yil=scan.nextInt();
		
		if(gun>0 && gun<=31) {
			System.out.println(gun);
		}else {
			System.out.println("yanlis giris yaptiniz");
			return;
		}
		
		if(ay>0 && ay<=12) {
			System.out.println(ay);
		}else {
			System.out.println("yanlis giris yaptiniz");
			return;
		}
		
		if(yil>0) {
			System.out.println(yil);
		}else {
			System.out.println("yanlis giris yaptiniz");
			return;
		}
		System.out.println("Gün ay yıl: " + gun +"." + ay +"." + yil);
		System.out.println("Ay gün yıl: " + ay +"." + gun +"." + yil);
		System.out.println("Yıl ay gün: " + yil +"." + ay +"." + gun);
		
		scan.close();
	}

}
