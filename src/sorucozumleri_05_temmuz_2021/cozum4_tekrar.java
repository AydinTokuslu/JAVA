package sorucozumleri_05_temmuz_2021;

import java.util.Scanner;

public class cozum4_tekrar {

	public static void main(String[] args) {
		/*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?
        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

		Scanner scan=new Scanner(System.in);
		System.out.print("Lütfen gittiğiniz mesafeyi yazınız : ");
		double mesafe=scan.nextDouble();
		
		System.out.print("lütfen hızınızı giriniz : ");
		double hiz = scan.nextDouble();
		
		double sure = mesafe/hiz;
		
		System.out.print("yapılan yolculuğun süresi : " + sure + " saattir");
		
		
		
		
		
		
		
		
	}

}
