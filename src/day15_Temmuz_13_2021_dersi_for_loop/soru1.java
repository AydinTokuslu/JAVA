package day15_Temmuz_13_2021_dersi_for_loop;

public class soru1 {

	public static void main(String[] args) {
		/* Bir oyun programinda oyuncuya level ve puanina gore 
		 * bonus hesaplayan bir method yaziniz.
		Bonus eklendikten sonra oyuncu yeni puaniyla oyuna devam edecek. 
		(Oyun icinde birden fazla defa bonus ekleme fonksiyonu kullanilabilir)
		Bonus kurali :
		-ilk 10 level icin mevcut puan 1000’den az ise 50, 1000 
		veya cok ise 100 bonus
		-11-50 level arasi mevcut puanin yuzde 10’u kadar bonus
		-51.levelden itibaren puan 10.000’den az ise 1000 bonus, 
		10.000 den coksa mevcut puanin %15 kadar bonus     */

		int level = 20;
        int puan = 1500;
        puan += bonusHesapla(level, puan);
        level++;
        puan = 20000;
        puan += bonusHesapla(level, puan);
        System.out.println(puan);
        level = 90;
        puan = 7500;
        puan += bonusHesapla(level, puan);
        System.out.println(puan);
    }
    private static int bonusHesapla(int level, int puan) {
        int bonus = 0;
        if (level <= 10) {
            if (puan < 1000) {
                bonus = 50;
            } else {
                bonus = 100;
            }
        } else if (level <= 50) {
            bonus = puan * 10 / 100;
        } else {
            if (puan < 10000) {
                bonus = 1000;
            } else {
                bonus = puan * 15 / 100;
            }
        }
        return bonus;

		
	}

}
