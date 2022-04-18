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
	 * producto y división de dos numeros. Hacer con numeros enteros, y decimales.
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
		
		System.out.println("El resultado de la suma de estos nuúmeros enteros es " + suma);
		System.out.println("El resultado de la resta de estos nuúmeros enteros es " + resta);
		System.out.println("El resultado de la multiplicación de estos nuúmeros enteros es " + multiplicacion);
		System.out.println("El resultado de la división de estos nuúmeros enteros es " + division);
		System.out.println("El resultado de la suma de estos nuúmeros decimales es " + sumar);
		System.out.println("El resultado de la resta de estos nuúmeros decimales es " + restar);
		System.out.println("El resultado de la multiplicación de estos nuúmeros decimales es " + multiplicar);
		System.out.println("El resultado de la división de estos nuúmeros decimales es " + dividir);

	}

}
