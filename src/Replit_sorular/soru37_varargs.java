package Replit_sorular;

import java.util.Scanner;

public class soru37_varargs {

	
	

	public static void main(String[] args) {
		/*Write a return method that accepts more than one integer 
		 * as parameter and prints the sum of integers Method name = sum 
		 * if you call method like that sum(1,2,3) output =6 sum(1,2,3,4,5) 
		 * output =15 sum(1,2) output=3
		 */
		
				
		topla(1,2,3,4,6,8);
		
	
		
	}

	private static void topla(int... sayi) {
	int toplam=0;
	for (int i : sayi) {
		toplam+=i;
}
	System.out.println(toplam);
	
	
	
		
	}

	
}