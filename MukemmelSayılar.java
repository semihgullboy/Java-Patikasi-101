package java101pratikler;

import java.util.Scanner;

public class MukemmelSayılar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total=0;
		System.out.println("Bir sayi giriniz");
		int sayi = input.nextInt();
		for(int i = 1;i<sayi;i++)
		{
			if(sayi % i == 0)
			{
				total+=i;
				System.out.println(total);
			}
		}
		if(total == sayi)
		{
		System.out.println(sayi+" mukemmel sayidir.");
		}
		else 
		{
			System.out.println(sayi+" mukemmel degildir.");
		}
	}

}
