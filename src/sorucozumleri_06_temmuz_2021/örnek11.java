package sorucozumleri_06_temmuz_2021;

import java.util.Scanner;

public class örnek11 {

	public static void main(String[] args) {
		
		/*  TERNARY VE İF İLE YAPILACAK
        Kullanicidan bir sayi aliniz
        Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
 */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen bir sayı giriniz");
		int sayi=scan.nextInt();
		
		if(0<=sayi) {
			
			if(sayi<10) {
				System.out.println("Rakam");
			}else {
				System.out.println("Pozitif Sayi");
			}
			
		}else {
			System.out.println("Negatif Sayi");
		}
		
	}

	

}
