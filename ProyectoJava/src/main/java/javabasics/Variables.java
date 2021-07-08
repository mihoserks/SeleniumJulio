package javabasics;

public class Variables {

	static int numero;
	static String caracter;
	static double decimal;
	static boolean verdaderofalso;  
	
	public static void main(String[] args) {
		
		int numero1;
		String caracter1;
		double decimal1;
		boolean verdaderofalso1;
		
		numero = 1;
		numero1 = 2;
		caracter = "Holas";
		caracter1 = "Mundo";
		decimal = 1.1;
		decimal1 = 2.1;
		
		verdaderofalso = caracter.equals("Hola");
	
	
	if (caracter1.equals("Mundo")) {
			verdaderofalso1 = true;
	} else {
			verdaderofalso1 = false;
	}
		System.out.println(numero+numero1);
		System.out.println(caracter+" "+caracter1);
		System.out.println(decimal+decimal1);
		System.out.println(verdaderofalso);
		System.out.println(verdaderofalso1);
	}
	
}
