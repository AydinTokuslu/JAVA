package day10_Temmuz_07_2021_dersi_String_Manipulation;

public class String_Manipulation_Equals_vs_doubleEqual {

	public static void main(String[] args) {
		
		String name1="Ali Can";
		String name2="Ali Can";
		String name3=name2+""; // space yok
		String name4="Ali";
		String name5="Can";
		String name6=name4+" "+name5;  // Ali Can
		
		System.out.println(name1.equals(name2)); //true
		System.out.println(name1.equals(name3)); //true
		System.out.println(name2.equals(name6)); //true
//ilk 3 karşılaştırmada değerler aynı olduğu için hep true oldu
		
		System.out.println(name1 == name2); //true
		System.out.println(name1 == name3); //false
		System.out.println(name2 == name6); //false
// farklı objeler aynı değeri aldığında java referanslara bakar.
// bu referanslar aynı ise == true döndürür, yoksa false döndürür.
// değerleri karşılaştırmak ve süpriz yaşamamak istiyorsanız equals() kullanmalısınız.
		
		
		String name7="AlI CAN";
		String name8="AlI cAn";
		String name9="ali can";
		String name10="AliCan";
		
		System.out.println(name1.equalsIgnoreCase(name7)); //TRUE
		System.out.println(name1.equals(name7)); //false
		
		System.out.println(name7.equalsIgnoreCase(name9)); //TRUE
		System.out.println(name8.equalsIgnoreCase(name9)); //TRUE
		System.out.println(name9.equalsIgnoreCase(name10)); //false
		System.out.println(name3);
		
	}

}
