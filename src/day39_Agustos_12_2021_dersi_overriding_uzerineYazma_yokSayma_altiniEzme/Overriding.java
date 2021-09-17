package day39_Agustos_12_2021_dersi_overriding_uzerineYazma_yokSayma_altiniEzme;

public class Overriding {

	public static void main(String[] args) {
		/*
		 * Overriding ::::
		 * Parent class‘daki bir methodu child class‘a gore ozellestirerek kullanmanin adidir.
		 * 
		 * OVERRIDING KURALLARI:
		 * 1) Overriding creat edilirken "method signature" (name + parameters) 
		 * kesinlikle ASLA degistirilemez.
		 * 
		 * 2) Overriding creat edilirken "access modifier" belirli kurallara gore degistirilebilir.
		 * 3) Overriding creat edilirken "return type" belirli kurallara gore degistirilebilir.
		 * 4) Overriding creat edilirken "method body" %99 degistirilir 
		 * ama degistirilmezse CTE vermez (amelelik olur, overriding amaci body creat etmek.)
		 * 
		 * 5) Overriding creat edilirken "parent-child" relationship sarttir.
		 * Ahan da trick : inheritance olmadan overriding OLAMAZZZZ
		 * 
		 * 6) "Overridden method": parent class‘daki methoddur (zavalli ezilen)
		 * 	  "Overriding method": child class‘daki methoddur (zalim ezen!)
		 * 
		 * 7) "Overriding method" (child)‘in AccMo‘ya "Overridden method" (parent) ile ayni ya da 
		 * daha genis olmali. Evlat babanin erisimini daraltamaz ama genisletebilir. 
		 * SubAccMod >= SuperAccMod
		 * 
		 * 8) "Overriding method" (child)‘in return type void ise "Overridden method" (parent) return type void olmali, 
		 * kendinden olmayani kabul etmez.  
		 * 
		 * 9) "Overriding method" (child)‘in return type Wrapper (Integer) class‘tan ise "Overridden method" (parent) return type Wrapper (Integer) class‘dan olmali, 
		 * kendinden olmayani kabul etmez.  
		 * 
		 * Ahanda trick : ezen-ezilen arasindaki return type parent-child iliskisi varsa farkli olabilir.
		 * 
		 * 10) "Overriding method" (child)‘in return type ile "Overridden method" (parent) return type arasinda is-A (child----> parent relationship) iliskisi olmali,
		 * 
		 *  11) static method‘lar overriding edilemezler. gokteki ay gibidir static methodlar.
		 *  
		 *  12) private method‘lar overriding edilemezler..neden : cunku private (private koruyucudur)
		 *  
		 *  13) final method‘lar overriding edilemezler..neden : final son halidir, artik degistirilemez de ondan
		 *  
		 *  14) "polymorphism" INTERVIEW SORUSU.....----> "overloading" ve "overriding"den olusan yapiya denir.
		 * 			 "overloading"	 ----->	public void yemek(){....}
		 * 									public void yemek(String tatli){....}
		 * 									public void yemek(String tatli. int ucret){....}
		 * 
		 * 			 "overriding" ------> 	public void icmek(){syso(gazoz)}
		 * 									public void icmek(){syso(dark ve sek bir kahve)}
		 * 									public void icmek(){syso(ucret)}
		 * 
		 * 			"overloading" ile "overriding" arasindaki farklar : 
		 * 			1)  "overloading"de method signature (name+parametre) degistirilir.(parametre degisir)
		 * 				"overriding"de method signature (name+parametre) asla degistirilemez.
		 * 
		 * 			2)  "overloading"de inheritance gerekmez.
		 * 				"overriding"de inheritance olmadan overriding yapilamaz.
		 * 
		 * 			3)  "overloading"de body genellikle degistirilmeden kullanilir.
		 * 				"overriding"de body hemen hemen her zaman degistirilir.
		 * 
		 * 			4) static method‘lar overriding edilemezler ama overloading edilebilirler.
		 * 				private method‘lar overriding edilemezler ama overloading edilebilirler.
		 * 
		 * 			5) overloading Compile Time Polymorphism‘dir ----> statik
		 * 				overriding Run Time Polymorphism‘dir ----> dinamik
		 */

	}

}
