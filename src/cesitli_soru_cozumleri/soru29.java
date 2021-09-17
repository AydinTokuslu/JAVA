package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru29 {

	public static void main(String[] args) {
		/*Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak icin bir program yazin.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		if(sayi>0) {
			System.out.println("sayinizin mutlak degeri : " + sayi);
		}else {
			System.out.println("sayinizin mutlak degeri : " + -sayi);
		}
		
		
		
		

	}

}
