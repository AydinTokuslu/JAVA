package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru44_While_DoWhile {

	public static void main(String[] args) {
		 /*
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int toplam=0;	
		while(sayi>0) {
			
			
			if(sayi%2==1) {
				System.out.print(sayi + " , ");
				toplam+=sayi;
				
			}
			
			sayi--;
			
		}
		System.out.println("");
		System.out.print(toplam);
		

	}

}
