package sorucozumleri_06_temmuz_2021;

import java.util.Scanner;

public class örnek2 {

	public static void main(String[] args) {
		 /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
		
		/* Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 3 tam sayı giriniz, her sayıdan sonra ENTER'a basınız: ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        
        
        System.out.println(((a*a)-(b*b)/(c*3))*((a*a)-(b*b)/(c*3)));*/
		
		
		Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen a sayısını giriniz");
		int a = scan.nextInt();
		
		System.out.println("Lütfen b sayısını giriniz");
		int b = scan.nextInt();
		
		System.out.println("Lütfen c sayısını giriniz");
		int c = scan.nextInt();
		
		double sonuc = ((a*a)-(b*b))/(3*c);
		
		System.out.println("işleminizin sonucu : " + sonuc);
		
		
	}

}
