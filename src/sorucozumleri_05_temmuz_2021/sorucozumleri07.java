package sorucozumleri_05_temmuz_2021;

import java.util.Scanner;

public class sorucozumleri07 {

	public static void main(String[] args) {
		
		/*
        Kullanicidan kilosunu ve boyunu alip
        Vucut kitle indeksini hesaplayan bir program yaziniz.
        Ipucu : Vucut 
        Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
        ORNEK:
        INPUT      : Kilo: 71
                          Boy: 1,72
        OUTPUT  : Vucut Kitle Indeksiniz : 23
            */
		
		Scanner scan =new Scanner(System.in);
		System.out.print("kilonuzu girniz : ");
		double kilo=scan.nextDouble();
		
		System.out.print("boyunuzu cm  giriniz : ");
		double boy=scan.nextDouble();
		
		boy/=100;
		double vki=kilo/(boy*boy);
		System.out.println("Vucut kitle indeksiniz :"+vki);		
		

	}

}
