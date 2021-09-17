package Replit_sorular;

import java.util.Arrays;

public class soru39_array_cumleyi_tersten_yazdirma {
	public static void main(String[] args) {
	
		/*Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

		Input : Coding is greate.

		Output : .etaerg si gnidoC*/
		
		String cumle="Coding is greate.";//lenght 18
		
		String cumleBol[]=cumle.split("");
		
		System.out.println(Arrays.toString(cumleBol));
		
		String terstencumleBol []=new String[cumle.length()];
		
		System.out.println(cumleBol.length);
		
		for (int i =cumleBol.length-1; i >=0; i--) {
			terstencumleBol[cumleBol.length-1 -i]=cumleBol[i];	
		
		}System.out.print(Arrays.toString(terstencumleBol));
		
		
	}
	
	}
	


