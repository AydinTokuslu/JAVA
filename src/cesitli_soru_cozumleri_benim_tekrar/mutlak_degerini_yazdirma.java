package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class mutlak_degerini_yazdirma {

	public static void main(String[] args) {
		/*Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak icin bir program yazin.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		if(sayi>0){
			System.out.println("girdiginiz sayinin mutlak degeri : "+ sayi);
		}else if(sayi<0){
			System.out.println("girdiginiz sayinin mutlak degeri : "+ (-sayi));
		}else {
			System.out.println("girdiginiz sayi 0‘dir : "+ sayi);
		}

	}

}
