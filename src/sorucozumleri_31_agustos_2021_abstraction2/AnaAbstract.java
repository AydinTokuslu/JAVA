package sorucozumleri_31_agustos_2021_abstraction2;

public abstract class AnaAbstract {

	/*
	ekmek al metodu oluşturuyoruz
	 bu methodu iki ayrı child classta kullanacağız. Classlarda birine market, diğerine
	 halkekmek diyelim, marketten alınan ekmeğin tanesi 2 tl olsun, 
	 halk ekmekten alınan ekmeğin tanesi de 1.5 tl olsun
	  musteri isminde bir class oluşturalım. bu classın içerisinde alısveris isimli bir
	  method olsun, bu methodda kullanıcan gelen ekmek sayısını alıp, tutarı hesaplasın.
	  runner classta ise kullanıcıdan ekmek sayısı alsın ve alısveriş methodunu çağırsın
	   
	 
	 */
	
	public abstract double ekmekAl(int adet);
	
	/*
	 5 farklı market
	 5 farklı ürün alışverişi yapılsın.(ürün fiyatları farklı olsun)
	 sonra toplam tutarları karşılaştırsın
	 
	 */
	
}
