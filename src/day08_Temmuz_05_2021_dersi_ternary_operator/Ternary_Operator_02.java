package day08_Temmuz_05_2021_dersi_ternary_operator;

import java.util.Scanner;

public class Ternary_Operator_02 {

	public static void main(String[] args) {
	
		
		//	Soru1 ) Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

		Scanner scan = new Scanner(System.in);
		
		/*	System.out.print("lütfen iki sayı giriniz");
		
		
		double sayi1= scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		System.out.println(sayi2<sayi1 ? sayi2 : sayi1);
		
		*/
		
	// kullanıcıdan bir sayı alın ve sayının mutlak değerini ternary ile yazdırın
		
		/* System.out.print("lütfen bir sayı giriniz");
		
		double sayi3= scan.nextDouble();
		
		System.out.println(sayi3>0 ?  sayi3 : (-1*sayi3)); */
		
	// if ile yapmak isteseydik
       
		System.out.print("lütfen bir sayı giriniz");
		
		double sayi4= scan.nextDouble();
		
		if (sayi4>=0) {
            System.out.println("girdiginiz sayinin mutlak degeri : " + sayi4);
        } else {
            System.out.println("girdiginiz sayinin mutlak degeri : " + -sayi4);
	
		scan.close();
		
		
	}

	}
}
