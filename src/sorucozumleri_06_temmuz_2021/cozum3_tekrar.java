package sorucozumleri_06_temmuz_2021;

import java.util.Scanner;

public class cozum3_tekrar {

	public static void main(String[] args) {
		/*
		 *  Write a Java program to convert temperature from Fahrenheit 
		 *  to Celsius degree.
		 *  formula
		    
		    c = (f-32)*5/9
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Fahrenheit cinsinden sıcaklık değeriniz giriniz");
		double f=scan.nextDouble();
		
		double c=(f-32)*5/9;
		System.out.println("Celsius cinsinden sıcaklık değeri : " + c);
		
		
		

	}

}
