package sorucozumleri_06_temmuz_2021;

import java.util.Scanner;

public class cozum4_tekrar {

	public static void main(String[] args) {
		/*
	     *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	     *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	        eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	         
	         üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, 
	         herhangi iki kenar farkı diger kenardan büyük olmali
	         a+b>c>a-b
	         a+c>b>a-c  
	         b+c>a>b-c  
	        a=b=c ise es kenar ucgen 
	         
	     */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen 3 tane pozitif tam sayı giriniz, her sayıdan sonra ENTER'a basınız");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		if(a+b>c && c>a-b && a+c>b && b>a-c && b+c>a && a>b-c) {
			if(a==b && b==c) {
				System.out.println("girdiğiniz sayılar eşkenar üçgen oluşturur.");
			}else {
				System.out.println("girdiğiniz sayılar normal üçgen oluşturur, eşkenar üçgen oluşturmaz.");
			}
			
		} else {
			System.out.println("girdiğiniz sayılar üçgen oluşturmaz.");
		}
		
		
		

	}

}
