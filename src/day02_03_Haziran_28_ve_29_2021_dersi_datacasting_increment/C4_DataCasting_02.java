package day02_03_Haziran_28_ve_29_2021_dersi_datacasting_increment;

public class C4_DataCasting_02 {

	public static void main(String[] args) {
		
		double sayi1 = 200.14;
		
		//int sayi2 = sayi1; bunu java kabul etmiyor ve manuel onay istiyor
		
		int sayi2 = (int) sayi1;
		
		System.out.println("double degişken : " +sayi1 );
		
		System.out.println("int degişken : " +sayi2 );
		
		byte sayi3 = (byte) sayi2;
		
		System.out.println("byte degişken : " +sayi3 );
		
		int sayi4 = 95;
		
		int sayi5= 10;
		
		System.out.println("bölme sonucu : " +sayi4/sayi5); // bölen ve bölünen sayı ikisi de int olunca, sonuç int olur
		
		double sayi6 = 2000;
		
		System.out.println(sayi6/sayi5);
		
		double sayi7 = 5;
		
		System.out.println(sayi4/sayi7);
	}

}
