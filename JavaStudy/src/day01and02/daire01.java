package day01and02;

import java.util.Scanner;

public class daire01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dairenin yar��ap uzunlu�unu giriniz:");
		
		int yariCap = scan.nextInt();
		
		int cevre = yariCap * 2 * 3;
		int alan = 3 * yariCap * yariCap;
		
		System.out.println("�evre:" + cevre + "\nAlan:" + alan);
		
		scan.close();

	}

}
