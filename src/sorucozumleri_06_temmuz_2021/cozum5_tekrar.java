package sorucozumleri_06_temmuz_2021;

import java.util.Scanner;

public class cozum5_tekrar {

	public static void main(String[] args) {
		/*
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */  
		
		Scanner scan=new Scanner(System.in);
		System.out.print("vize notunuzu giriniz : ");
		double vize=scan.nextDouble();
		
		System.out.print("final notunuzu giriniz : ");
		double finalnot=scan.nextDouble();
		
		System.out.print("vize notu katkı oranını giriniz : ");
		double vizekatki=scan.nextDouble();
		
		System.out.print("final notu katkı oranını giriniz : ");
		double finalkatki=scan.nextDouble();
		
		double ort= (vize*vizekatki)+(finalnot*finalkatki);
		
		if (50<=ort) {
			System.out.println("Tebrikler dersi başarı ile geçtiniz..., ortalamanız : " + ort);
		}else {
			System.out.println("Malesef dersten kaldınız..., ortalamanız :" + ort);
		}
		

	}

}
