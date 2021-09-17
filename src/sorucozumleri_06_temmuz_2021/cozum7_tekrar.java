package sorucozumleri_06_temmuz_2021;

import java.util.Scanner;

public class cozum7_tekrar {

	public static void main(String[] args) {
		/*  Problem Tanımı
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (ipucu: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)
        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.
        Bu bir dik üçgendir
     */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen 3 tane sayı girin ve her girişden sonra ENTER'a basınız");
		int a= scan.nextInt();
		int b= scan.nextInt();
		int c= scan.nextInt();
		
		if(a <= 0 || b <= 0 || c <= 0) {
			System.out.println("hatalı giriş yaptınız");
		}else if(a*a+b*b==c*c) {
			System.out.println("Bu bir dik üçgendir");
		}else if(a*a+c*c==b*b) {
			System.out.println("Bu bir dik üçgendir");
		}else if(c*c+b*b==a*a) {
			System.out.println("Bu bir dik üçgendir");
		}else {
			System.out.println("Bu bir dik üçgen değildir.");
		}
		
	}

}
