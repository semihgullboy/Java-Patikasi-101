package java101pratikler;

public class AsalSayilar {

	public static void main(String[] args) {
		 boolean asalmi = true;
	        for (int i = 2; i < 100; i++){

	            for (int j = 2; j < i; j++){

	                if (i % j == 0) {

	                    asalmi = false;
	                    break;
	                }
	                else {
	                    asalmi = true;
	                }
	            }

	            if (asalmi == true){
	                System.out.print(i + " - ");
	            }

	        }
	}

}
