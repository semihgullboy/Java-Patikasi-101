package java101pratikler;

import java.util.Scanner;

public class KdvHesaplayanUygulama {

	public static void main(String[] args) {

		  double kdvtutar1, kdvtutar2, hamfiyat, kdvorani1 = 0.18, kdvorani2 = 0.08 ;

	        Scanner inp = new Scanner(System.in);
	        System.out.print("KDV'siz Fiyat : ");
	        hamfiyat = inp.nextDouble();
	       kdvtutar1 = kdvorani1*hamfiyat;
	       kdvtutar2 = kdvorani2*hamfiyat;
	        boolean kosul1 = hamfiyat >1000;
	        System.out.println(kosul1 ? "KDV Oranı :" + kdvorani2 : "KDV Oranı :" + kdvorani1);
	        System.out.println(kosul1 ? "KDV Tutarı :" + kdvtutar2 : "KDV Tutarı :" + kdvtutar1);
	        System.out.print(kosul1 ? "KDV'li Fiyat :" + (kdvtutar2 + hamfiyat) : "KDV'li Fiyat :" + (hamfiyat + kdvtutar1)  );
	}

}
