import java.util.Scanner;

public class SoloPositivos {	
		public static void main(String[]args) {
		    Scanner in = new Scanner(System.in);
			
			for(int i =0; i<5; i++) {
				System.out.println("leer numero("+i+"):");
				int numero = in.nextInt();
				if(numero>0)
					System.out.println("numero:" + numero);
				
			}
		}
		
	}


