package Interview_Questions;

import java.util.Scanner;

public class soru27_INTERVIEW_SORUSU {

	public static void main(String[] args) {
		/*Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)

		Input :1238

		Output :Girilen Numananin Tersi: 8321*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		int sayi2=0;
		int sayi3=0;
		int sayi4=0;
		int sayi5=0;
		
		if(sayi>0) {
			sayi2=sayi%10;
			sayi=sayi/10;
			sayi3=sayi%10;
			sayi/=10;
			sayi4=sayi%10;
			sayi5=sayi/10;
		}
		
		System.out.println("Girilen Numananin Tersi:" + sayi2+sayi3+sayi4+sayi5);
		

	}

}
