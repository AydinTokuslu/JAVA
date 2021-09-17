package day38_Agustos_11_2021_dersi_inheritance_methodcall;

public class Cat extends Mammal{

	public void mC() {
		System.out.println("cat");

	}
	
	public int c=9;//parenti ile ayni
    
	
	public int d=5;//int type  initialize(assaingmet) edilmiş farkli instance veriable 
	
	Cat(){
		System.out.println("p'siz cons Cat");
	}
	Cat(String s){
		this();// String p'li cons classındaki p'siz cons call
		System.out.println(super.c);//parentindeki aynı isimdeki veriable print etsin
		System.out.println("p'li cons Cat");
	}
	
}
