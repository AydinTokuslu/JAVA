package day22_23_Temmuz_24_2021_dersi_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ornek3 {

	public static void main(String[] args) {

		
		List <String> isimler = new ArrayList<>();
        
        isimler.add("Ali");
        isimler.add("Ayse");
        isimler.add("Zeki");
        
        isimler.set(1, "Fatma");//yerine atama,ekleme
        System.out.println(isimler);//[Ali, Fatma, Zeki]
        
        System.out.println(isimler.set(2, "Mehmet")); // Zeki
                                                        // delil olarak eski elementi getirir
        System.out.println(isimler);//[Ali, Fatma, Mehmet]


	}

}
