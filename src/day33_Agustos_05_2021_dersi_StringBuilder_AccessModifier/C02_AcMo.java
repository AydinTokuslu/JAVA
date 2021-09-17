package day33_Agustos_05_2021_dersi_StringBuilder_AccessModifier;

public class C02_AcMo {

	public static void main(String[] args) {
C01_AcMo obj1 =new C01_AcMo(); //C01 classindan obj1 creat ettik
        
        System.out.println(obj1.defaultAge);//15
        System.out.println(obj1.protectedAge);//32
        System.out.println(obj1.publicAge);//61
        
        
        C03_AcMo name= new C03_AcMo();
        System.out.println(name.protectedName);//hakan tetik
        System.out.println(name.defaultName);//murat bey
        System.out.println(name.publicName);//Dayanch bey

	}

}
