package java101pratikler;

import java.util.Scanner;

public class MinVeMaxSayi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int min=0 ,max=0;
		System.out.println("Kac tane sayi giriceksiniz:");
		int sayi = input.nextInt();
		for (int i = 1 ; i <=sayi ; i++) {
			System.out.println(i+". sayiyi giriniz");
			int sayilar= input.nextInt();
			
            if(i==1){
                min=sayilar;
                max=sayilar;
            }
            if(sayi<min){
                min=sayilar;
            }if (sayi>max) {
                max=sayilar;
            }
		}
		 System.out.println("Min: "+min);
	        System.out.println("Max: "+max);

	}

}
