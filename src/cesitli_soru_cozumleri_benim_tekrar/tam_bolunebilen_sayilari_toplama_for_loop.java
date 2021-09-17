package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class tam_bolunebilen_sayilari_toplama_for_loop {

	public static void main(String[] args) {
		// 50'den buyuk 150'den kucuk olan tamsayilardan
		// 7 ile tam bolunebilenleri toplayip
		// sonucu yazdiran bir kod yaziniz
		
		Scanner scan=new Scanner(System.in);
		
		int sayi1=50;
		int sayi2=150;
		
		int toplam=0;
		
		for (int i = sayi1+1; i < sayi2; i++) {
			if(i%7==0) {
				toplam+=i;
				System.out.print(i+" ,");
			}
			
		}
		System.out.println("");
		System.out.println(toplam);
		
		
		
		
		
		

	}

}
