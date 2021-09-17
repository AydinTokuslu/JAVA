package day10_Temmuz_07_2021_dersi_String_Manipulation;

public class String_Manipulation_indexOf_örnek1 {

	public static void main(String[] args) {
		
		
		String str="java öğrenmek ne güzel";
		System.out.println(str.indexOf("e")); //8
		System.out.println(str.indexOf(' ')); //4
		System.out.println(str.indexOf('e',13)); //15
		System.out.println(str.indexOf("mek")); //10
		System.out.println(str.indexOf("")); //0
		System.out.println(str.indexOf("J")); //-1 çünkü büyük J yok
		System.out.println(str.indexOf(10)); // index numarası ile çağıramayız bu metodla
		System.out.println(str.indexOf("java")); //0 index
		

	}

}
