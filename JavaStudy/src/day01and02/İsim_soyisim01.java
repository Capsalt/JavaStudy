package day01and02;

import java.util.Scanner;

public class �sim_soyisim01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�sminizi giriniz:");
		
		String isim = scan.nextLine();
		
		System.out.println("Soyisminizi giriniz:");
		
		String soyIsim = scan.nextLine();
		
		System.out.println("Say�n " + isim + " " + soyIsim + " Kursumuza kat�l�m ba�vurunuz al�nm��t�r, te�ekk�r ederiz.");
		
		scan.close();
	}

}
