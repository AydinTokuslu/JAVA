package day14_Temmuz_12_2021_dersi_Method_Creation;

import java.util.Scanner;

public class ornek3_method_creation {

	public static void main(String[] args) {
		/*Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre 
		 - @ isareti icermiyorsa gecersiz email yazdirin
		 - @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
		 - @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”*/
		
		
		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen email adresinizi yaziniz...");
        String email=scan.next();
        
        emailKontrolEt(email);
        scan.close();
    }
    public static void emailKontrolEt(String email) {
        
        if (!email.contains("@")) {
            System.out.println("gecersiz email");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("lutfen gmail adresinizi girin");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
        } else {
            System.out.println("Mailiniz basariyla kaydedildi");
        }
    }
        
    
}










	

}
