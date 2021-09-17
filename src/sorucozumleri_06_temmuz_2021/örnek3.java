package sorucozumleri_06_temmuz_2021;

import java.util.Scanner;

public class örnek3 {

	public static void main(String[] args) {
	 /*
		 *  Write a Java program to convert temperature from Fahrenheit 
		 *  to Celsius degree.
		 *  formula
		    
		    c = (f-32)*5/9
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Fahrenheit değerini giriniz : ");
		double f= scan.nextDouble();
		
		double c= (f-32)*5/9;
		
		System.out.println("Girdiğiniz fahrenheit derecesinin celsius karşılığı : " + c);
		
		
		
	}

}
