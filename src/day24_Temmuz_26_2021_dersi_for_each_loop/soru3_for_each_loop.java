package day24_Temmuz_26_2021_dersi_for_each_loop;

import java.util.ArrayList;
import java.util.List;

public class soru3_for_each_loop {

	public static void main(String[] args) {
		
		List<String> list1= new ArrayList<>();
        list1.add("ALI");
        list1.add("Veli");
        list1.add("Ayse");
        list1.add("Fatma");
        list1.add("Omer Asim");
        
        
        
        // bu listedeki isimlerden uzunlugu 4 harften fazla olan isimleri yazdiralim
        
        // for-each loop index veya size'a bakmadan tek tek tum elementleri bize getirir
        
        for (String  each : list1) {
            
            if (each.length()>4) {
                System.out.print(each + " ");
            }
            
        }

	}

}
