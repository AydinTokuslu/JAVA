package day04_Haziran_30_2021_dersi;

public class increment_decrement_mtematiksel_operatörler {

	public static void main(String[] args) {
		
		int sayi1=10;
		int sayi2 = 20;
		
		sayi1 -= 5;
		sayi2 += 10;
		
		System.out.println(sayi2/sayi1); //6
		
		sayi1*=2;
		sayi2++;
		
		System.out.println(sayi2/sayi1); //3
		
		sayi1 /= 2;  // 5 olur
		
		double sayi3 = (double)sayi2/10;
		System.out.println(sayi3); // 3.1
		
		System.out.println(sayi1*sayi2);    //155 çıkar
		
		
		System.out.println(sayi1*sayi3); //15.5
		
		System.out.println(sayi2); //31
		
		System.out.println((double)sayi2); //31.0
		
		System.out.println(sayi2); //31
		
	
		
	}

}
