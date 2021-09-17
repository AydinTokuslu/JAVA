package day22_23_Temmuz_24_2021_dersi_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class soru1_benimcozumum {

	public static void main(String[] args) {
		// verilen bir array'de tekrar eden elementleri silip
				// tekrarsiz yeni bir array haline getirin
				
				int arr[]= {2,3,5,7,3,5,2,6,3,1,4,2,3,8,5,10}; // length =13
				
				List<Integer>sayilar=new ArrayList<>();
				
				for (int i = 0; i < arr.length; i++) {
					if(!sayilar.contains(arr[i])) {
						sayilar.add(arr[i]);
					}
			}
				System.out.println(sayilar);
				Collections.sort(sayilar);
				System.out.println(sayilar);
				
				int yenisayilarlistesi[]=new int[sayilar.size()];
				
				for (int i = 0; i < yenisayilarlistesi.length; i++) {
					yenisayilarlistesi[i]=sayilar.get(i);
				}
				System.out.println("yeni array : "+ Arrays.toString(yenisayilarlistesi));
	}

}
