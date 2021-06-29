package day01and02;

import java.util.Scanner;

public class kare01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Karenin Bir kenar uzunluðu:");
		
		int birKenar = scan.nextInt();
		
		int cevre = birKenar * 4;
		int alan = birKenar * birKenar;
		
		System.out.println("Çevre:" + cevre + "\nAlan:" + alan);
		
		scan.close();

	}

}
