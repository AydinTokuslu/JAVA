package day09_Temmuz_06_2021_dersi_switchCase;

import java.util.Locale;

public class string_manipulation_concat_01 {

	public static void main(String[] args) {
		

		String isim = "Firat";
		String soyisim = "Korkmaz";
		
		System.out.println(isim + " " + soyisim);
		System.out.println(isim.concat(" ").concat(soyisim));
		
		System.out.println(isim.charAt(2)); // r
		System.out.println(isim.charAt(4)); // t
	//System.out.println(isim.charAt(5)); // olmayan index yazılırsa java hata veriyor.
		System.out.println(soyisim.charAt(5)); // a
		
		String str = "HORSE";
		System.out.println(str.toLowerCase());
		System.out.println(str.toLowerCase(Locale.CHINESE));

	}

}
