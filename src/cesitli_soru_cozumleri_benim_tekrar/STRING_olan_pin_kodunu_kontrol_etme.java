package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class STRING_olan_pin_kodunu_kontrol_etme {

	public static void main(String[] args) {
		// STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
		
		Scanner scan=new Scanner(System.in);
		
		String gercekpinkodu="6036At.";
		int girisHakki=3;
		
		do {
			System.out.println("lutfen pin kodunu giriniz");
			String pinkodu=scan.next();
			
			if(pinkodu.equalsIgnoreCase(gercekpinkodu)) {
				System.out.println("tebrikler bildiniz");
				break;
			}else {
				System.out.println("bilemediniz, tekrar deneyiniz");
				girisHakki--;
				System.out.println("kalan giris hakkiniz : " + girisHakki);
			}
			
		}while(girisHakki>0);
		
		if(girisHakki==0) 
			System.out.println("tum haklariniz bitti, bilemediniz");
		
		
		

	}

}
