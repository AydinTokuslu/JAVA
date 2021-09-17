package sorucozumleri_05_temmuz_2021;

import java.util.Scanner;

public class sorucozumleri05 {

	public static void main(String[] args) {
		
	/* Kullanicidan alacaginiz vize2 vize2 ve final notlarini 
	 * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
	 */	
		
		Scanner scanner =new Scanner(System.in);
		System.out.print("vize1 notunu giriniz : ");
		double vize1=scanner.nextDouble();
		       
		System.out.print("vize2 notunu giriniz : ");
		double vize2=scanner.nextDouble();
		System.out.print("final  notunu giriniz : ");
		double finalNotu=scanner.nextDouble();
		double gecmeNotu=(vize1+vize2)/2*0.3+finalNotu*0.7;
		System.out.println("gecme notunuz :"+gecmeNotu);	
		

	}

}
