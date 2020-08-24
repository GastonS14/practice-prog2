package ejercicio_2;

import java.util.Vector;
import ejercicio_1.Persona;

public class Encuesta {
	
    private String preguntas;
	private Persona encuestado;
    private Persona encuestador;
    private int dniEncuestado;
    
    public Encuesta(Persona _encuestado, Persona _encuestador, String _preguntas) {
    	encuestado = _encuestado;
    	encuestador = _encuestador;
    	preguntas = _preguntas;
    	dniEncuestado = encuestado.getDni();
    }
    
    public String getPreguntas() {
    	return preguntas;
    }
    
    public Persona getEncuestado() {
		return encuestado;
	}

	public Persona getEncuestador() {
		return encuestador;
	}

}
