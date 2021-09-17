package day21_Temmuz_23_2021_dersi_multi_dimensional_arrays;

import java.util.Arrays;
import java.util.Iterator;

public class ornek1_arraylerin_tum_elemanlarini_yazdirma {

	public static void main(String[] args) {
		

		int arr[][]= {{1}, {2,3,4}, {5,6,7,8}}; //bu array‘in tum elemanlarini yazdirma yontemi (1).
		
		for (int i = 0; i < arr.length; i++) { //bu loop outer array‘in elementlerini getirir.
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			//System.out.println("");
		} 
			
		
		System.out.println("");
		System.out.println(Arrays.deepToString(arr));
		
		
		
		

	}

}
