package sorucozumleri_02_agustos_2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class soru3_BenimCozumum {

	public static void main(String[] args) {
		/*2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
	listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
		Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
		   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

	"Ali", "Veli", "Ayse"  -->0. kat
	"Hasan", "Can"        -->1.kat
	"Suzan"               -->.kat
		 */
		
		String isim[][] = {{"Ali", "Veli", "Ayse" }, {"Hasan", "Can" }, {"Suzan" }};
		yeniList(isim);
		
		

	}

	private static void yeniList(String[][] isim) {
		List<String>list=new ArrayList<>();
		for (int i = 0; i < isim.length; i++) {
			for (int j = 0; j < isim[i].length; j++) {
				list.add(isim[i][j]);
			}
		}
		System.out.println("yeni liste : "+list);
		Collections.sort(list);
		System.out.println("yeni liste son hali : "+list);
	}

}
