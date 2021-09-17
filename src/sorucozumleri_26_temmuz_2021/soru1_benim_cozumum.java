package sorucozumleri_26_temmuz_2021;

import java.util.Scanner;

public class soru1_benim_cozumum {

	public static void main(String[] args) {
		 // kullanıcıdan alınan bir sayinin Armstrong sayi olup olmadigini kontrol eden program yazin
        // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen armstrong bir sayi giriniz");
		int sayi=scan.nextInt();
		int ilkdeger=sayi;
		int rakam;
		int kuplertoplami=0;
		
		while(sayi!=0) {
			rakam=sayi%10;
			sayi/=10;
			kuplertoplami+=rakam*rakam*rakam;
					
		}
		
		if(kuplertoplami==ilkdeger) {
			System.out.println("tebrikler, girdiginiz sayi armstrong sayidir");
		}else {
			System.out.println("maalesef, girdiginiz sayi armstrong sayi degildir.");
		}
			
		
		
		
		
		

	}

}
