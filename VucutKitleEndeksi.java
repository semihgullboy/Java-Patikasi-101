package java101pratikler;

import java.util.Scanner;

public class VucutKitleEndeksi {

	public static void main(String[] args) {
		
		double kilo,boy,indeks;
		System.out.print("Boyunuzu giriniz.");
		Scanner scanner=new Scanner(System.in);
		boy=scanner.nextDouble();
		System.out.print("kilonuzu giriniz.");
		kilo=scanner.nextDouble();
		indeks=kilo/(boy*boy);
		System.out.print("Vücut kitle endeksiniz="+indeks);

	}

}
