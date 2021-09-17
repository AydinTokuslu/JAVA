package day12_Temmuz_09_2021_dersi_String_Manipulation;

public class String_Manipulation_subString_örnek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "mehmet";
		System.out.println(str.substring(2));//2nci indexten sonuna kadar alır.
		System.out.println(str.substring(2,4));// 2 ile 4 arası harfleri alır,4ü dahil etmez.
		System.out.println(str.substring(2,2));//kod çalışmaz
		//System.out.println(str.substring(4,2)); hata verir, çalışmaz.
		
		String str2 = "Java candir";
		System.out.println(str2.substring(5)); //candir
		System.out.println(str2.substring(10)); //r
		System.out.println(str2.substring(11)); //hiçlik yazdırır.
		System.out.println(str2.substring(7)); //ndir
		//System.out.println(str2.substring(20));//hata verir,20nci index yok çünkü
		
		System.out.println(str2.substring(5,8)); //can
		System.out.println(str2.substring(2,3)); //v
		System.out.println(str2.substring(5,5));//hiçlik yazdırır.
		System.out.println(str2.substring(5,11)); //candir
		//System.out.println(str2.substring(5,1)); // hata verir. geriye dönük index bakamaz.
		
		System.out.println(str2.substring(3,4) + str2.substring(8, 9));// a ve d'yi verir.
		
		
		String str3 = "    Java candir     ";
		System.out.println(str3); 
		System.out.println(str3.trim());// boşlukları temizler
		
		
		
	}

}
