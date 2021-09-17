package day42_Agustos_16_2021_dersi_Exceptions_istisna_2;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Exceptions04 {
    public static void main(String[] args) {
        try {// parent try-catch--> file yerini kontrol ediyor ya evde yoksa hatasini handle
                // ediyor
            FileInputStream fis = new FileInputStream(
                    "/Users/macbookpro/eclipse-workspace/Java-summer-2021/src/day41_Agustos_14_2021_dersi_Exceptions_istisna/file");
            fis.close();//fis obj close edildi
            int i = 0;
            // child try-catch --> file icerigini okuma ve yazdirma islemini handle etti
            while ((i = fis.read()) != -1) {// iint degeri fis obj read metodu ile atandiginda -1 esit degilse while
                                            // bodye gir
                System.out.print((char) (i));// (i) data casting ile i'nin ascii degeri yerine char degerleri
                                                // yazdirildi
            }
        }
        catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
        catch (IOException e) {// I :input O:output dosyalarla ilgili genel yazma ve okuma sorunlari ile handle
                                // eder
            // e.printStackTrace();//daha cok kullanilir cunku hatanin tum verisini verir
            // handle kolayligi saglar
            System.out.println(e.getMessage());// hata mesajini yazdirir
        }
        
        System.out.println();
        System.out.println("dewamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur...");

		        
		        
		    }
		}
		    
		
		        
		
		
		
		
		
		

	


