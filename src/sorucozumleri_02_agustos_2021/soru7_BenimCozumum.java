package sorucozumleri_02_agustos_2021;

import java.util.ArrayList;
import java.util.Scanner;

public class soru7_BenimCozumum {

	public static void main(String[] args) {
		// Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek elemanlarını ayrı diziye bir metodda atayarak
        // main de yazdırınız.
		
		
		Scanner scan=new Scanner(System.in);
		int[] dizi=new int[6];
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println("sayi giriniz : ");
			dizi[i]=scan.nextInt();
			}
		System.out.println(tekElemanlar(dizi));
		
		
		

	}

	private static ArrayList<Integer> tekElemanlar(int[] sayi) {
		ArrayList<Integer> liste=new ArrayList<>();
		
		for (int i = 0; i < sayi.length; i++) {
			if(sayi[i]%2==1) {
				liste.add(sayi[i]);
			}
	}
		
		
		return liste;
	}

}
