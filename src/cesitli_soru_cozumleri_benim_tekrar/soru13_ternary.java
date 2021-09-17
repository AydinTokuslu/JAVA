package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class soru13_ternary {

	public static void main(String[] args) {
		// Kullanıcıdan bir pozitif tamsayı girmesini isteyin, 
		// o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
        // 3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
        // Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”

		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen pozitif bir tamsayi giriniz");
		int sayi=scan.nextInt();
		
		String sonuc=(sayi>99 & sayi<1000) ? ("3 basamakli sayi") : ((sayi%2==0) ? ("3 basamaklı olmayan çift sayı") : ("3 basamaklı olmayan tek sayı"));
		System.out.println(sonuc);
		
		
		
	}

}
