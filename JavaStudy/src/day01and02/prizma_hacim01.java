package day01and02;

import java.util.Scanner;

public class prizma_hacim01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Uzun Kenar giriniz:");
		
		int uzunKenar = scan.nextInt();
		
		System.out.println("Kýsa Kenar giriniz:");
		
		int kisaKenar = scan.nextInt();
		
		System.out.println("Yükseklik giriniz:");
		
		int yukseklik = scan.nextInt();
		
		int hacim = kisaKenar * uzunKenar * yukseklik;
		
		
		System.out.println("Hacim:" + hacim);
		
		scan.close();
		
	}

}
