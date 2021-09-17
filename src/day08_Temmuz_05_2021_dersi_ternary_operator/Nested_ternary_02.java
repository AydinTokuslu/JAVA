package day08_Temmuz_05_2021_dersi_ternary_operator;

import java.util.Scanner;

public class Nested_ternary_02 {

	public static void main(String[] args) {
		// Soru4 ) Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, 
		//girilen degerlere  gore dikdorgenin kare olup olmadigini yazdirin.

		Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz");
        
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        
        System.out.println(sayi1<=0 || sayi2<=0 ? "Lutfen gecerli uzunluk giriniz" : 
            sayi1==sayi2 ? "Kare" : "Kare degil") ;
        scan.close();
		
	}

}
