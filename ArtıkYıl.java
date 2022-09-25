package java101pratikler;

import java.util.Scanner;

public class ArtıkYıl {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int yil,kalan;
		System.out.println("Bir yıl giriniz.");
		yil=scanner.nextInt();
		kalan=yil%4;
		if(kalan==0)
		{
			System.out.println(yil +" Bir artık yıldır.");
		}
		
		else 
		{
			System.out.println(yil+"Bir artık yıl değildir.");
		}
	}

}
