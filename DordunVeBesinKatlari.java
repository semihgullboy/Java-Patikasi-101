package java101pratikler;

import java.util.Scanner;

public class DordunVeBesinKatlari {
	
	public static void main(String[] args) {
		int a ,i;
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi giriniz :");
		a =input.nextInt();
		System.out.println("Dördün Katlari :");
		for(i = 1 ; i <= a ; i*=4)
		{

				System.out.println(i);
				
			}
		System.out.println("Besin Katlari :");
		for(i = 1 ; i <= a ; i*=5)
		{
				System.out.println(i);
				
			}
		}
		
	}

