package day18_Temmuz_16_2021_dersi_do_while;

public class do_while_loop_SCOPE_soru3 {

	public static void main(String[] args) {
		 // 1- main method'un disinda olusturulan variable'lara class level variable denir
	    
	    int sayi1;
	    int sayi2=10;
	    
	    String str1;
	    String str2="Java";
	    
	    // 3- static olmayan variable'lara static alanlardan ulasilamaz
	    
	    static boolean anladinMi;
	    // 2-  static olarak tanimlanan variable'lar class icinde her yerden kullanilabilir
	    // (static olsun veya olmasin her method'dan ulasabiliriz ve kullanabiliriz)
	    static boolean biliyormusun= true;
	    static char harf;
	    static String str;
	    
	    // 4- class level'da olusturulan variable'lar (static olsun veya olmasin)
	    // deger atamadan da kullanilanilabilir
	    // eger biz deger atamazsak Java class level'daki variable'lara
	    // default degerler atar
	    // sayisal degerler icin =0 , boolean = false , string= null , char=' '
	    public static void main(String[] args) {
	        
	        
	        for (int i = 0; i < 10; i++) {
	            System.out.print(i+" ");
	            i=10;
	            String isim="Mehmet";
	            System.out.println(isim);
	        }
	        
	        // System.out.println(isim);
	        //System.out.println(i); // scope disinda i yi kullanamayiz
	        
	        //i=10 ; // scope disinda i yi kullanamayiz
	        
	        
	        int sayi;
	        sayi=10;
	        System.out.println(sayi);
	        
	        // sayi++; 
	        // System.out.println(sayi);
	        
	        // method1(); // main method static klubune uye, bu klube uye olmayanlari muhatap almaz
	        method2();  
	        System.out.println("main method icinde anladinmi nin degeri : " + anladinMi);
	        System.out.println("main method icinde harf in degeri : " + harf);
	        System.out.println("main method icinde str in degeri : " + str);
	        
	        //System.out.println(str1);
	    }
	    
	    public void method1() {
	        
	        System.out.println("method1 calisti");
	        sayi1=20;
	        System.out.println(anladinMi);
	        System.out.println(str1);
	        
	    }
	    
	    public static void method2() {
	        System.out.println("method2 calisti");
	        System.out.println(biliyormusun);
	        //System.out.println(sayi2);
	    }
	}

	// 7- eger birden fazla local'de (method'da) kullanacaginiz variable varsa
    // bunu class level'da olusturmalisiniz
    // 8- variable'in static olup olmamasina nasil karar verirsiniz ?
    // bu sorunun cevabi variable'in kullanilacagi local'lerle ilgilidir
    // eger kullanilacak local static ise o zaman variable'i static yapmak zorundayiz
    
    int sayiClass=10;
    static int sayiClassStatic;
    public static void main(String[] args) {
        
        // 5- class level'da olmayan variable'lara local variable denir
        // 6- local variable'lar static olarak tanimlanamaz
        int sayiMain=10;
        System.out.println(sayiMain);
        // System.out.println(sayiClass);
        sayiClassStatic++;
        
        // local variable'lar deger atanmadan olusturulabilir
        // ANCAK deger atanmadan KULLANILAMAZ
        int sayi;
        sayi=10;
        System.out.println(sayi);
    }
    
    public void method1() {
        // System.out.println(sayiMain);
    
    
    }
    
    
    public static void method2() {
        // System.out.println(sayiMain);
        
    }

		

		
		
		
		
	}


