package day01and02;

import java.util.Scanner;

public class Ýsim_soyisim01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ýsminizi giriniz:");
		
		String isim = scan.nextLine();
		
		System.out.println("Soyisminizi giriniz:");
		
		String soyIsim = scan.nextLine();
		
		System.out.println("Sayýn " + isim + " " + soyIsim + " Kursumuza katýlým baþvurunuz alýnmýþtýr, teþekkür ederiz.");
		
		scan.close();
	}

}
