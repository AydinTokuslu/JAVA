package sorucozumleri_05_temmuz_2021;

import java.util.Scanner;

public class sorucozumleri04 {

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
		
		 Scanner scan =new Scanner(System.in);
	        System.out.print("gittiiginiz mesafeyi giriniz : ");
	        double mesafe=scan.nextDouble();
	        
	        System.out.print("hiznizi giriniz : ");
	        double hiz=scan.nextDouble();
	        
	        double sure=mesafe/hiz;
	        System.out.println("yolculuk sureniz :"+sure);

		
	        System.out.print("gittiiginiz mesafeyi giriniz : ");
	        float mesafe2= scan.nextFloat();
	        
	        System.out.print("hiznizi giriniz : ");
	        float hiz2=scan.nextFloat();
	        
	        float sure2=mesafe2/hiz2;
	        System.out.println("yolculuk sureniz :"+sure2);

		
		
		
		

	}

}
