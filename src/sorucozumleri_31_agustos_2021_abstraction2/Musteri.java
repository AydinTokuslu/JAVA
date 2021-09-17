package sorucozumleri_31_agustos_2021_abstraction2;

import java.util.Scanner;

public class Musteri {

	AnaAbstract anaabstract;
	Scanner scan=new Scanner(System.in);
	
	public void alisveris() {
		
		System.out.println("Ekmek Hesaplamasi");
		System.out.println("kac adet ekmek almak istiyorsunuz");
		int x=scan.nextInt();
		
		System.out.println("Ekmek fiyati : "+ anaabstract.ekmekAl(x)/x+" TL" );
		System.out.println("Odeyeceginiz miktar : "+ anaabstract.ekmekAl(x)+" TL" );
		
	}

}
