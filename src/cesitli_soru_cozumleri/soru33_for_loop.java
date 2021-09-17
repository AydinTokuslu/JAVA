package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru33_for_loop {

	public static void main(String[] args) {
		// 50'den buyuk 150'den kucuk olan tamsayilardan
		// 7 ile tam bolunebilenleri toplayip
		// sonucu yazdiran bir kod yaziniz

		Scanner scan=new Scanner(System.in);
		
		int sayi1=50;
		int sayi2=150;
		
		int toplam=0;
		
		for(int i=50; i<150 ; i++) {
			if(i%7==0) {
				toplam+=i;
				System.out.print(i + ",");
			}
		}System.out.println("");
		System.out.println(toplam);
		
		
		scan.close();
		
	}

}
