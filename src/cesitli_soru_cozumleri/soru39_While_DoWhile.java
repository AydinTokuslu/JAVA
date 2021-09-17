package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru39_While_DoWhile {

	public static void main(String[] args) {
		/*  Problem Tanımı
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.
        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6
        Faktöriyeli: 720
        Bir sayı giriniz: 3
        Faktöriyeli 6
     */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int faktoriyel=1;
		while(sayi!=0) {
			faktoriyel*=sayi;
			sayi--;
					
			
		}
		
		System.out.println("girdiginiz sayinin faktoriyeli : " + faktoriyel);
		

	}

}
