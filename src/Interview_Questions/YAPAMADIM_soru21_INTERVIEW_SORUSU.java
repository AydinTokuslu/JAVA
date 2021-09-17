package Interview_Questions;

import java.util.Scanner;

public class YAPAMADIM_soru21_INTERVIEW_SORUSU {

	public static void main(String[] args) {
		/*Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

		Input : 
			 
		String str=“Javaisalsoeasy” 

		Output: a s*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir kelime giriniz");
		String str=scan.next();
		int count=0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.substring(i, i+1).contains(str)) {
				count++;
			}
			
			
		}
		
		System.out.println("tekrarlanan harfler : " +count);
		
		
		

	}

}
