package sorucozumleri_06_temmuz_2021;

import java.util.Scanner;

public class örnek5 {

	public static void main(String[] args) {
		
		/*
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */  
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("vize notunuzu giriniz ");
		int vize=scan.nextInt();
		
		System.out.println("final notunuzu giriniz ");
		int finall=scan.nextInt();
		
		double not_ortalama=(vize*0.3)+(finall*0.7);
		
		if (not_ortalama<50) {
			System.out.println("Malesef dersten kaldınız, not ortalamanız : " + not_ortalama);
		} else {
			System.out.println("Tebrikler dersi başarı ile geçtiniz. Not ortalamanız :" + not_ortalama);
		}
				
		
		

	}

}
