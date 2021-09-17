package sorucozumleri_12_temmuz_2021;

import java.util.Scanner;

public class cevap3_deneme {

	public static void main(String[] args) {
		// kullanicidan aldiginiz yilin ay numarasına göre , 
		// ayın kaç gün olduğunu sayı ile yazdırınız

		Scanner scan=new Scanner(System.in);
		System.out.print("lutfen yilin kacinci ayinda oldugunuzu giriniz : ");
		int ay=scan.nextInt();
		
		switch (ay) {
		case 1:
		case 3:
		case 5:	
		case 7:	
		case 8:	
		case 10:			
		case 12:
			System.out.println("girdiginiz bu ay 31 gun cekiyor.");
			break;
		case 4:
		case 6:
		case 9:	
		case 11:	
			System.out.println("girdiginiz bu ay 30 gun cekiyor.");
			break;
		case 2:
			System.out.println("lutfen yilinizi giriniz.");
			int yil=scan.nextInt();
		if(yil%4==0) {
			System.out.println("girdiginiz bu yila ait ay 29 gun cekiyor.");
		}else {
			System.out.println("girdiginiz bu yila ait ay 28 gun cekiyor.");
		}
			
			break;
			
		default:
			System.out.println("hatali giris yaptiniz.");
			break;
		}
		
		scan.close();
	}

}
