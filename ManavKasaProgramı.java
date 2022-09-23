package java101pratikler;

import java.util.Scanner;

public class ManavKasaProgramı {

	public static void main(String[] args) {
		double armutf = 2.14, elmaf = 3.67, domatesf = 1.11, muzf = 0.95, patlicanf = 5.00, toplam;
		double armut ,elma,domates,muz,patlican;

	      Scanner inp = new Scanner(System.in);

	        System.out.println("Armut Kilo ? : ");
	        armut = inp.nextDouble();

	        System.out.println("Elma Kilo ? : ");
	        elma = inp.nextDouble();

	        System.out.println("Domates Kilo ? : ");
	        domates = inp.nextDouble();

	        System.out.println("Muz Kilo ? : ");
	        muz = inp.nextDouble();

	        System.out.println("Patlican Kilo ? : ");
	        patlican = inp.nextDouble();

	        toplam = armutf*armut + elmaf*elma +domatesf*domates+muzf*muz+patlicanf*patlican;
	        System.out.println("Toplam Tutar : " + toplam );
	}

}
