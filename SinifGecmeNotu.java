package java101pratikler;

import java.util.Scanner;

public class SinifGecmeNotu {

	public static void main(String[] args) {

		int mat, fizik, turkce, kimya, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz : ");
        mat = inp.nextInt();
        if(mat>100 || mat<0)
        {
        	mat = 0;
        }


        System.out.println("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();
        if(fizik>100 || fizik<0)
        {
        	fizik = 0;
        }

        System.out.println("Turkce notunuzu giriniz : ");
        turkce = inp.nextInt();
        if(turkce>100 || turkce<0)
        {
        	turkce = 0;
        }

        System.out.println("Kimya notunuzu giriniz : ");
        kimya = inp.nextInt();
        if(kimya>100 || kimya<0)
        {
        	kimya = 0;
        }

        System.out.println("Müzik notunuzu giriniz : ");
        muzik = inp.nextInt();
        if(muzik>100 || muzik<0)
        {
        	muzik = 0;
        }

        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
        if (avarage <= 55) {
            System.out.println("Sınıfta kaldınız seneye tekrar görüşmek üzere");
        } else {
            System.out.println("Tebrikler sınıfı geçtiniz.");
        }
        System.out.println("Ortalamanız : " + avarage);

	}

}
