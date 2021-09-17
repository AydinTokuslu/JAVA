package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class tamsayilarin_toplamini_yazdirma_for_loop {

	public static void main(String[] args) {
		// kullanicidan pozitif bir tamsayi alin
				// 1'den kullanicinin girdigi sayiya kadar olan tum tamsayilarin 
				// toplamini yazdirin

				Scanner scan=new Scanner(System.in);
				System.out.println("lutfen pozitif bir tam sayi girin");
				int sayi=scan.nextInt();
				
				int toplam=0;
				
				for (int i = 1; i <= sayi; i++) {
					toplam+=i;
				}
				System.out.println("girdigniz sayinin toplami :"+ toplam);
	}

}
