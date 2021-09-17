package sorucozumleri_27_temmuz_2021;

import java.util.Scanner;

public class soru9_benim_cozumum {

	public static void main(String[] args) {
		// Kullanicidan aldigimiz 8 elemanli arrayin icinde 
        // kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        
        // 3,5,78,89,23,3,5,6
		
		int arr[]=new int[8];
		Scanner scan=new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Array "+ i + " elemanini girin");
			arr[i]=scan.nextInt();
		}
		
		int sayac=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%3==0) {
				sayac++;
			}
		}
		
		System.out.println("Arrayde 3‘e bolunen sayilarin sayisi : " + sayac);
	}

}
