package day15_Temmuz_13_2021_dersi_for_loop;

import java.util.Scanner;

public class Interview_Sorusu_soru9_for_loop {

	public static void main(String[] args) {
		//  Interview Question Kullanicidan 10’den kucuk bir sayi isteyin ve 
		// girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 10‘dan kucuk bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int faktoriyel=1;
		
		for(int i=1 ; i<=sayi ; i++) {
			faktoriyel*=i;
			
		}
		
		System.out.println(faktoriyel);
		
		
		
		
		

	}

}
