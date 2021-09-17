package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class soru19 {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alali�m
				// 18 yasindan kucuk ise kan bagisi yapamaz
				// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
				// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

				Scanner scan=new Scanner(System.in);
				System.out.println("Lutfen yasinizi giriniz");
				int yas=scan.nextInt();
				
				System.out.println("Lutfen kilonuzu giriniz");
				int kilo=scan.nextInt();
				
				String sonuc=(yas>18)?((kilo>50)?("kan bagisi yapabilirsiniz"):("kilonuz 50‘den az oldugu icin kan bagisi yapamazsiniz")):("kan bagisi yapamazsiniz");
				System.out.println(sonuc);

	}

}
