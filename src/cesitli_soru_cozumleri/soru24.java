package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru24 {

	public static void main(String[] args) {
		/*
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen vize notunuzu giriniz:");
		int vize=scan.nextInt();
		
		System.out.println("Lütfen final notunuzu giriniz:");
		int final_not=scan.nextInt();

		System.out.println("Lütfen vize oran yuzdesini giriniz:");
		double vize_oran=scan.nextInt();
		
		System.out.println("Lütfen final oran yuzdesini giriniz:");
		double final_oran=scan.nextInt();
		
		double ortalama=(vize*vize_oran/100) + (final_not*final_oran/100);
		
		if(ortalama>=50) {
			System.out.println("Tebrikler dersi başarı ile geçtiniz... Not ortalamaniz :" + ortalama);
		}else {
			System.out.println("Malesef dersten kaldınız...Not ortalamaniz :" + ortalama);
		}
		
		scan.close();
		

	}

}
