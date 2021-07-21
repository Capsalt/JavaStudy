package homeworks;

import java.util.Scanner;

public class H14 {

	public static void main(String[] args) {
		  /* Problem Tanımı :
        Basit 4 işlem yapan bir hesap makinesi kodlayınız....
        Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
        Kullanicidan iki sayi girmesini isteyiniz.
        Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
      */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("yapmak istediğiniz işlemi giriniz");
		
		char islem =scan.next().charAt(0);
		
		System.out.println("iki sayı giriniz");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		switch (islem) {
		case '+':
			
			double toplam = sayi1+sayi2;
			System.out.println("Toplam " + toplam);
			
			break;
		case '-':
			
			double fark = sayi1-sayi2;
			System.out.println("Fark " + fark);
			
			break;
			
		case '*':
			
			double carpim = sayi1*sayi2;
			System.out.println("Çarpım " + carpim);
			
			break;
			
		case '/':
			
			double bolum = sayi1/sayi2;
			System.out.println("Bölüm " + bolum);
			
			break;

		default:
			System.out.println("Hatalı giriş");
			break;
		}
		
	}

}