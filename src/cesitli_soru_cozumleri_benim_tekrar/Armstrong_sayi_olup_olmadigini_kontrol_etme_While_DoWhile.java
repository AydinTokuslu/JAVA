package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class Armstrong_sayi_olup_olmadigini_kontrol_etme_While_DoWhile {

	public static void main(String[] args) {
		// verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden program yazin
        // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
        
        // 153 % 10=3
        // 153 / 10 = 15.3 ama java bunu 15'e cevirir
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int rakam=0;
		int kupler_toplami=0;
		int ilkdeger=sayi;
		
		while(sayi!=0) {
			rakam = sayi%10;
			kupler_toplami+=rakam*rakam*rakam;
			sayi/=10;
		}
		
		if(kupler_toplami==ilkdeger) {
			System.out.println("girdiginiz sayi armstrong sayidir");
		}else {
			System.out.println("girdiginiz sayi armstrong sayi degildir");
		}
		
		
		

	}

}
