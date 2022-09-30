package java101pratikler;

import java.util.Scanner;

public class UsAlmaRecursive {
	 static int f(int a, int n){

	        if(n==1){
	            return a;
	        }

	        return f(a,n-1)*a;
	    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Taban degerini giriniz :");
		int taban = input.nextInt();
		System.out.println("Ust degerini giriniz :");
		int ust = input.nextInt();
		System.out.println(f(taban,ust));
	}

}


