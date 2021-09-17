package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class gecerliGunIsmiGirme {

	public static void main(String[] args) {
		/*Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun
		isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi
		gecerli degilse “Gecerli gun ismi giriniz” yazdirin*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("gun ismi giriniz ");
		String gun=scan.next().toLowerCase();
		
		switch(gun) {
		case "pazartesi":
			System.out.println("PAZartesi");
			break;
		case "sali":
			System.out.println("SALi");
			break;	
		case "carsamba":
			System.out.println("CARsamba");
			break;
		case "persembe":
			System.out.println("PERsembe");
			break;
		case "cuma":
			System.out.println("CUMa");
			break;
		case "cumartesi":
			System.out.println("CUMartesi");
			break;
		case "pazar":
			System.out.println("PAZar");
			break;
		default:
			System.out.println("Gecerli gun ismi giriniz");
		
		
		
		}
		
		
		
		

	}

}
