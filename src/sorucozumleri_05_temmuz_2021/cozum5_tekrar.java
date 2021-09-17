package sorucozumleri_05_temmuz_2021;

import java.util.Scanner;

public class cozum5_tekrar {

	public static void main(String[] args) {
		/* Kullanicidan alacaginiz vize2 vize2 ve final notlarini 
		 * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("lütfen vize1 notunuzu giriniz : ");
		double vize1=scan.nextDouble();
		
		System.out.print("lütfen vize2 notunuzu giriniz : ");
		double vize2=scan.nextDouble();
		
		System.out.print("lütfen final notunuzu giriniz : ");
		double finalnot=scan.nextDouble();
		
		double ort = ((vize1+vize2)/2)*0.3+finalnot*0.7;
		
		if(50<ort) {
			System.out.println("Bu dönemi geçtiniz, dönem ortalamanız : " + ort);
		} else {
			System.out.println("Bu dönemi geçemediniz, dönem ortalamanız : " + ort);
		}
		
		
		
		
		
		

	}

}
