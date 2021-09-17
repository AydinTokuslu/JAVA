package day20_Temmuz_19_2021_dersi_arrays;

import java.util.Arrays;

public class soru4_benimdenemem {

	public static void main(String[] args) {
		// tersten yazdir
		
		
		 String cumle="Java ogren, rahat yasa";
		 String[] bolunmuscumle=cumle.split("");
		 
		 String temp []=new String[bolunmuscumle.length];
		 
		 for (int i = 0; i < temp.length; i++) {
			temp[i]=bolunmuscumle[bolunmuscumle.length-1-i];
		}
		 
		 System.out.println(Arrays.toString(temp));
	}

}
