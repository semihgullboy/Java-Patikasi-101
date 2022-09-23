package java101pratikler;

import java.util.Scanner;

public class DaireDilimininAlanıVeCevresi {
	public static void main(String[] args) {
		
		
		 Scanner dilim= new Scanner(System.in);
	        System.out.print("Dairenin yarıçapını giriniz :");
	        int r=dilim.nextInt();
	        System.out.print("Merkez açının ölçüsünü giriniz: ");
	        int a=dilim.nextInt();
	        double alan=Math.PI*r*r;
	        double cevre=2*Math.PI*r;
	        double dilimAlan=Math.PI*(r*r)*a/360;
	        System.out.println("Dairenin Alanı : "+alan);
	        System.out.println("Dairenin Çevresi : "+cevre);
	        System.out.println("Dairenin Diliminin Alanı : "+dilimAlan);
		
	
	
	}


}
