package java101pratikler;

import java.util.Scanner;

public class UcgeninAlaniVeCevresi {

	public static void main(String[] args) {
		
		  double a, b, c, u, cevre, alan;
	        Scanner girdi = new Scanner(System.in);
	        System.out.println("1. kenar uzunluğu : ");
	        a = girdi.nextInt();
	        System.out.println("2. kenar uzunluğu : ");
	        b = girdi.nextInt();
	        System.out.println("3. kenar uzunluğu : ");
	        c = girdi.nextInt();
	        u = (a+b+c)/2;
	        cevre = 2*u;
	        System.out.println("Çevre:" +cevre);
	        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
	        System.out.println("Alan : "+alan);


	}

}
