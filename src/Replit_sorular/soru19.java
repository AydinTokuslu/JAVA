package Replit_sorular;

import java.util.Scanner;

public class soru19 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

	    char ch1= 'a' ;

			String name =“John came late" 

			Expected Output: 
	    
	    
	    Number of a = 2*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle ve karakter giriniz");
		String cumle=scan.nextLine();
		String ch1=scan.next();
		int count=0;
		
		for (int i = 0; i < cumle.length(); i++) {
			if(cumle.substring(i, i+1).equals(ch1)) {
				count++;
			}
		}
		
		System.out.println("girdiginiz karakter cumlede "+ count+ " kere geciyor.");

	}

}
