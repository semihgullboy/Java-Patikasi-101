package java101pratikler;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen eleman sayısını giriniz : ");

        int sayi = scan.nextInt();
        int n1 = 0,n2 = 1;
        int toplam =0;
        
        for(int i = 0;i <= sayi ;i++){
           System.out.print(n1+" ");
           toplam = n1 + n2;
           n1 =n2;
           n2 =toplam;
        }
	}

}
