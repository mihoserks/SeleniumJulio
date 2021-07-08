package javabasics;

public class EjemploAnimal {

	public static void main(String[] args) {
		
		Animal miAnimal;
		miAnimal = new Animal ("Nala");
		miAnimal.setEdad(3);
	
		System.out.print("El nombre del animal es "+ miAnimal.getNombre()+" ");
		System.out.println("Y tiene "+miAnimal.getEdad()+" meses");
	
	}
}
