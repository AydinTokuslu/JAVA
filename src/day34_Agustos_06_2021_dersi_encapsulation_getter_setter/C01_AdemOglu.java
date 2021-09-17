package day34_Agustos_06_2021_dersi_encapsulation_getter_setter;

public class C01_AdemOglu {
    
    String name;
    String surName;
    private int age;
    
    
   public static void main(String[] args) {
        
    }
    
    public void yasAta(int age) {//obj isterse yasi set eder
         if (age<0) {
             this.age=-age;
            
        }else this.age=age;
        
    }
    public int yasGoster() {//bu metod obj isterse yasini gösterir
        
        return this.age;
        
		
	}
		
		
		
		

}
