package day04_Haziran_30_2021_dersi;

public class C3_Predecrement_Posdecrement {

	public static void main(String[] args) {
		

		int sayi1= 20;
		
		int sayi2=sayi1--;
		
		System.out.println("post-decrement sayi1 : " + sayi1);
		
		System.out.println("post-decrement sayi2 : " + sayi2);
		
		System.out.println(--sayi2); //önce azalt (20-1=19), sonra yazdır
		
		System.out.println(sayi2--); //önce yazdır (19), 19'u yazdırıyor, sonra azalt (19-1=18)
		
		System.out.println(sayi2);  //sadece 18 yazdır

	}

}
