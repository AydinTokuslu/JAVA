package sorucozumleri_16_agustos_2021_inheritance2;

public class Runner {

public static void main(String[] args) {
		
		my_Method();
		
	}
	
	
	public static void my_Method() {
		
		SubClass subC=new SubClass();
		 System.out.println("subclas değişken degeri "+subC.num);
		 subC.goster();
		 
		 Super superC=new Super();
		 System.out.println("superclass değisken degeri "+ superC.num);
		 superC.goster();
		
	}
	
	
	
	
	
}
