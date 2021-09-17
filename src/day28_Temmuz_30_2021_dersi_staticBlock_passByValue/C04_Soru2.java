package day28_Temmuz_30_2021_dersi_staticBlock_passByValue;

public class C04_Soru2 {

	public static void main(String[] args) {
		int fiyat=100;
		System.out.println("Method10'da hesaplanan fiyat : "+indirim10(fiyat));
		System.out.println("Method20'da hesaplanan fiyat : "+indirim20(fiyat));
		System.out.println("Method25'da hesaplanan fiyat : "+indirim25(fiyat));
		System.out.println("Method call sonrasi fiyat : "+fiyat);
	}
	public static int indirim10(int fiyat) {
		fiyat*=0.90;
		return fiyat;
	}
	public static int indirim20(int fiyat) {
		fiyat*=0.80;
		return fiyat;
	}
	public static int indirim25(int fiyat) {
		fiyat*=0.75;
		return fiyat;

	}

}
