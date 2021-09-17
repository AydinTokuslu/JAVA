package sorucozumleri_05_temmuz_2021;

import java.util.Scanner;

public class cozum7_tekrar {

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
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen kilonuzu giriniz");
		double kilo=scan.nextDouble();
		
		System.out.println("lütfen boyunuzu giriniz");
		double boy=scan.nextDouble();
		
		boy/=100;
		double vki= kilo/(boy*boy);
		
		System.out.println("vücut kitle index'iniz : " +vki);
		
		
		
		
		
		
		

	}

}
