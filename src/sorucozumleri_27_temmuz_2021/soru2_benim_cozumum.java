package sorucozumleri_27_temmuz_2021;

import java.util.Arrays;
import java.util.Scanner;

public class soru2_benim_cozumum {

	public static void main(String[] args) {
		// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	    // ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	    // java programi yazin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("kac elemanli array olusturmak istiyorsunuz?");
		int boyut=scan.nextInt();
		
		int arr[]=new int [boyut];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Arrayinizin " + i +" elemanini giriniz");
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Arrayinizin max ve min eleman farki: "+ (arr[arr.length-1]-arr[0]));
		
		

	}

}
