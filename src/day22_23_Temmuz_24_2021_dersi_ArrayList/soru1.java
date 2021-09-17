package day22_23_Temmuz_24_2021_dersi_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class soru1 {

	public static void main(String[] args) {
		// verilen bir array'de tekrar eden elementleri silip
		// tekrarsiz yeni bir array haline getirin
		
		int arr[]= {2,3,5,7,3,5,2,6,3,1,4,2,3,8,5,10}; // length =13
        
        
        List<Integer> sayilar = new ArrayList<>();
        
        
        for (int i = 0; i < arr.length; i++) {
            
            if (!sayilar.contains(arr[i])) {
                
                sayilar.add(arr[i]);
                
            }
            
        }
        
        System.out.println(sayilar); // [2, 3, 5, 7, 6, 1, 4, 8, 10], liste olarak tekrarsiz elementlerden olusuyor
        Collections.sort(sayilar);
        System.out.println("list olarak tekrarsiz sayilar: " + sayilar);//[1, 2, 3, 4, 5, 6, 7, 8, 10]
        
        // yeni bir array olusturup bu elementleri yeni array'e eklemeliyiz
        // yeni array'in length'i 7 olacak
        
        int yeniArr[]= new int[sayilar.size()];
        
        for (int i = 0; i < yeniArr.length; i++) {
            
            yeniArr[i]=sayilar.get(i);
            
        }
        
        System.out.println("Tekrarsiz array : " + Arrays.toString(yeniArr));//[1, 2, 3, 4, 5, 6, 7, 8, 10]
        

		
		
		
		
		
		
	}

}
