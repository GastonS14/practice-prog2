package ejercicio_2;

import ejercicio_1.Persona;

public class Main {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Pedro", "Chatelain", 40455545);
		Persona p2 = new Persona("Beto", "Vélez", 32455541);
		
		Encuesta e1 = new Encuesta(p2, p1, "¿Todo bien? ¿Qué onda?");
		Encuesta e2 = new Encuesta(p1, p2, "¿Cómo te llamas perrito?");
		/* Se crea otra encuesta igual a e2. Se considera que una encuesta
		   es igual a otra si las preguntas coinciden. */
		Encuesta e3 = new Encuesta(p1, p2, "¿Cómo te llamas perrito?");
		
		EmpresaConsultora empresa = new EmpresaConsultora();	

		empresa.guardarEncuesta(e1);
		empresa.guardarEncuesta(e2);
		/* e3 no se va a agregar a las encuestas respondidas, debido
		   a que p1 ya la contestó. */
		empresa.guardarEncuesta(e3);
		
		System.out.println("Cantidad de encuestas: "+empresa.getCant());
		System.out.println("Cantidad de encuestas realizadas por Pedro: "+empresa.getCantidadEmpleado(p1));

	}

}
