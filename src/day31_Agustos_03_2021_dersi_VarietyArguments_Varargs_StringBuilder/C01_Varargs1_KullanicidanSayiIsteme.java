package day31_Agustos_03_2021_dersi_VarietyArguments_Varargs_StringBuilder;

import java.util.Scanner;

public class C01_Varargs1_KullanicidanSayiIsteme {

	public static void main(String[] args) {
		// kullanicidan sayi isteme
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 5 tane sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int sayi3=scan.nextInt();
		int sayi4=scan.nextInt();
		int sayi5=scan.nextInt();
		
		topla(sayi1,sayi2,sayi3,sayi4,sayi5);
		
		
	}

	private static void topla(int... sayi) {
		int toplam=0;
		for (int i : sayi) {
			toplam+=i;
		}
		System.out.println("girdiginiz sayilarin toplami : "+ toplam);
	}

}
