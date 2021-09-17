package day38_Agustos_11_2021_dersi_inheritance_methodcall;

public class Mammal extends Animal{

	public void mA() {//parenti ile ayni isimde
		System.out.println("mammal");

	}
	
	public void mC() {
		System.out.println("cat"+"mammal");

	}
	
	public int c=7;//farkli instance variable
    
	
	public int m=4;//int type  initialize(assaingmet) edilmiş biri parentindeki veriable aynı isimde 
	
	public Mammal() {
		this('A');
		System.out.println("p‘siz mammal cons.");
	}
	
	public Mammal(char c) {
		super(34);//parentten p‘li cons call
		System.out.println("char p‘li mammal cons.");
	}
	
	
}
