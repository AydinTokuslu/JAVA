package Replit_sorular;

import java.util.Scanner;

public class soru22 {

	public static void main(String[] args) {
		/*Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

		Input : 6

		Output: 6!=6*5*4*3*2*1=720*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		int faktoriyel=1;
		
		System.out.print(sayi+"!=");
		for (int i = sayi; i >=1; i--) {
			System.out.print(i+"*");
			faktoriyel*=i;
			
			}
		
		
		System.out.print("=" + faktoriyel);
	}

}
