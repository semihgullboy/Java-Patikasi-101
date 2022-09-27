package java101pratikler;

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		int n1 ,n2,ebob,sayi=0,ekok=0;
		Scanner input = new Scanner(System.in);
		System.out.println("n1 degerini giriniz :");
		n1 = input.nextInt();
		System.out.println("n2 degerini giriniz :");
		n2 = input.nextInt();
		 if ( n1 >n2) {
			 sayi = n2 ;
		 
		while(sayi>0)
		{
			if(n1 % sayi == 0 && n2 % sayi == 0)
			{
				System.out.println(sayi);
				ekok= (n1*n2)/2;
				break;
			}
			 sayi--;
		}
	} 
	    else if (n2 >n1){
			sayi=n1;
			while (sayi>0)
			{
				if(n1 % sayi == 0 && n2 % sayi == 0)
				{
					System.out.println(sayi);
					ekok= (n1*n2)/2;
					break;
				}
				sayi--;
			}
		}
		System.out.println(ekok);

	}

}
