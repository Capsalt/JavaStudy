package day03;

import java.util.Scanner;

public class C1_Scanner01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ýsminizi giriniz:");
		
		char ilkHarf = scan.next().charAt(0);
		
		System.out.println("Girdiðiniz ismin ilk harfi:" + ilkHarf);
		
		scan.close();
	}

}
