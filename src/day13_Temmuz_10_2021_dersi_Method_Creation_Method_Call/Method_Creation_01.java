package day13_Temmuz_10_2021_dersi_Method_Creation_Method_Call;

import java.util.Scanner;

public class Method_Creation_01 {

	public static void main(String[] args) {
		// Kullanicidan 2 tamsayi isteyin
        // bu sayilarin toplamlarini ve carpimlarini 
		// 2 ayri method' da hesaplayip yazdirin

		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        // method olusturmanin kolay yolu ==> method ismini ve parametreleri yazin
        toplama(sayi1, sayi2); // toplama icin method call
        carpma(sayi1, sayi2); // carpma icin method call
        
        carpma(sayi1 + 3, sayi2 * 2);
        toplama(sayi1 + 3, sayi2 + 1);
        
        
        sayi1 = 20;
        sayi2 = 15;
        
        toplama(sayi1, sayi2); // 20+15=35 yazdirir
        carpma(sayi1, sayi2); // 300 yazdirir
        
        sayi2 = 40;
        toplama(sayi1, sayi2); // 20+40=60 yazdirir
        
        // Sonuc olarak uygulamanizda tekrar tekrar kullanmaniz gereken kod bloklari icin
        // her seferinde yeniden yazmak yerine , bu blogu bir method' da yazip ihtiyacimiz oldugu
        // her seferde cagirmak daha mantiklidir
        scan.close();
    }
	
	//bir method sadece konsolda birseyler yazdiracaksa return type olarak void yazilir.
	// bu durumda return keyword‘na iktiyac olmaz.
	// ve METHOD BIZE BIR SONUC DONDURMEZ.
	
    public static void carpma(int sayi1, int sayi2) {
        System.out.println("girilen sayilarin carpimi : " + (sayi1 * sayi2));
    }
    public static void toplama(int sayi1, int sayi2) {
        System.out.println("girilen sayilarin toplami : " + (sayi1 + sayi2));
		
		
    
		

	}

	
						
	}
	
	

