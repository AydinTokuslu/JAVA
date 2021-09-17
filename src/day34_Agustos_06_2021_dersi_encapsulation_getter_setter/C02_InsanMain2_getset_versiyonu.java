package day34_Agustos_06_2021_dersi_encapsulation_getter_setter;

public class C02_InsanMain2_getset_versiyonu {
    public static void main(String[] args) {
        
    
    
    	C01_AdemOglu2_getset_versiyonu insan1= new C01_AdemOglu2_getset_versiyonu(); //ademoglundan insan1 obj creat ettim
    //insan1.age=-47;
    insan1.name="onur";
    insan1.surName="enes";
    insan1.setAge(-34);//sette parametre var, return yok
    System.out.println(insan1.name);//onur
    System.out.println(insan1.surName);//enes
    System.out.println(insan1.getAge());//34//gette parametre yok, return var.
	
	}
	
	
	
}
