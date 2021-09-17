package cesitli_soru_cozumleri;

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
		
		if(yas>18) {
			if(kilo>50) {
				System.out.println("kan bagisini yapabilirsiniz");
			}else {
				System.out.println("kan bagisini yapmak icin kilonuz yetersizdir");
			}
			
		}else {
			System.out.println("kan bagisini yapamazsiniz");
		}
		
		String sonuc=(yas>18) ? (kilo>50 ? "kan bagisini yapabilirsiniz" : "kan bagisini yapmak icin kilonuz yetersizdir") : ("kan bagisini yapamazsiniz");
		System.out.println(sonuc);
		
		scan.close();
		
	}

}
