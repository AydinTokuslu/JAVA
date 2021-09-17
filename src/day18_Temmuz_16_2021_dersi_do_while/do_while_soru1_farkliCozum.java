package day18_Temmuz_16_2021_dersi_do_while;

import java.util.Scanner;

public class do_while_soru1_farkliCozum {

	public static void main(String[] args) {
		// Kullanicidan iki pozitif sayi isteyin 
        // kullanici negatif sayi girdiginde 
        // girilen negatif sayilari yok sayip, yeniden deger isteyin
        // kullanici dogru giris yaptiginda "well done" ve sayilarin carpini yazdirin 
        
        
        
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen iki pozitif tamsayi giriniz");
        
        int sayi1=5;
        int sayi2=10;
        
        
        do {
            
            sayi1=scan.nextInt();
            sayi2=scan.nextInt();
            if (sayi1>0 && sayi2>0) {
                System.out.println("well done \ngirilen sayilarin carpimi : " + (sayi1*sayi2));
            } else {
                System.out.println("lutfen pozitif iki sayi giriniz");
            }
            
        } while (sayi1<0 || sayi2<0);
        

	}

}
