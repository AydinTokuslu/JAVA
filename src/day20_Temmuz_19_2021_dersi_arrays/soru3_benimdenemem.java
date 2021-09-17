package day20_Temmuz_19_2021_dersi_arrays;

import java.util.Arrays;

public class soru3_benimdenemem {

	public static void main(String[] args) {
		// Verilen bir array'i buyukten kucuge siralayan bir method yaziniz
		
				int arr[]= {3,15,10,11,9,1,25};
				
				
				arr=arrayiSirala(arr);
				System.out.println(Arrays.toString(arr));
				
				arr=terstenSiralama(arr);
				System.out.println(Arrays.toString(arr));
				
		}

	private static int[] terstenSiralama(int[] arr) {
		int temp[]=new int[arr.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i]=arr[arr.length-1-i];
		}
		
		return temp;
	}

	private static int[] arrayiSirala(int[] arr) {
		Arrays.sort(arr);
		
		
		return arr;
	}

}
