package sorucozumleri_06_temmuz_2021;

import java.util.Scanner;

public class cozum1_tekrar {

	public static void main(String[] args) {
		/*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13    
       kök almak için Math.sqrt(sayi) metodunu kullanınız 
         */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("lütfen dikdörgenin birinci dik kenarını giriniz : ");
		int kenar1=scan.nextInt();
		
		System.out.print("lütfen dikdörgenin ikinci dik kenarını giriniz : ");
		int kenar2=scan.nextInt();
		
		double h=Math.sqrt(kenar1*kenar1+kenar2*kenar2);
		
		System.out.println("hipotenus : " +h);

	}

}
