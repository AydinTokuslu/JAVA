package day07_Temmuz_03_2021_dersi_if_else_statements;

import java.util.Scanner;

public class if_else_statement_örnek3 {

	public static void main(String[] args) {
		// kullanıcıdan bir karakter girmesini isteyin ve girilen
		// karakterin harf olup olmadığını yazdırın.

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen bir karakter giriniz.");

		char karakter = scan.next().charAt(0);

		if ('A' <= karakter && karakter <= 'Z' || 'a' <= karakter && karakter <= 'z') {
			System.out.println("girilen karakter harf");

		} else {
			System.out.println("girilen karakter harf değil");
		}

		scan.close();

	}

}
