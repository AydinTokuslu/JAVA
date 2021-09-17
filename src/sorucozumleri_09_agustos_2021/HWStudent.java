package sorucozumleri_09_agustos_2021;

public class HWStudent {
    /*Write program as a Student class   that has instance variables name and address.
     *  Create a constructor that will initialize those variables. 
     *  Print name & address of given  student by the displayInfo method.
     *  
     *  Programı, örnek değişkenlerin (instance variables) adı ve adresi olan bir Student sınıfı olarak yazın.
     *   Bu değişkenleri başlatacak bir kurucu --> constructor oluşturun. 
     *   DisplayInfo methodu  ile verilen öğrencinin adını ve adresini yazdırın.
     */
    
    String name;
    String address;
    
    public HWStudent(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }
    
    
    
	public static void main(String[] args) {
        HWStudent ogrnc= new HWStudent("Tolga Demir","büyük dut agacının altı");
        ogrnc.DisplayInfo();
        
    }
    private void DisplayInfo() {
        System.out.println(name+ " "+address);
        
    }
}
