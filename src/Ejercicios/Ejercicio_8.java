/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 *
 */
public class Ejercicio_8 {

	/*
	 * Realizar un programa que realice las operaciones basicas de suma, resta, 
	 * producto y divisi�n de dos numeros. Hacer con numeros enteros, y decimales.
	 */
	
	public static void main(String[] args) {
		
		int numA = 18;
		int numB = 2;
		int numC = 4;
		int numD = 10;
		double num1 = 1.5;
		double num2 = 7.35;
		double num3 = 26.9;
		double num4 = 5.4;
		
		int suma = numA + numC;
		int resta = numD - numC;
		int multiplicacion = numA * numC;
		int division = numD / numB;
		
		double sumar = num2 + num3;
		double restar = num3 - num4;
		double multiplicar = num2 * num1;
		double dividir = num3 / num4;
		
		System.out.println("El resultado de la suma de estos nu�meros enteros es " + suma);
		System.out.println("El resultado de la resta de estos nu�meros enteros es " + resta);
		System.out.println("El resultado de la multiplicaci�n de estos nu�meros enteros es " + multiplicacion);
		System.out.println("El resultado de la divisi�n de estos nu�meros enteros es " + division);
		System.out.println("El resultado de la suma de estos nu�meros decimales es " + sumar);
		System.out.println("El resultado de la resta de estos nu�meros decimales es " + restar);
		System.out.println("El resultado de la multiplicaci�n de estos nu�meros decimales es " + multiplicar);
		System.out.println("El resultado de la divisi�n de estos nu�meros decimales es " + dividir);

	}

}
