package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class kahve_makinesi {

	public static void main(String[] args) {
		/*
		  1. Basit bir Kahve makinesi oluşturun.    3 çeşit kahvemiz olsun.
		  2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
		  3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
		   Örn:
		  Hangi Kahveyi İstersiniz?
		  1.Türk kahvesi
		  2.Filtre Kahve
		  3.Espresso
		        String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
		         (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)
		                                                                                     todo 1. Koşul bölümü
		        Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.(Dümdüz Türk kahvesi yazmayın. String hangiKahve'yi çağırın!!)
		        Eğer filtre kahve ise,   konsola = Filtre kahve hazırlanıyor.  yazsın.     (String hangiKahve'yi kullanın !)
		        Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)
		        Eğer yanlış harf girerseniz, konsola = Hatalı tuşlama yaptınız. yazsın. (Hatalı tuslamadan sonra kod calısmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatın.)
		                                                                                     todo ----------------------------------
		        Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):    "   Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.
		       String sut olusturun.
		                                                                           todo 2.Koşul Bölümü
		       eğer String sut,  evet   e eşitse,konsola, Süt ekleniyor... yazısı gelsin.         -- (Büyük küçük harf duyarlı olmaması için String methodu kullanın. Olması gereken ihtimaller: Evet, EVET, EvEt,EVEt vs.
		      eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin.
		                                                                                    todo ----------------------------------
		        Sistem bize "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : " şeklinde bir soru sorsun. (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
		        String seker oluşturunuz.
		                                                                todo 3.Koşul Bölümü
		        todo if(){
		        Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı. Sorunun altına int kacSeker  oluşturunuz.
		        Şeker sayısını giriniz.
		        Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların heosi if bloğunun içerisinde olacak)
		        todo }
		        todo else{
		    Eğer String şeker  hayır 'a eşitse, sistem bize "Şeker eklenmiyor" cevabını versin.
		            ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak,araya boş bir nextLine koymamız gerekiyor. (String bosKod = sc.nextLine();    )  dummy kod ekleyiniz.
		  Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :   sorusunu sorsun. (büyük küçük harf duyarlılıgı olmamalı. yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.
		  String boyut oluşturun...
		                                                   todo 4.Koşul Bölümü
		        eğer String boyut Büyük boy' a eşitse =  Kahveniz büyük boy hazırlanıyor. (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")
		        Eğer String boyut  Orta Boy'a eşitse = Kahveniz orta boy hazırlanıyor.. ("Kahveniz" + boyut + "hazırlanıyor.)
		        Eğer String boyut  Küçük boy'a eşitse = Kahveniz küçük boy hazırlanıyor.    yazsın. ("Kahveniz" + boyut + "hazırlanıyor.)
		                    //todo  SONUÇ BÖLÜMÜ
		                    Siparişlerimizi verdik. Son hali görmek istiyoruz.
		                    konsola şunu yazdırın örnek :
		        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi kullanın.     orta boy için de String boyut ' u kullanın.)*/
		
		
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Java Kahve Makinesine hosgeldiniz");
		System.out.println("Menude bulunan kahveler :  \n1.Turk kahvesi \n2.Filtre Kahve \n3.Espresso");
		
		System.out.println("Hangi Kahveyi İstersiniz?");
		String hangiKahve=scan.nextLine();
		
		if(hangiKahve.equalsIgnoreCase("Turk kahvesi")) {
			System.out.println("Türk kahvesi hazirlaniyor");
		}else if (hangiKahve.equalsIgnoreCase("Filtre Kahve")) {
			System.out.println("Filtre Kahve hazirlaniyor");
		}else if (hangiKahve.equalsIgnoreCase("Espresso")) {
			System.out.println("Espresso hazirlaniyor");
		}else {
			System.out.println("Hatalı tuşlama yaptınız.");
		}
		
		System.out.println("");
		
		System.out.print("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):    ");
		String sut=scan.next();
		
		if(sut.equalsIgnoreCase("Evet")) {
			System.out.println("Süt ekleniyor...");
		}else {
			System.out.println("Süt eklenmiyor");
		}
		
		System.out.println("");
		
		System.out.print("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : ");
		String seker=scan.next();
		
		if(seker.equalsIgnoreCase("Evet")) {
			System.out.print("Kaç şeker olsun?   ");
			int kacSeker=scan.nextInt();
			System.out.println(kacSeker+ " şeker ekleniyor.");
		}else {
			System.out.println("Şeker eklenmiyor");
		}
		
		System.out.println("");
		
		System.out.println("Kahveniz hangi boyutta olsun? (Buyuk boy - orta boy - kucuk boy olarak giriniz.) : ");
		int boyut=scan.nextInt();
		//String boyut=scan.nextLine();
		//System.out.println("Kahveniz" + boyut + " hazirlaniyor ");
		
		/*if(boyut.equalsIgnoreCase("Buyuk boy")) {
			System.out.println("Kahveniz büyük boy hazırlanıyor.");
		}else if (boyut.equalsIgnoreCase("orta boy")) {
			System.out.println("Kahveniz orta boy hazirlaniyor");
		}else if (boyut.equalsIgnoreCase("kucuk boy")) {
			System.out.println("Kahveniz küçük boy hazirlaniyor");
		}else {
			System.out.println("Hatalı tuşlama yaptınız.");
		}*/
		
		if(boyut==1) {
			System.out.println("Kahveniz büyük boy hazırlanıyor.");
			System.out.println(hangiKahve+ " " +" büyük boy hazırdır. Afiyet olsun !!! ");
		}else if (boyut==2) {
			System.out.println("Kahveniz orta boy hazirlaniyor");
			System.out.println(hangiKahve+ " "+" orta boy hazırdır. Afiyet olsun !!! ");
		}else if (boyut==3) {
			System.out.println("Kahveniz küçük boy hazirlaniyor");
			System.out.println(hangiKahve+ " "+ " kucuk boy hazırdır. Afiyet olsun !!! ");
		}else {
			System.out.println("Hatalı tuşlama yaptınız.");
		}
		
		//System.out.println("");
		
		//System.out.println(hangiKahve+ " "+boyut + " hazırdır. Afiyet olsun !!! ");
		

	}

}
