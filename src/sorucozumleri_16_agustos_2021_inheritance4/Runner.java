package sorucozumleri_16_agustos_2021_inheritance4;

public class Runner {

	
		/*
		3 sınıf oluşturacağız bu örneğimizde: Runner ,calisan ve yonetici sınıfları. 
		Calışan sınıfımız superclass, yonetici sınıfımız da subclass olacak. 
		Runner sınıfımızı da oluşturduğumuz kodları, konsola yazdırabilmek için oluşturacağız

		Çalışan sınıfında isim ,maas ve departman değişkenleri olsun.
		Parmetresi bu değişkenler olan bir constructor oluşturalım.
		Birde bu değişkenleri görüntüleyecek bir BilgileriGoster methodu oluşturalım.

		Yönetici sınıfında yine parametresi SuperClasstaki değişkenler olan bir constructor oluşturalım.
		Birde parametresi int zam olan br method oluşturalım. 
		Bu method bize zam miktarı belirtildiğinde ne kadar zam yapılması gerektiğini belirtsin.
		*/
		
	public static void main(String[] args) {	

		Yonetici yonetici=new Yonetici("Ali Can", 10000, "IT");
		
		yonetici.BilgileriGoster();
		
		yonetici.zamMiktari(500);
		
		
		
	}

}
