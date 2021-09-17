package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru12_ternary {

	public static void main(String[] args) {
		 //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		String sonuc=(sayi>=0) ? ((sayi>10) ? ("pozitif sayi"):("rakam")):("Negatif Sayi");
		System.out.println(sonuc);
		
		
		
		
		
	}

}
