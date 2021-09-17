package day17_Temmuz_15_2021_dersi_nested_for_loop_while_loop;

import java.util.Scanner;

public class while_loop_soru_7 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve 
		// bu sayinin rakamlari toplamini yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen pozitif bir tamsayi girin");
		int sayi=scan.nextInt();
		
		/*int i= sayi;
		int rakamlarToplami=0;
		int rakam=0;
		
		while(i>0) {
			rakam=i%10;
			rakamlarToplami+=rakam;
			i/=10;
			
		}
		
		System.out.println("girdiginiz " + sayi+" sayisinin rakamlar toplami : " + rakamlarToplami);*/
		
		
		scan.close();
		int i=sayi;
		int rakam=0;
		int rakamlarToplami=0;
		
		while(i>0) {
			rakam=i%10;
			rakamlarToplami+=rakam;
			i/=10;
		}
		
	}

}
