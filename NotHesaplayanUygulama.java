package java101pratikler;

import java.util.Scanner;

public class NotHesaplayanUygulama {

	public static void main(String[] args) {
		
		  int mat, fizik, kimya, turkce, muzik, biyo;
	        Scanner input = new Scanner(System.in);

	        System.out.print("Matematik Notunu Giriniz :");
	        mat = input.nextInt();
	        System.out.print("Fizik Notunu Giriniz :");
	        fizik = input.nextInt();
	        System.out.print("Kimya Notunu Giriniz :");
	        kimya = input.nextInt();
	        System.out.print("Türkçe Notunu Giriniz :");
	        turkce = input.nextInt();
	        System.out.print("Müzik Notunu Giriniz :");
	       muzik = input.nextInt();
	        System.out.print("Biyoloji Notunu Giriniz :");
	        biyo = input.nextInt();

	        int sonuc = mat + fizik + kimya + turkce + muzik + biyo;
	        double ortalama = sonuc / 6;

	        System.out.println("Ortalama: " + ortalama);
	        System.out.println(ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");


	}

}
