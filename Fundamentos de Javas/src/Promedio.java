
public class Promedio {
    public static void main(String[]args) {
		
		float nota1= 80.9f, nota2= 90.5f, nota3= 60.0f;
		
		float Promedio = (nota1 + nota2 + nota3) / 3;
		
		if(Promedio >= 70) {
			System.out.println("El estudiante aprobo la materia con el promedio " + Promedio);
		}else {
			System.out.println("El estudiante no aprobo la materia");
		}
		
	}

}

