package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru28 {

	public static void main(String[] args) {
	//// Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen x ve y degerlerini giriniz ve her sayi girisinden sonra ENTER‘a basiniz");
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		if (x > 0 && y > 0) {
            System.out.println("Girdiğiniz nokta 1. bölgede");
        } else if (x < 0 && y > 0) {
            System.out.println("Girdiğiniz nokta 2. bölgede");
        } else if (x < 0 && y < 0) {
            System.out.println("Girdiğiniz nokta 3. bölgede");
        } else if (x > 0 && y < 0) {
            System.out.println("Girdiğiniz nokta 4. bölgede");
        } else if (x == 0 && y!=0) {
            System.out.println("Girdiğiniz nokta Y ekseni üzerindedir");
        } else if (y == 0 && x!=0) {
            System.out.println("Girdiğiniz nokta X ekseni üzerindedir");
        }else {
            System.out.println("Orijin noktasını girdiniz");
        }
		
		
		
		
		

	}

}
