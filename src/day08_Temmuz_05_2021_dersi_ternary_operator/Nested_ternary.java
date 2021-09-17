package day08_Temmuz_05_2021_dersi_ternary_operator;

import java.util.Scanner;

public class Nested_ternary {

	public static void main(String[] args) {
	// Kullanicidan bir tamsayi alin ve sayi 10’dan kucukse “Rakam” , 
	//100’den kucukse “iki basamakli sayi”degilse “uc basamakli veya 
		//daha buyuk sayi” yazdirin

		Scanner scan = new Scanner(System.in);
		
		System.out.println("lütfen bir tam sayı giriniz");
		
		int sayi= scan.nextInt();
		
		System.out.println(sayi<10 ? "Rakam" : (sayi<100 ? "iki basamaklı sayi" : "üç basamaklı sayi"));
		
		scan.close();
		
	}

}
