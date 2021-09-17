package Interview_Questions;

import java.util.Scanner;

public class soru10_for_loop {

	public static void main(String[] args) {
		
		// kullanici 5 girdiyse ekrana 5!=1*2*3*4*5 =120 yazdiralim

		Scanner scan=new Scanner(System.in);
		System.out.print("10'den kucuk bir sayi giriniz: ");
		int sayi=scan.nextInt();
		int faktoriyel=1;
		
		System.out.print(sayi+"!=");
		for (int i=1;i<=sayi;i++) {
			
			faktoriyel=faktoriyel*i;
			System.out.print(i);
			if (i!=sayi) {
				System.out.print("*");
			}
		}
		System.out.println("="+faktoriyel);
		
		
		
		
		
		
	}

}
