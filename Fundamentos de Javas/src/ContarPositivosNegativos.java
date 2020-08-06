
public class ContarPositivosNegativos {

	public static void main(String[] args) {
		int[] numeros=new int [] {
				1,-3,6,8,-9,19,-20,0,17,200
		};
		
		System.out.println(numeros.length);
		int ceros=0;
		int positivos=0;
		int negativos=0;
		
		for(int i=0; i<numeros.length;i++) {
			if(numeros[i]==0) {
			ceros++;
			} else if(numeros[i]<0) {
				negativos++;
				
			}else {
				positivos++;
			}
		}
	System.out.println("la cantiad de ceros es: "+ceros);
	System.out.println("la cantiad de negativos es: "+negativos);
	System.out.println("la cantiad de positivos es: "+positivos);
	
	}
}
