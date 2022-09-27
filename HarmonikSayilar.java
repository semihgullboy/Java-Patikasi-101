package java101pratikler;

import java.util.Scanner;

public class HarmonikSayilar {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Bir sayı giriniz:");
		int sayi=scanner.nextInt();
		double sonuc=0;
		double a=1;
		for(int i=1;i<=sayi;i++)
		{
			
			sonuc+=(a/i);
		}
		System.out.println(sonuc);
	}

}
