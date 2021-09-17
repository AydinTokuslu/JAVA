package Replit_sorular;

import java.util.Scanner;

public class YAPAMADIM_soru21_INTERVIEW_SORUSU {

	public static void main(String[] args) {
		/*Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

		Input : 
			 
		String str=“Javaisalsoeasy” 

		Output: a s*/
		
		/*Scanner scan=new Scanner(System.in);
		System.out.println("bir kelime giriniz");
		String str=scan.next();
		int count=0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.substring(i, i+1).contains(str)) {
				count++;
			}
			EKSIK BITIREMEDIM, YAPAMADIM
			
		}
		
		System.out.println("tekrarlanan harfler : " +count);*/
		
		String str="Javaisalsoeasy";
        String tekrarHarf="";
        for (int i = 0; i < str.length(); i++) {
//          dongude getirdigim harf, kendinden sonraki harflerin icinde bulunuyorsa ve olusturulan yeni String(tekrarHarf) icinde bulunmuyorsa ekle.        
            if(str.substring(i+1).contains(str.substring(i,i+1)) && !tekrarHarf.contains(str.substring(i,i+1))) {
                tekrarHarf+=str.substring(i, i+1)+ " ";
                
            }
            
    }
        System.out.println(tekrarHarf); 
		

	}

}
