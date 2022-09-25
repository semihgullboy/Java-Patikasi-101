package java101pratikler;

import java.util.Scanner;

public class SicaklikEtkinlik {

	public static void main(String[] args) {
		 int heat;   
		    Scanner input = new Scanner(System.in);    
		    System.out.println("Sicaklik girin: ");
		    heat = input.nextInt();
		    if (heat < 5)
		        System.out.print("Kayak yapabilirsiniz.");
		    else if (heat >= 5 && heat < 10){
		        System.out.print("Sinemaya gidebilirsiniz.");
		    } else if (heat >=10 && heat < 15){
		        System.out.print("Sinemaya veya piknige gidebilirsiniz.");   
		    } else if (heat >= 15 && heat <25){
		        System.out.print("Pikniğe gidebilirsiniz.");
		    } else{
		        System.out.print("Yüzmeye gidebilirsiniz.");
		    }
		    
	}

}
