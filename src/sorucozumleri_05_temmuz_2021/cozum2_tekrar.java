package sorucozumleri_05_temmuz_2021;

public class cozum2_tekrar {

	public static void main(String[] args) {
		//  // Write a Java program to break an integer into a sequence of individual digits.
		// Hint: use / and %
		// ex: input: 12345
		//		    output: 1
		//		            2
		//		            3
		//		            4
		//		            5
		
		int x = 12345;
		int birler = x%10;
		int onlar = x/10%10;
		int yüzler = x/100%10;
		int binler = x/1000%10;
		int onbinler = x/10000;
		
		System.out.println(birler+ "\n"+ onlar+ "\n" + yüzler+ "\n" + binler+ "\n" + onbinler);
		System.out.println(" ");
		System.out.println(onbinler+ "\n"+ binler+ "\n" + yüzler+ "\n" + onlar+ "\n" + birler);
		
		
		
		

	}

}
