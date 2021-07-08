package javabasics;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
	System.out.println("Diguite el primer numero: ");
	Scanner num1 = new Scanner(System.in); 

		int numero1 = num1.nextInt();
		int numero2 = 3;
		
	System.out.println("La suma de "+numero1+" mas "+numero2+" es: "+(numero1+numero2));
	System.out.println("La resta de "+numero1+" menos "+numero2+" es: "+(numero1-numero2));
	System.out.println("La multiplicación de "+numero1+" por "+numero2+" es: "+(numero1*numero2));
	System.out.println("La divicion de "+numero1+" entre "+numero2+" es: "+(numero1/numero2));
	
	num1.close();
	}
}
