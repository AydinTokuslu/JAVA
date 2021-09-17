package day20_Temmuz_19_2021_dersi_arrays;

import java.util.Arrays;

public class ODEV_soru5_cumle_terstenYazdirma {

	public static void main(String[] args) {
		// cumle  TERSTEN YAZILACAK!!!

		 String str="Java ogren, rahat yasa"; 
		
		/* String bolunmusStr[] = str.split(" ");        
	        System.out.println(Arrays.toString(bolunmusStr));
	        bolunmusStr = strTersten(bolunmusStr);
	        System.out.println(Arrays.toString(bolunmusStr));
	    }
	    private static String[] strTersten(String bolunmusStr[]) {
	        String temp[] = new String[bolunmusStr.length];
	        for (int i = 0; i < temp.length; i++) {
	            temp[i] = bolunmusStr[bolunmusStr.length - 1 - i];
	        }
	        return temp;*/
		 
		 
		 String bolunmusStr []=str.split("");
		 System.out.println(Arrays.toString(bolunmusStr));
		 bolunmusStr=strTersten(bolunmusStr);
		 System.out.println(Arrays.toString(bolunmusStr));
		 
		 
		 
	}

	private static String[] strTersten(String[] bolunmusStr) {
		String temp[]=new String[bolunmusStr.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i]=bolunmusStr[bolunmusStr.length - 1 - i];
		}
		
		return temp;
	}

}
