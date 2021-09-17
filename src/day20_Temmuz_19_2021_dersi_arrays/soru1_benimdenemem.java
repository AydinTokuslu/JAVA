package day20_Temmuz_19_2021_dersi_arrays;

import java.util.Arrays;

public class soru1_benimdenemem {

	public static void main(String[] args) {
		//Verilen 3 elemanli bir array’in tum elemanlarini 
		// bir soldaki konuma tasiyacak bir program yazin. 
		// Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.
		
		int arr2[]= {1,3,9,4,6,8};
		
		int temp=arr2[0];
		
		for (int i = 0; i < arr2.length-1; i++) {
			arr2[i]=arr2[i+1];
		}
		
		System.out.println(Arrays.toString(arr2));
		arr2[arr2.length-1]=temp;
		System.out.println(Arrays.toString(arr2));

	}

}
