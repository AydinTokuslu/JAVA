package Replit_sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru38_array_sayiyi_tersten_yazdirma {

	public static void main(String[] args) {
		/* Write a return method to reverse number.

				Input : 12345

				Output : 54321   */
		
		/*int sayi[]= {1,2,3,4,5};
		
		
		sayi[0]=sayi[4];
		sayi[1]=sayi[3];
		sayi[2]=sayi[2];
		sayi[3]=sayi[1];
		sayi[4]=sayi[0];
		
		System.out.println(Arrays.toString(sayi));*/
		
		int sayi2[]= {1,2,3,4,5};
		
		sayi2=terstensirala(sayi2);
		System.out.println(Arrays.toString(sayi2));
	}
		
	private static int[] terstensirala(int[] sayi2) {
		int temp[]=new int[sayi2.length];// sayi2 uzunlugunda yeni bir array olusturdum.
		for (int i = 0; i < temp.length; i++) {
			temp[i]=sayi2[sayi2.length-1-i];
		
	}return temp;
	
	
	
	
	
	}
}