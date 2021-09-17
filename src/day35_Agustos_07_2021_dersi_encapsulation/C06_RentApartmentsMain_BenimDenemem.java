package day35_Agustos_07_2021_dersi_encapsulation;

import java.util.Scanner;

public class C06_RentApartmentsMain_BenimDenemem {

	public static void main(String[] args) {
		/*
		Burada iki adet class vardır. Biri Main diğeri ise rentApartments
	    rentApartments'ın içinde;
	    Bu variable'ları private olarak oluşturun;
	    String name
	    int roomCount
	    boolean balconyOrNo

	   Bütün variable'lar için getter ve setter oluşturunuz.

	    4 farklı Apartment(apartman dairesi) vardır. 0, 1, 2, 3 rooms(odalı)
	    -----------------------------------------------------------------
	    Bir method oluşturun;
	    Eğer room sayısı 0 ise,
	    rent(kira) 1400
	    Eğer oda sayısı 1 ise,
	    rent  1700
	    Eğer oda sayısı 2 ise,
	    rent 2200
	    Eğer oda sayısı 3 ise,
	    rent 2700
	    rent'i return'leyin.
	    ----------------------------------------------------------------
	    Bir method oluşturun.
	    Eğer balconyOrNo  true ise,
	    rent'e 200 dollar ekleyin.

	    Main class'ın içinde;
	    userName rent is amountOfRent
	    */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen adinizi giriniz");
		String name=scan.nextLine();
		
		System.out.println("lutfen kac odali bir daire istediginizi giriniz");
		int odaSayisi=scan.nextInt();
		
		System.out.println("lutfen balkonlu oda isteyip istemediginizi true/false olarak giriniz");
		boolean balcony=scan.nextBoolean();
		
		C05_RentApartments_BenimDenemem kiraci=new C05_RentApartments_BenimDenemem();
		kiraci.setName(name);
		kiraci.setRoomCount(odaSayisi);
		kiraci.setBalconyOrNo(balcony);
		
		int toplamKira=kiraci.kiraHesapla(odaSayisi)+kiraci.balkonSor(balcony);
		System.out.println(kiraci.getName()+ " bey oda ucretiniz : "+ toplamKira+" dolar");

	}

}
