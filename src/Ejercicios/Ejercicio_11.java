/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 *
 */
public class Ejercicio_11 {

	/*
	 * Realizar un programa que muestre el uso del operador relacional. Pruebe al 
	 * menos 5 ejemplos.
	 */
	public static void main(String[] args) {
		int num1 = 23;
		int num2 = 12;
		int num3 = 37;
		int num4 = 58;
		int num5 = 46;
		int num6 = 12;
		
		if (num1 <= num3) {
				System.out.println("Es menor");
		} else {
		
			System.out.println("Es mayor");
		}
		
		if (num6 == num2) {
			System.out.println("Es igual");				
		}
		
		if (num5 > num2) {
			System.out.println("Es mayor");			
		}
		if (num4 != num2) {
			System.out.println("No es igual");
		}
		if (num3 < num5) {
			System.out.println("Es menor");
		}
		if (num1 > num6) {
			System.out.println("Es mayor");
		}
	}
}


