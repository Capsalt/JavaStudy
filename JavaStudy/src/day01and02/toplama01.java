package day01and02;

import java.util.Scanner;

public class toplama01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci say�y� giriniz:");
		
		int firstNumber = scan.nextInt();
		
		System.out.println("�kinci sayiyi giriniz:");
		
		int secondNumber = scan.nextInt();
		
		int toplam = firstNumber + secondNumber;
		int fark = firstNumber - secondNumber;
		int carpim = firstNumber * secondNumber;
		
		System.out.println("Toplam:" + toplam + "\nFark:" + fark + "\n�arp�m:" + carpim);
		
		scan.close();

	}

}
