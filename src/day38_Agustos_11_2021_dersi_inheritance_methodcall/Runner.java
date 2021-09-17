package day38_Agustos_11_2021_dersi_inheritance_methodcall;

public class Runner {

	public static void main(String[] args) {
		
	
	
	//Runner class'ı creat ederek  class ve cons aynı veya farklı obj ler creat ederk veriable ve metod call ile yazdırnız.
	
	Mammal obj=new Mammal();
	System.out.println(obj.c);
	
	/*
	Ayni isimli variable'lar callobj. call edilirken once objenin kendi 
	 class'indaki variable call edilir sonra parentindeki variable call edilir
	 */ 
	
	Cat c1=new Cat();//p‘siz cons ile obj. obj datatype cat classindan
	 System.out.println(c1.a);// 5 animal
	 System.out.println(c1.c);// 9 kendi class (cat) c mammal‘dan degil
	 System.out.println(c1.d);// 5 kendi class (cat)
	 System.out.println(c1.m);// 4 mammal
	 
	 
	 c1.mM();//animalmammal, animal class---> call
	 c1.mC();//cat         , cat class---> call
	 c1.mA();//mammal      , mammal class---> call
	 
	 /*
	  * method call edilirken ayni isimli methodlarin hangisinin alinacagina cons karar verir.
	  * children parente dogru hiyerrasi yapilir. Babadan dedeye once kimde bulursa onu alir.
	  * Data type ve constructor farkli classlar ----> Parent obj=new Child();
	  * parent class‘dan baslanir, child classdan degil.
	  */
	 
	 Mammal c2=new Cat("X");//c2 obj kendi class‘i mammal
	 System.out.println(c2.a);// 5 animal class---> call 
	 System.out.println(c2.c);// 7 mammal class---> call
	 System.out.println(c2.m);// 4 mammal class---> call
	 
	c2.mA();//mammal            mammal cons---> call
	c2.mC();//cat               cat cons---> call
	c2.mM();//animalmammal
	 
	 
}
}