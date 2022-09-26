package java101pratikler;

import java.util.Scanner;

public class IkiVeDordunKatları {
	
	public static void main(String[] args)
	{
		 int n;
	        int total = 0;
	        Scanner scan = new Scanner(System.in);
	       do {
	            System.out.print("sayı giriniz : ");
	            n = scan.nextInt();
	            if (n % 2 == 0 && n%4==0)
	                total += n;
	        } while (n % 2 == 0);
	        System.out.print("Toplam : " + total);
	}
}
