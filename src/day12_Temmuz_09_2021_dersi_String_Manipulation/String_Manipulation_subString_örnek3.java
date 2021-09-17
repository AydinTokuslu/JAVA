package day12_Temmuz_09_2021_dersi_String_Manipulation;

import java.util.Scanner;

public class String_Manipulation_subString_örnek3 {

	public static void main(String[] args) {
		/* Kullanicidan bir sifre girmesini isteyin. 
		 * Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”, 
		 * sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” 
		 * yazdirin
		 - Ilk harf buyuk harf olmali
		 - Son harf kucuk harf olmali
		 - Sifre bosluk icermemeli
		 - Sifre uzunlugu en az 8 karakter olmali */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen şifrenizi giriniz ");
		String sifre=scan.nextLine();
		
		boolean ilkHarfKont = sifre.charAt(0)>='A' && sifre.charAt(0)<='Z' ;
		boolean sonHarfKontrol = sifre.charAt(sifre.length()-1)>='a' && 
				sifre.charAt(sifre.length()-1)<='z';
		
		boolean spaceKontrol = !sifre.contains(" ");
		//basa ünlem ! koymazsam " " varsa true, " " yoksa false olur
		// basa ünlem ! koyuyorum ki space olmadığında true dönsün.
		boolean uzunlukKontrol = sifre.length()>=8;
		
		if(ilkHarfKont && sonHarfKontrol && spaceKontrol && uzunlukKontrol) {
			System.out.println("Sifre basari ile tanimlandi");
		}else {
			System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
		}
		
		scan.close();
		
		
		

	}

}
