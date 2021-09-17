package ArraySoruCozumleri;

import java.util.Arrays;

public class ornek1 {

	public static void main(String[] args) {
		// Write a Java program to sort a numeric array and a string array.
		
		int[] my_array1 = {
	            1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2165, 1457, 2456};
		
		
		String[] my_array2 = {
	            "Java",
				
	            "Python",
	            "PHP",
	            "C#",
	            "C Programming",
	            "C++"
	        };
		
		System.out.println("orjinal array sayi siralamasi : "+ Arrays.toString(my_array1));
		Arrays.sort(my_array1);
		System.out.println("siralanmis sayi siralmasi : "+ Arrays.toString(my_array1));
		System.out.println("orijinal string siralamasi : "+ Arrays.toString(my_array2));
		Arrays.sort(my_array2);
		System.out.println("siralanmis string siralamasi : "+ Arrays.toString(my_array2));
		

	}

}
