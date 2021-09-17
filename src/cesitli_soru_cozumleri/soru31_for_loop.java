package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru31_for_loop {

	public static void main(String[] args) {
		// kullanicidan 2 tamsayi alin
		// ilk sayidan, ikinci sayiya kadar tum tamsayilari
		// yanyana aralarinda bosluk olarak yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 2 tam sayi giriniz, birinci sayidan sonra ENTER‘a basiniz.");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		if(sayi1>sayi2) {
			for (int i=sayi2; i < sayi1 ; i++) {
				System.out.print(i +" ");
			}
		}else {
			for (int i=sayi1; i < sayi2 ; i++) {
				System.out.print(i +" ");
			}
		}
		
		scan.close();
		
		

	}

}
