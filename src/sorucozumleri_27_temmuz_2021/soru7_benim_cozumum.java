package sorucozumleri_27_temmuz_2021;

import java.util.Arrays;

public class soru7_benim_cozumum {

	public static void main(String[] args) {
		// multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer
        // birer bulan
        // ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana
        // yazdıran programı yaziniz.
        // input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
        /*
         * 0. kat-->10,20,30
         * 1. kat-->4
         * 2. kat-->6,7,20
         */
		
		 int apt[][] = { { 1, 20, 30 }, { 4 ,13}, { 6, -7, 20 },{23, 12, 4} };
		 
		 int sonuc[]=new int[apt.length];
		 
		 for (int dis = 0; dis < apt.length; dis++) {
			for (int ic = 0; ic < apt[dis].length; ic++) {
				sonuc[dis]+=apt[dis][ic];
			}
		}
			
		
		
		System.out.println(Arrays.toString(sonuc));
	

	}

}
