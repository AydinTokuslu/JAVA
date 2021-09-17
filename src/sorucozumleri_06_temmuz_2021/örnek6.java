package sorucozumleri_06_temmuz_2021;

import java.util.Scanner;

public class örnek6 {

	public static void main(String[] args) {
		
		/* ÖRNEK 5'İN FARKLI ÇÖZÜMÜ
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */  
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("vize1 notunuzu giriniz ");
		int v1=scan.nextInt();
		
		System.out.println("vize2 notunuzu giriniz ");
		int v2=scan.nextInt();
		
		System.out.println("final notunuzu giriniz ");
		int finall=scan.nextInt();
		
		System.out.println("vize hesaplama oranını giriniz ");
		double vO=scan.nextDouble();
		
		System.out.println("final hesaplama oranını giriniz ");
		double fO=scan.nextDouble();
		
		double not_ortalama=((v1+v2)/2*vO/100)+(finall+fO/100);
		
		if (not_ortalama<50) {
			System.out.println("Malesef dersten kaldınız, not ortalamanız : " + not_ortalama);
		} else {
			System.out.println("Tebrikler dersi başarı ile geçtiniz. Not ortalamanız :" + not_ortalama);
		}
		
		
		
		
		
		
		

	}

}
