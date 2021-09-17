package sorucozumleri_06_temmuz_2021;

import java.util.Scanner;

public class örnek4 {

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
	    
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lütfen 3 adet kenar uzunluğu giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
	if (a+b>c && c>a-b && a+c>b && b>a-c && b+c>a && a>b-c) {
		
		if ( a==b &&  b==c) {
			System.out.println("üçgeniniz eşkenar üçgen");
	
		} else System.out.println("üçgeniniz eşkenar üçgen değil");
		
	}	else System.out.println("girdiğiniz kenarlar bir üçgen belirtmez");
scan.close();
	} 

}
