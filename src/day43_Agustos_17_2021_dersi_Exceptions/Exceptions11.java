package day43_Agustos_17_2021_dersi_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Exceptions11 {
	
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(
                "/Users/macbookpro/eclipse-workspace/Java-summer-2021/src/day41_Agustos_14_2021_dersi_Exceptions_istisna/file");
        int i = 0;
        while ((i = fis.read()) != -1) {
            System.out.print((char) (i));
        }
/*
 * throws keyword'u sadece declaration'dir. 
 * Throws kullanilan methodda exception olusursa CODE BLOCK olur.
 * Exceptions arasinda pranet-child iliskisi varsa parent class exception throws'dan sonra yazilmali
 */
    }
}