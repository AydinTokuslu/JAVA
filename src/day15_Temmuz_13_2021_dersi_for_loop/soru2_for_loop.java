package day15_Temmuz_13_2021_dersi_for_loop;

public class soru2_for_loop {

	public static void main(String[] args) {
		
		// 10'dan 20 ye kadar olan sayilari yazdiran bir loop olusturalim
        
        for (int i=10  ;i<=20 ; i++) {
        System.out.print(i+" "); //burda yan yana yazdiriyor 
         }
        System.out.println("");
        // 100 ile 200 dahil aralarindaki 10 ile bolunebilen sayilari yazdirin
        System.out.println("");
        for (int i1 = 100; i1 <=200; i1+=10) {
            System.out.print(i1 + " ");
        }
        
        System.out.println("");
        for (double i2 = 100; i2 <=200; i2++) {
            System.out.print(i2/10 + " ");
        }
        
        // 50'den 20 ye kadar (sinirlar dahil) 3'er 3'er geri sayarak yazdiralim
        
        System.out.println("");
        for (int i3 = 50; i3>= 20 ; i3-=3) {
            System.out.print(i3 + " ");
        }
        
            // 50 ile 100 arasinda uc ile bolunebilen sayilari yazdirin
        System.out.println("");
        
        for (int i4 = 50; i4 <=100; i4++) {
            
            if ( i4%3==0 ) {  // sayi 3 ile tam bolunuyorsa 
                System.out.print(i4 + " ");
            }
            
        }
	}
}

                
        	
		
		
		
	



	


