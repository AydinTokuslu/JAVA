package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class Sifir_ile_3_arasinda_girilen_sayiyi_bulma {

	public static void main(String[] args) {
		// 0 ile 3 arasinda girilen sayiyı bulma
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 0 ile 3 arasinda bir sayi giriniz");
		int sayi=scan.nextInt();
		
		switch(sayi) {
		
		case 0:
			System.out.println("girdiginiz sayi 0‘dir");
			break;
		case 1:
			System.out.println("girdiginiz sayi 1‘dir");
			break;
		case 2:
			System.out.println("girdiginiz sayi 2‘dir");
			break;
		case 3:
			System.out.println("girdiginiz sayi 3‘tur");
			break;
		default:
			System.out.println("yanlis sayi girdiniz");
			
			
		
		}
		
		

	}

}
