package java101pratikler;

import java.util.Scanner;

public class ArmstrongSayılar {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Bir sayı giriniz.");
		int sayi=scanner.nextInt();
		int basamaksayisi=0, gecicisayi,basamakdeger,sonuc;
		gecicisayi=sayi;
		
		while(gecicisayi!=0)
		{
			gecicisayi/=10;
			basamaksayisi++;
		}
		System.out.println("basamak sayısı : "+basamaksayisi);
		gecicisayi=sayi;
		 int onlar=0,birler=0,yuzler=0,binler=0;
		
			for(int i=1;i<=basamaksayisi;i++) {
		
		birler=gecicisayi%10;
		onlar=((gecicisayi-birler)%100)/10;
		yuzler=((gecicisayi-onlar)%1000)/100;
		binler=((gecicisayi-yuzler)%10000)/1000;
		
		}
			System.out.println("Birler basamağı degeri : "+birler);
			System.out.println("Onlar basamağı degeri : "+onlar);
			System.out.println("Yüzler basamağı degeri : "+yuzler);
			System.out.println("Binler basamağı degeri : "+binler);
			sonuc=birler+yuzler+onlar+binler;
			System.out.println("Basamaklar sayı degerleri toplamaı : "+sonuc);
	}

}
