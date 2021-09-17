package day21_Temmuz_23_2021_dersi_multi_dimensional_arrays;

import java.util.Arrays;

public class soru3 {

	public static void main(String[] args) {
	/*	Soru 3) Asagidaki multi dimensional array’in 
    ic array’lerindeki tum elemanlarin toplamini birer birer bulan 
    ve herbir sonucu yeni bir array’in elemani yapan 
    ve yeni array’i ekrana   yazdiran bir program yaziniz 
    
    { {1,2,3}, {4,5}, {6,7} }

   Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
    */
   
   
   int arr[][]={ {1,2,3}, {4,5}, {6,7} };
   
   // her bir inner array'in elemanlarinin toplamini yeni bir array'e element olarak yazacagiz
   
   int toplamlarArrayi[]= new int[arr.length]; // inner array sayisina uygun bir array olusturacak
   
   
   for (int i = 0; i < arr.length; i++) {
       
       int elementlerToplami=0;
       
       for (int j = 0; j < arr[i].length; j++) {
           
           elementlerToplami+=arr[i][j];           
           
       }
       
       toplamlarArrayi[i]=elementlerToplami;
       
   }   
   System.out.println(Arrays.toString(toplamlarArrayi));
   

	}

}
