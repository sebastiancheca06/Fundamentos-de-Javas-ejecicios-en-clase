
public class SumaVectores {
	
	public static void main(String[]args) {
		int[] v1= new int[] {
				1,-3,6,8,-9,19,-20,0,14,200
		};
		
		int[]v2= new int[] {
				1,-3,6,8,-9,19,-20,0,17,200

	    };
		
		int totalv1=0, totalv2=0;
		
		for(int i=0;i<v1.length;i++) {
	        totalv1 += v1[i];
	        totalv2 += v2[i];
	        
		}
		
		if (totalv1 > totalv2) {
			System.out.println("el vector 1 es mayor:  " + totalv1);
		}else if(totalv2>totalv1) {
			System.out.println("el vector 2 es mayor:  " + totalv2);
		}else {
			System.out.println("el vector 1 y 2 son iguales:  " + totalv2);
		}
		}
}

