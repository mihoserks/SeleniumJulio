package javabasics;


public class Estudiante extends Persona {

	private int numEstudiante;
	private float notaFinal;
	
	public Estudiante(String nombre, String apellido, int edad, int numEstudiante, float notaFinal) {
		super(nombre, apellido, edad);
		this.numEstudiante = numEstudiante;
		this.notaFinal = notaFinal;
		
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+getNombre()+
				"\nApellido: "+getApellido()+
				"\nEdad: "+getEdad()+
				"\nNumero de Estudiante: "+numEstudiante+
				"\nNota Final: "+notaFinal);
	}

}
