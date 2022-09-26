package java101pratikler;

import java.util.Scanner;

public class FaktoriyelHesaplama {
	
	public static void main(String[] args) {
		int a ,i,toplam=1;
		Scanner input = new Scanner(System.in);
		System.out.println("Faktoriyeli alıncak sayıyı giriniz :");
		a =input.nextInt();
		for(i=1;i<=a;i++)
		{
			toplam*=i;
		}
		System.out.println(toplam);
	}
	

}
