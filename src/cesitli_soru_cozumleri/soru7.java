package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru7 {

	public static void main(String[] args) {
		// EmekliligeKacYilKaldi

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen yasinizi giriniz");
		int yas= scan.nextInt();
		
		System.out.println("lutfen cinsiyetinizi giriniz, erkek icin 1, kadin icin 2");
		int cinsiyet= scan.nextInt();
		
		
		
		if(cinsiyet==1) {
			if(yas<65) {
				System.out.println("emekli olamazsiniz, ancak " + (65-yas)+ " yil sonra emeklilige hak kazanirsiniz");
			}else {
				System.out.println("yasinda emekli olabilirsiniz");
			}
		}else {
			if(yas<60) {
				System.out.println("emekli olamazsiniz, ancak " + (60-yas)+ " yil sonra emeklilige hak kazanirsiniz");
			}else {
				System.out.println("yasinda emekli olabilirsiniz");
			}
		}
		
		scan.close();

		
	}

}
