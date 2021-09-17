package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class not_ortalaması_hesaplama {

	public static void main(String[] args) {
		/*
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("vize notunuzu giriniz");
		int vize=scan.nextInt();
		
		System.out.println("final notunuzu giriniz");
		int finall=scan.nextInt();
		
		System.out.println("vize not oraninizi giriniz");
		int vize_oran=scan.nextInt();
		
		System.out.println("final not oraninizi giriniz");
		int finall_oran=scan.nextInt();
		
		double not_ortalama=(vize*vize_oran/100)+(finall*finall_oran/100);
		
		if(not_ortalama>=50) {
			System.out.println("Tebrikler dersi başarı ile geçtiniz..., ortalamaniz : "+ not_ortalama);
		}else {
			System.out.println("Malesef dersten kaldınız..., ortalamaniz : "+ not_ortalama);
		}
		
		

	}

}
