package day20_Temmuz_19_2021_dersi_arrays;

public class soru2_benimdenemem {

	public static void main(String[] args) {
		// Verilen bir array’in tum elemanlarini toplayan bir program yazalim.

		int arr[]= {2,4,6,8,10};
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
		
		System.out.println(toplam);
		
		
	}

}
