/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 *
 */
public class Ejercicio_12 {

	/*
	 * Realizar un programa que muestre el uso del operador lógico. Pruebe al 
	 * menos 5 ejemplos.
	 */
	public static void main(String[] args) {
		
		int numero1 = 88;   int luis = 35;
		int numero2 = 112;  int tiziano = 13;
		int numero3 = 68;   int felipe = 10;
		int numero4 = 179;  int matias = 24;
		
		if (numero1 < 100 && numero3 < 100) {
			System.out.println(numero1 + " y " + numero3 + " son menores de 100");
		}
		if (numero2 > 100 && numero4 >100) {
			System.out.println(numero2 + " y " + numero4 + " son mayores de 100");
		}
		if (luis > 18 || matias >18) {
			System.out.println("Luis y Matias son adultos");
		}
		if (tiziano < 18 || felipe <18) {
			System.out.println("Tiziano y Felipe son niños");
		}
		if (!false) {
			System.out.println("Es mayor");
		}
	
	}

}
