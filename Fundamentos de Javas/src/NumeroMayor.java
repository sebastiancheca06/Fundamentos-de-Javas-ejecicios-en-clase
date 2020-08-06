
public class NumeroMayor {
	public static void main(String[] arg) {
		int n1 = 15;
		int n2 = 12;
		int n3 = 18;
		
		if(n1 > n2 && n1 > n3) {
			System.out.println(n1 + " es el mayor");
		}else if(n2 > n1 && n2 > n3) {
			System.out.println(n2 + " es el mayor");
		}else {
			System.out.println(n3 + " es el mayor");
		}
	}

}
