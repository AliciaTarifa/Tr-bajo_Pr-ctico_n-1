/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 *
 */
public class Ejercicio_6 {


	/*
	 * Utilizar el tipo de dato entero para crear al menos 5 variables con numeros 
	 * octales y hexadecimales.
	 */
	public static void main(String[] args) {
		
		int octa1 = 017;
		int octa2 = 301;
		int hexa1 = 0x73;
		int hexa2 = 0xf4;
		int hexa3 = 0xF12A4;
		
		System.out.println(octa1);
		System.out.println(octa2);
		System.out.println(hexa1);
		System.out.println(hexa2);
		System.out.println(hexa3);
		
		String originalOcta1 = Integer.toOctalString(octa1);
		String originalOcta2 = Integer.toOctalString(octa2);
		String originalHexa1 = Integer.toHexString(hexa1);
		String originalHexa2 = Integer.toHexString(hexa2);
		String originalHexa3 = Integer.toHexString(hexa3);
	
		System.out.println("Primer octal original "  + originalOcta1);
		System.out.println("Segundo octal original "  + originalOcta2);
		System.out.println("Primer hexadecimal original "  + originalHexa1);
		System.out.println("Segundo hexadecimal original "  + originalHexa2);
		System.out.println("Tercer hexadecimal original "  + originalHexa3);
		


		
	}

}
