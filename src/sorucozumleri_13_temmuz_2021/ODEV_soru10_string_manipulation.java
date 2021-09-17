package sorucozumleri_13_temmuz_2021;

import java.util.Scanner;

public class ODEV_soru10_string_manipulation {

	public static void main(String[] args) {
		/* Iki kisinin oynayacagi bir kelime oyunu uretelim
	     * Kurallar
	     * 1.Adım- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
	     *
	     * 2.Adım- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
	     *      * 2. oyuncu Eger kelimeyi kabul ederse  1.oyuncuya kelimedeki harf sayisi kadar puan ekleyin
	     *        ve 3.adima gecin
	     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve hangi  oyuncunun
	     *        kazandigini yazip oyunu bitirin.
	     *
	     * 3.Adım- 2. oyuncuya oyuna devam etmek isteyip istemedigini sorun
	     *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
	     *          basa mi sona mi ekleyecegini sorun
	     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
	     *
	     *      *   Devam etmek istemezse
	     *          "Oyun bitti" yazin
	     *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
	     */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 1 kelime giriniz");
		String kelime=scan.next();
		System.out.println(kelime);
		
		int puan_oyuncu1=0;
		int puan_oyuncu2=0;
		
		System.out.println("girilen " + kelime + " kelimesini kabul ediyorsaniz 1‘i etmiyorsaniz 2‘yi giriniz");
		int cevap1=scan.nextInt();
		
		if(cevap1==1) {
			puan_oyuncu1+=kelime.length();
			System.out.println("1nci oyuncunun puani : " + puan_oyuncu1);
		}else {
			System.out.println("gecersiz kelime");
			System.out.println("oyunun kazanani 2.nci oyuncu");
		}
		
		
		System.out.println("2.nci oyuncu olarak oyuna devam etmek istiyor musunuz? istiyorsaniz 1‘i istemiyorsaniz 2‘yi giriniz");
		int cevap2=scan.nextInt();

		if(cevap2==1) {
			System.out.println("kelimeye eklemek istedigiz stringi giriniz");
			String kelime2=scan.next();
			System.out.println("girilen string kelimenin basina mi yoksa sonuna mi eklensin, "
					+ "basina icim 1‘e, sonuna icin 2'yi giriniz");
			int cevap3=scan.nextInt();
				if(cevap3==1) {
					System.out.println(kelime2+kelime);
					
				}else {
					System.out.println(kelime+kelime2);
				}
				puan_oyuncu2+=kelime2.length();
				System.out.println("2nci oyuncunun puani : " + puan_oyuncu2);
		}else {
			System.out.println("Oyun bitti");
	
		}
		
		if(puan_oyuncu1>puan_oyuncu2) {
			System.out.println("oyunun kazanani 1nci oyuncu");
		}else {
			System.out.println("oyunun kazanani 2nci oyuncu");
		}
		
		scan.close();
		
		
	}

}
