package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class ucgen_hesaplama {

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
		System.out.println("lutfen ucgenin kenar uzunluklariniz sirasiyla enter‘a basarak giriniz");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		if( a+b>c && c>a-b && a+c>b && b>a-c && b+c>a && a>b-c ) {
			if(a==b && b==c && a==c) {
				System.out.println("ucgen ve eskenar ucgendir");
			}else {
				System.out.println("ucgendir ama eskenar ucgen degildir");
			}
						
		}else {
			System.out.println("ucgen degildir");
		}
		

	}

}
