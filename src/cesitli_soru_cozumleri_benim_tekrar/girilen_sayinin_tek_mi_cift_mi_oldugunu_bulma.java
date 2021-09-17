package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class girilen_sayinin_tek_mi_cift_mi_oldugunu_bulma {

	public static void main(String[] args) {
		// girilen sayinin tek mi cift mi oldugunu bulma
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		if(sayi%2==0) {
			System.out.println("girdiginiz sayi cift sayidir.");
		}else {
			System.out.println("girdiginiz sayi tek sayidir.");
		}
		
		
	}

}
