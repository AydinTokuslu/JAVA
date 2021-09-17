package sorucozumleri_27_temmuz_2021;

import java.util.Iterator;
import java.util.Scanner;
public class soru9 {
    public static void main(String[] args) {
        // Kullanicidan aldigimiz 8 elemanli arrayin icinde 
        // kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        
        // 3,5,78,89,23,3,5,6
        int [] arr = new int [8];
        Scanner scan = new Scanner (System.in);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arrayin "+i+". elemanını giriniz : ");
            arr[i]=scan.nextInt();
            
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {//arr in elemanlrın ulsılıyor
            if (arr[i]%3==0) {
                count++;
                
            }
            
        }
        System.out.println("arraydeki 3 e tam bolunen eleman sayisi : "+count);
        

	}

}
