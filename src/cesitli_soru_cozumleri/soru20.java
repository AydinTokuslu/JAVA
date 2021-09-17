package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru20 {

	public static void main(String[] args) {
		/* Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		hatali giris seklinde kod yazniz
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir character giriniz");
		char ch=scan.next().charAt(0);
		
		String sonuc=((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) ? ((ch>=97 &&  ch<=122 ? "kucuk harf" : "buyuk harf")) : ("hatali giris");
		System.out.println(sonuc);
		
	scan.close();
		
		
		
	}

}
