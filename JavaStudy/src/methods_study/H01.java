package homeworks;

import java.util.Scanner;

public class H18 {

	public static void main(String[] args) {
		/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method oluşturun
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("İki kelime giriniz");
		String name1 = scan.nextLine();
		String name2 = scan.nextLine();
		
		yerlestir(name1,name2);
		
		scan.close();
		
	}

	public static void yerlestir(String s,String m) {
		
		if (s.length() % 2 == 0) {
			
			System.out.println(s.substring(0, s.length()/2) + m + s.substring(s.length()/2));
			
		} else {
			System.out.println("ilk kelime çift karakterli değil");

		}
		
	}

}
