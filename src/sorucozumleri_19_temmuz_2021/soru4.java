package sorucozumleri_19_temmuz_2021;

import java.util.Scanner;

public class soru4 {

	public static void main(String[] args) {
		/*
         * Kullanicidan 5 adet sayi isteyiniz
         * Bu sayilardan 5 ile 10 arasindakiler haric, digerlerinin toplamini bulunuz.
         * bu soruyu continue kullanarak cozunuz.
         * continue komutu bulundugu  kod blogununda mevcut islemi atlar. 
         */
		Scanner scan = new Scanner (System.in);
        
        int top=0;
        
        for (int i = 1; i <=5; i++) {
            
            System.out.print("bir sayi giriniz : ");
            
            int sayi=scan.nextInt();
            
            if (sayi>5 && sayi<10) {
                
                System.out.println("girdiginiz sayi 5 ile 10 arasi oldugundan isleme girmeyecek");
                
                continue; }
            
        top+=sayi;
            }
        
        System.out.println("girdiginiz sayilar toplami : " + top);
            
        scan.close();
	}

}
