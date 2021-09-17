package Proje_BasariliMarket;



	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	import java.util.Scanner;
	
	public class baskaDeneme {
	
		/* Basrili Market alış-veriş programı.
	     *  {d,p,...l} {2.10,3.20,...,6.50}
	     * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
	     *          No     Ürün         Fiyat
	               ====  =======        =========
	                00   Domates         2.10 TL
	                01   Patates         3.20 TL
	                02   Biber           1.50 TL
	                03   Soğan           2.30 TL
	                04   Havuç           3.10 TL
	                05   Elma            1.20 TL
	                06   Muz             1.90 TL
	                07   Çilek           6.10 TL
	                08   Kavun           4.30 TL
	                09   Üzüm            2.70 TL
	                10   Limon           0.50 TL
	     * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
	     * 3. Adım: Kaç kg satın almak istediğini sorunuz.
	     * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
	     * 5. Başka bir ürün alıp almak istemediğini sorunuz.
	     * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
	     * 7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve ödem sonrasında programı bitirinzi.
	     */
			
			public static List<String> urunler= new ArrayList<>();//en basta bunlar yapıldı
			
			public static List<Double> fiyatlar= new ArrayList<>();//en basta bunlar yapıldı her yerden ulaşabilmek için class seviyede 
			
			public static List<String> sepettekiUrunler= new ArrayList(); //15
			
			public static List<Double> sepettekiFiyat= new ArrayList(); //16  
			
			public static List<Double> sepettekiKilo = new ArrayList(); //17
			
			public static void main(String[] args) {
				
				Scanner scan= new Scanner(System.in);//8
				
				urunler.addAll(Arrays.asList("Domates","Patates","Biber","Soğan","Havuç","Elma","Muz","Çilek","Kavun","Üzüm","Limon")); //1. adım
				fiyatlar.addAll(Arrays.asList(2.10,3.20,1.50,2.30,3.10,1.20,1.90,6.10,4.30,2.70,0.50));//2
				
				int urunNo;//9
				
				double kg=0;//12
				
				String devam;//28
				
				double toplam;//36
				
				
				do{urunleriListele();//3
				System.out.println("Almak istediğiniz ürünün numarasini giriniz");//7
				urunNo=scan.nextInt();//10
				System.out.println("Kaç kilo almak istiyorsunuz");//11
				kg=scan.nextDouble();//13
				
				sepeteEkle(urunNo,kg);//14
				
				toplam=sepetiYazdir();//21    //37. satirda toplami buraya atadık çünkü ödeme yap dediğimizde
				
				System.out.println("devam etmek istiyor musunuz?(E/H)");//27
				devam=scan.next(); //29
				}while(devam.equalsIgnoreCase("E"));//30
				
				
				odemeYap(toplam);//31  //38. adımda parametre gönderdik içine
				
				
				
			}
	                     public static void odemeYap(double toplam) {//35 //39. adımda içine parametre atadık
	                    	 Scanner scan= new Scanner(System.in); //43
	                    	 double miktar=0; //42
	                    	 
	                    	 
	                    	 System.out.println("Odemeniz gereken miktar= "+ toplam);//40
				
	                    	 
	                    	 do {//47 paramiz denkleşene kadar ödemek için
	                    	 System.out.println("Ne kadar paraniz var");// 41
	                    	 miktar+= scan.nextDouble();//43
	                    	 
	                    	 if (miktar<toplam) {//44
	                    		 System.out.println("PARANIZ YETERSIZ, EKLEME YAPINIZ");//45
	                    		 System.out.println("Ekleme yapacağınız miktar: "+ (toplam-miktar));//46
	                    		 
								
							}
	                    	}while(miktar<=toplam);//48
	                    	 
	                    	 
	                    	 
	                    
	                   System.out.println("şu ana kadar "+ miktar+" TL odeme yaptiniz"); //49
	                   System.out.println("toplam borcunuz "+ toplam);//50
	                   
	                   System.out.println("Para üstünüz= "+(miktar-toplam)); //51
	                   
	                   System.out.println("BIZI TERCIH ETTIGINIZ ICIN TESEKKUR EDERIZ"); //52
	                    	 
	                    	 
	                    	 
				
			}
						//33.adım da voidden doubleye çevrildi return kullanmak için
			public static double sepetiYazdir() {//22
				double sepettekiToplam=0; //32
				
				System.out.println("URUNADI"+"\t"+"KILO"+"\t"+"TUTAR"); //25
				System.out.println("-----------------------------------"); //26
				
				for (int i = 0; i < sepettekiUrunler.size(); i++) {//23
					
					System.out.println(sepettekiUrunler.get(i)+"\t"+ sepettekiKilo.get(i)+"KG"+"\t"+ sepettekiFiyat.get(i)+"TL"); //24
					sepettekiToplam+=sepettekiFiyat.get(i);//31 sepetteki ürünlerin toplam fiyatini görebilmek için
				    
				}
				return sepettekiToplam;//34
				
			}
			public static void sepeteEkle(int urunNo, double kg) {
				
				sepettekiUrunler.add(urunler.get(urunNo));//18
				sepettekiKilo.add(kg);//19
				sepettekiFiyat.add(fiyatlar.get(urunNo)*kg);//20
				
				
			}
			public static void urunleriListele() {
				
				System.out.println("NO\tURUNLER\t\tFIYATLAR");//5
				System.out.println("----------------------------------------");//6
				for (int i = 0; i < urunler.size(); i++) {//4
					
					
					System.out.println(i+"\t"+urunler.get(i)+"\t\t"+fiyatlar.get(i)+" TL");
				}
				
				
			}
		
		
		
		
		}
