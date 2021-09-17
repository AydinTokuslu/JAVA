package day18_Temmuz_16_2021_dersi_do_while;

import java.util.Scanner;

public class do_while_soru3 {

	public static void main(String[] args) {
		/*  Kullanicidan toplamak uzere pozitif sayilar isteyin, 
		islemi bitirmek icin 0’a basmasini soyleyin.
		Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin 
		ve “Negatif sayi giremezsiniz” yazdirip basa donun
		Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, 
		yanlislikla kac negative sayi girdigini ve 
		girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.   */
		
		Scanner scan=new Scanner(System.in);
		
		int toplam=0;
		int sayac1=0;
		int sayac2=0;
		int sayi = 0;
		
		do {
			System.out.println("Lutfen pozitif sayilar girin" + 
					" ve \n islemi bitirmek icin 0’a basin ");
			sayi=scan.nextInt();
			if(sayi>0) {
				toplam+=sayi;
				sayac1++;
			}else if(sayi<0) {
				System.out.println("Negatif sayi giremezsiniz");
				sayac2++;
			}
			
						
		} while (sayi!=0);
		System.out.println("girdiginiz pozitif sayilarin sayisi : "+ sayac1
				+" olup, girilen negatif sayilarin sayisi : "+sayac2+ " pozitif sayilarin toplami : " + toplam);
	} 

}
