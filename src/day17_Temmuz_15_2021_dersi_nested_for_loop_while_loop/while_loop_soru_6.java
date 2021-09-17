package day17_Temmuz_15_2021_dersi_nested_for_loop_while_loop;

import java.util.Scanner;

public class while_loop_soru_6 {

	public static void main(String[] args) {
		// Kullanicidan baslangic ve bitis haflerini alin ve 
		// baslangic harfinden baslayip bitis harfinde biten 
		// tum harfleri buyuk harf olarak ekrana yazdirin. 
		// Kullanicinin hata yapmadigini farz edin.

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen ilk harfi giriniz");
		char ilkHarf = scan.next().toUpperCase().charAt(0);
		
		System.out.println("lutfen son harfi giriniz");
		char sonHarf = scan.next().toUpperCase().charAt(0);
		
		char harf=ilkHarf;
		
		while(harf<= sonHarf) {
			System.out.print(harf + " ");
			harf+=1;
		}
		
		
		
		
		
		
		
	}

}
