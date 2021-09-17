package sorucozumleri_31_agustos_2021_abstract;

import java.util.Scanner;

public class Runner {

	//static Dikdortgen dikdortgen=new Dikdortgen();
		static Scanner scan=new Scanner(System.in);
		
		public static void main(String[] args) {
			
			Dikdortgen dikdortgen=new Dikdortgen(5,10);
			/*
			Scanner scan=new Scanner(System.in);
			System.out.println("kısa kenar : ");
			dikdortgen.kk=scan.nextInt();
			System.out.println("uzun kenar : ");
			dikdortgen.uk=scan.nextInt();
			*/
			System.out.println("dikdortgenin cevresi: "+dikdortgen.cevre());
			System.out.println("dikdortgenin alanı : "+dikdortgen.alan());
			
			
			

		}
}
