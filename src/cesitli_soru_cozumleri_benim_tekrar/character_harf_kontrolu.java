package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class character_harf_kontrolu {

	public static void main(String[] args) {
		// Kullanicidan bir character girmesini isteyiniz
        // Character harf ise kucuk harf olup olmadigini kontrol ediniz
        // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
        // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
        // Harf degilse ekrana "Harf degil" yazdiriniz
        //97:a  122:z ascii değeri
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir character giriniz");
		char ch=scan.next().charAt(0);
		
		String sonuc=((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) ? ((ch>=97 && ch<=122) ? ("kucuk harf"):("buyuk harf")) : ("harf degil");
		System.out.println(sonuc);
		
		

	}

}
