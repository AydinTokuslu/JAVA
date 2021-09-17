package day34_Agustos_06_2021_dersi_encapsulation_getter_setter;

public class C01_AdemOglu2_getset_versiyonu {
    
    String name;
    String surName;
    private int age;
    
    
    public static void main(String[] args) {
        
    }


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if(age>0) {
			this.age = age;
	}else this.age = -age;
    
    
		
	}
		
		
		
		

}
