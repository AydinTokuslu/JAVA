package sorucozumleri_09_agustos_2021;

public class BookClass {

	 /*
     * Write program as a Book class that will have 2 Constructors. While creating
     * an object make sure: Instance variables are being initialized Both
     * Constructors are being executed
     * 
     * 
     * Programı 2 Yapıcıya sahip olacak bir Kitap sınıfı olarak yazın.
     *  iki kitap creat ederek  disPlay metodu ile kitapları yazdırınız
     */
   
	String title, author;
    int publish;
    static int pages;
    
   
	public BookClass(String title, String author, int publish) {
        super();
        this.title = title;
        this.author = author;
        this.publish = publish;
    }
    public static void main(String[] args) {
        BookClass kitap1=new BookClass("suc ve ceza","Dostayevski",2000);
        BookClass kitap2=new BookClass("calikusu","Resat Nuri",1935);
        
        kitap1.disPlay();
        kitap2.disPlay();
        
    }
    public void disPlay() {
        System.out.println("kitabiniz : "+title+" , yazari : "+author+" , yayın yili :"+publish);
        
	
    }
	
	
}
