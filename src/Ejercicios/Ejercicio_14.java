/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 *
 */
public class Ejercicio_14 {

	/*
	 * Conversión de tipos. Realizar un programa que muestre la conversion de tipos uppcasting
	 * y downcasting. Usar tipos enteros y decimales.
	 */
	public static void main(String[] args) {
		
		int valor1 = 167;
		int valor2 = 56;
		double valor3 = 78.3;
		double valor4 = 3.68;
		
		//Upcasting
		int valor1convertido = (int) valor3;
		System.out.println(valor1convertido);
		
		int valor2convertido = (int) valor4;
		System.out.println(valor2convertido);
		
		char convertido = (char) valor1;
		System.out.println(convertido);
		
		//Downcasting
		
		double valor3convertido = (double) valor1;
		System.out.println(valor3convertido);
		
		int valor5 = (int) valor2;
		double valor6 = (double) valor5;
		System.out.println(valor6);	
			
		

	}

}
