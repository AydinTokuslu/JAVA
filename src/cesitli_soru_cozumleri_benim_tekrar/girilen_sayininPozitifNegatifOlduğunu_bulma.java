package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class girilen_sayininPozitifNegatifOlduğunu_bulma {

	//girilen sayinin Pozitif, Negatif, ya da 0 Olduğunu bulma
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		if(sayi>0) {
			System.out.println("girilen sayi pozitif bir sayidir");
		}else if(sayi<0) {
			System.out.println("girilen sayi negatif bir sayidir");
		}else {
			System.out.println("girilen sayi 0 sayisidir.");
		}
		
		
		
	}
	
}
