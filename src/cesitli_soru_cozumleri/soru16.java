package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru16 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
		 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
		    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
		     
		     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
			 a+b>c>a-b
			 a+c>b>a-c  
		     b+c>a>b-c  
			a=b=c ise es kenar ucgen 
			 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen uc adet pozitif sayi giriniz ve her sayi girisinden sonra ENTER‘a basiniz");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		if(a+b>c && c>a-b && a+c>b && b>a-c && b+c>a && a>b-c) {
			if(a==b && a==c) {
				System.out.println("ucgen ve eskenar ucgendir.");
			}else {
				System.out.println("ucgendir ama eskenar ucgen degildir.");
			}
		}else {
			System.out.println("ucgen degildir.");
		}
		
		
		
		
		
		
		
	}

}
