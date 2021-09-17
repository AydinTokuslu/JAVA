package sorucozumleri_13_temmuz_2021;

import java.util.Scanner;

public class soru2_string_manipulation_regex_karakterler {

	public static void main(String[] args) {
		// /kullanicidan tek seferde alacaginiz 2 kelimelik ad soyadi 
		// 2 ayri kelimeye ayiriniz
		// ad ayri soyad ayri sekilde ekrana yaziniz

		Scanner scanner=new Scanner(System.in);
		System.out.println("adınızı soyadınız giriniz : ");
		String adSoyad=scanner.nextLine();//mustafa can
		String ad=adSoyad.substring(0,adSoyad.indexOf(" "));
		String soyad=adSoyad.substring(adSoyad.indexOf(" ")+1);
		        System.out.println("adınız : "+ad+" soyadınız : "+soyad);
		    
		
	}

}
