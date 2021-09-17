package day15_Temmuz_13_2021_dersi_for_loop;

import java.util.Scanner;

public class soru5_for_loop {

	public static void main(String[] args) {
		// Kullanicidan 100’den kucuk bir tamsayi isteyin. 
		// 1’den baslayarak girilen sayiya kadar 3’un veya 5”in kati 
		// olan sayilari yazdirin.

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 100‘den kucuk pozitif bir sayi giriniz");
		int sayi=scan.nextInt();
		
		for(int i=1 ; i<sayi ; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				System.out.print(i + " ");
			}
			
		}
		System.out.println("");
		
		for(int i=1; i<sayi ; i++) {
			if(i%3==0 || i%5==0) {
				System.out.print(i+" ");
			}
		}
		
		scan.close();
		
		
		
		
	}

}
