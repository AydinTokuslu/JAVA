package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class dort_islem_yaptirma {

	public static void main(String[] args) {
		/*
		 * Kuulanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen iki adet sayi giriniz ve 1nci sayi girisinden sonra ENTER‘a basiniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("yapmak istediginiz dort islemi seciniz,\n toplama icin 1\n cikarma icin 2\n carpma icin 3\n bolme icin 4");
		int dortislem=scan.nextInt();
		
		switch(dortislem) {
		case 1:
		System.out.println("sectiginiz toplama isleminin sonucu : " +(sayi1+sayi2));
		break;
		case 2:
			System.out.println("sectiginiz cikarma isleminin sonucu : " +(sayi1-sayi2));
			break;
		case 3:
			System.out.println("sectiginiz carpma isleminin sonucu : " +(sayi1*sayi2));
			break;
		case 4:
			System.out.println("sectiginiz bolme isleminin sonucu : " +(sayi1/sayi2));
			break;
		default:
		System.out.println("yanlis islem sectiniz");
		
		}
			
				
		
		

	}

}
