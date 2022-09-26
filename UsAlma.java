package java101pratikler;

import java.util.Scanner;

public class UsAlma {

	public static void main(String[] args) {

		  int n, k;
	        int total=1;
	        Scanner input=new Scanner(System.in);
	        System.out.print("üssü alınacak sayı  : ");
	        n=input.nextInt();
	        System.out.print("üs olacak sayı  :");
	        k=input.nextInt();

	        for (int i = 0; i < k; i++) {
	            total*=n;

	        }
	        System.out.println(n+ " üssü"+"="+total);


	}

}
