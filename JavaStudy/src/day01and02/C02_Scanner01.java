package day01and02;

import java.util.Scanner;

public class C02_Scanner01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�sim Giriniz!!!");
		
		String kullanicininIsmi = scan.nextLine();
		
		System.out.println("�sminiz:" + kullanicininIsmi);
		
		scan.close();

	}

}
