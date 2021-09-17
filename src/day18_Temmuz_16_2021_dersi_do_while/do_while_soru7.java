package day18_Temmuz_16_2021_dersi_do_while;

import java.util.Scanner;

public class do_while_soru7 {

	public static void main(String[] args) {
		/* Kullanicidan toplamak icin sayi isteyin ve 
		toplam 500’e ulasincaya kadar devam istemeyi ettirin. 
		Toplam 500’e ulastiginda veya gectiginde toplami ve kac sayi
		girildigini yazdirin */

		Scanner scan=new Scanner(System.in);
		
		int toplam=0;
		int sayac=0;
		
		do {
			System.out.println("lutfen toplama islemi yapmak icin sayi giriniz ");
			int sayi=scan.nextInt();
					toplam+=sayi;
					sayac++;	
			
		} while (toplam<500);
		System.out.println("girdiginiz sayilarin toplami : "+ toplam + " ve girdiginiz sayi adedi : " + sayac);
		
		
		scan.close();
		
		
		
		
	}

}
