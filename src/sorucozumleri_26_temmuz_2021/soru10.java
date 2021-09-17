package sorucozumleri_26_temmuz_2021;

import java.util.Scanner;

public class soru10 {

	public static void main(String[] args) {
		
		// INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.print("PIN kodunuzu giriniz : ");
        int userPin = scan.nextInt();
        int pinCode = 1453;
        while (pinCode!=userPin) {
            System.out.println("başarısız pin girisi! tekrar deneyin :");
            userPin=scan.nextInt();
        }
        System.out.println("gayet başaırılı giriş pin onaylandı");


	}

}
