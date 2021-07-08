package javabasics;

public class Animal {
	
	private String nombre;
	private int edad;
	
	public Animal(String nombreAnimal) {
		nombre = nombreAnimal;
	}

	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int nuevaEdad) {
		edad = nuevaEdad;
	}
	
	public String getNombre() {
		return nombre;
	}
}
