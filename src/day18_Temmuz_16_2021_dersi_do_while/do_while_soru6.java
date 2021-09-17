package day18_Temmuz_16_2021_dersi_do_while;

import java.util.Scanner;

public class do_while_soru6 {

	public static void main(String[] args) {
		/* Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol
		edin ve sifredeki hatalari yazdirin.
		Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre
		girdiginde “Sifreniz Kabul edilmistir” yazdirin.
		- Sifre kucuk harf icermelidir
		- Sifre buyuk harf icermelidir
		- Sifre ozel karakter icermelidir
		- Sifre en az 8 karakter olmalidir. */

		
		 
		/*boolean buyukharfkontrol = sifre.charAt(0)>='A' && sifre.charAt(0)<='Z';
		boolean kucukharfkontrol = sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(0)<='z';
		boolean ozelkarakter = sifre.contains(" ");
		boolean sifreuzunluk = sifre.length()>=8;
		
		if(ilkharfkontrol && sonharfkontrol && spacekontrol && sifreuzunluk) {
			System.out.println("Sifre basari ile tanimlandi");
		}else {
			System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
		}
		*/
		
	       
	       Scanner scan = new Scanner(System.in);
	       String sifre;
	       
	       boolean kucukharfkontrol = sifre.charAt(0)>='a' && sifre.charAt(sifre.length()-1)<='z';
	       boolean buyukharfkontrol = sifre.charAt(0)>='A' && sifre.charAt(sifre.length()-1)<='Z';
	       boolean ozelkarakter = sifre.contains("#,&!*/-+%$@");
	       boolean sifreuzunluk = sifre.length()>=8;
	       
	       
	       
	       
	       do {
	           System.out.println("Lutfen bir sifre giriniz ");
	           sifre=scan.next();
	           
	           if(kucukharfkontrol && buyukharfkontrol && ozelkarakter && sifreuzunluk) {
	   			System.out.println("Sifre basari ile tanimlandi");
	   		}else {
	   			System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
	   		}
	           
	           
	       } while();
	       
	       
		
		
		
		
		
		
		
	}

}
