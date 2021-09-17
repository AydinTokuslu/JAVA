package sorucozumleri_31_agustos_2021_abstraction2;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Musteri musteri=new Musteri();
		System.out.println("nereden alisveris yapacaksiniz?\n 1- Market\n 2- Halk Ekmek");
		int secim=scan.nextInt();
		
		if(secim==1) {
			
			musteri.anaabstract=new Market();
		}else {
			musteri.anaabstract=new HalkEkmek();
		}
		
		musteri.alisveris();
		
	}
}
