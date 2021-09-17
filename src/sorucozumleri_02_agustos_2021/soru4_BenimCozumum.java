package sorucozumleri_02_agustos_2021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru4_BenimCozumum {

	public static void main(String[] args) {
		/*
		   Bir integer list oluşturunuz ve bu list’deki tum sayıların 
		   karesinin toplamını bulunuz. Sonucu ekrana yazdırınız.
		    */
		
		
		List<String> list=new ArrayList<>();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen sayi giriniz, cikmak icin q giriniz");
		String islem="";
		int sum=0;
		
		
		while(!(islem.equalsIgnoreCase("q"))) {
			System.out.println("sayi giriniz");
			islem=scan.nextLine();
			list.add(islem);
			
			
		}
		list.remove(list.size()-1);
		
		for (String w : list) {
			int y=Integer.parseInt(w);
			sum+=y*y;
			
		}System.out.println(list + " nin elemanlarinin kareleri toplami = " + sum);

	}

}
