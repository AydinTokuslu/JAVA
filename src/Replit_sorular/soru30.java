package Replit_sorular;

import java.util.Scanner;

public class soru30 {

	public static void main(String[] args) {
		/*Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

		Input :

		John White

		1234234534561478

		Output : Name :

		J* W**

		CCN : ** ** **** 1478

		Ilk Harfler Buyuk harf ile baslamalidir.*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen adinizi giriniz");
		String isim=scan.nextLine();
		
		System.out.println("lutfensoy adinizi giriniz");
		String soyisim=scan.nextLine();
		
		System.out.println("lutfen 16 haneli kredi karti numaranizi giriniz");
		String kkno=scan.nextLine();
		
		System.out.println(isim.substring(0, 1).toUpperCase()+"* "+soyisim.substring(0, 1).toUpperCase()+"**");
		System.out.println("** ** **** "+kkno.substring(12, kkno.length()));
		
		
		

	}

}
