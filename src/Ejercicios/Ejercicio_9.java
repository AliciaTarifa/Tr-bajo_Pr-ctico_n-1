/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 *
 */
public class Ejercicio_9 {

	/*
	 * Siguiendo en ejercicio anterior, mezclar sumas con numeros enteros y decimales, 
	 * que sucede? Describa el resultado mediante comenatrios.
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
		
		// int suma = numA + num3; --> No se puede realizar la operaci�n si se la define como int  y se opera con un int y un double, ya que
		                            // el resultado ser�a un double
		double sumar = num2 + numB + num4 + numA; // En cambio, si se utiliza double y se realiza la operaci�n entre un double y un int, el resultado ser�a 
		                            // un double por lo que la operaci�n es v�lida
		// int resta = numD - num4;
		double restar = num3 - numC;
		double resta = numD - num1;
		// int multiplicacion = numB * num1;
		double multiplicar = numC * num2;
		// int division = numD / num4;
		double dividir = num3/ numB;
		
		System.out.println("El resultado de la suma es " + sumar);
		System.out.println("El resultado de la resta es " + restar);
		System.out.println("El resultado de la resta es " + resta);
		System.out.println("El resultado de la multiplicaci�n es " + multiplicar);
		System.out.println("El resultado de la divisi�n es " + dividir);
		

	}

}
