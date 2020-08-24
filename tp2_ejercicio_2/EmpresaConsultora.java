package ejercicio_2;

import java.util.Vector;

import ejercicio_1.Persona;

public class EmpresaConsultora {

	private Vector<Encuesta> encuestas;
	
	public EmpresaConsultora() {
		encuestas = new Vector<>();
	}
	
	public int getCant() {
		return encuestas.size();
	}
		
	public boolean guardarEncuesta(Encuesta encuesta){
		/* Se checkea que la encuesta no haya sido completada por el encuestado.
		   Si el encuestado ya había completado la encuesta esta no se guarda. */
		for (int i = 0; i < encuestas.size(); i++) {
			if (encuestas.elementAt(i).getPreguntas() == encuesta.getPreguntas() &&
			encuestas.elementAt(i).getEncuestado() == encuesta.getEncuestado()) {
				return false;
			}
		}
		return encuestas.add(encuesta);
	}
	
	// devuelve cuántas encuestas realizó un empleado
	public int getCantidadEmpleado(Persona empleado){
        int quantity = 0;
        for (Encuesta encuesta : encuestas) {
            if(encuesta.getEncuestador().equals(empleado))
            	quantity++;
        }
        return quantity;
    }
}
