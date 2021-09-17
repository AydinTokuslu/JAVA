package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class dik_üçgen_hesaplama {

	public static void main(String[] args) {
		/*  Problem Tanımı
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)
        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.
        Bu bir dik üçgendir
     */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen uc adet pozitif sayi giriniz ve her sayi girisinden sonra ENTER‘a basiniz");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		if((a*a)+(b*b)==c*c || (a*a)+(c*c)==b*b || (c*c)+(b*b)==a*a) {
			System.out.println("Bu bir dik üçgendir");
		}else {
			System.out.println("Bu bir dik üçgen değildir.");
		}
		
		

	}

}
