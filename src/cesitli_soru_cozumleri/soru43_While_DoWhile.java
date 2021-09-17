package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru43_While_DoWhile {

	public static void main(String[] args) {
		// STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
		
		Scanner scan=new Scanner(System.in);
		
		
		String gercekpinkodu="6036At.";
		int girishakki=3;
		
		
		do {
			System.out.println("lutfen pin kodunu giriniz");
			String pinkodu=scan.next();
			if(gercekpinkodu.equals(pinkodu)) {
				System.out.println("basari ile giris yaptiniz.");
				break;
			}else {
				System.out.println("yanlis pin kodu girdiniz");
				girishakki--;
				System.out.println("kalan giris hakkiniz : " + girishakki);
			}
			
			
			
		} while (girishakki>0);
		  if (girishakki == 0)
		
		System.out.println("giris hakkiniz bitti");
		


	}

}
