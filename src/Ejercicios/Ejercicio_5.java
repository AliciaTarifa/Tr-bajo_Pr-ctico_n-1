/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 *
 */
public class Ejercicio_5 {

	/*
	 * Realizar un programa en donde se muestren los diferentes operadores que existen 
	 * en Java. Utilizar bloques de comentarios para estructurar el mismo.
	 */
	public static void main(String[] args) {
	
		/*
		 *  Esta primera parte del programa esta diseñada para mostrar los diferentes tipos de operadores 
		 * y su implementación.
		 * Podemos encontrar operadores de números enteros y reales:
		 * -->De operación unaria permite poner un signo delante.
		 * -->De operación aditiva se refiere a la suma y la resta.
		 * -->De operación multiplicativa multiplica o divide dos valores.
		 * -->De incremento o decremento aumenta o decrementa en 1 el valor de una variable.
		 * -->De igualdad compara si dos valores son iguales o no. El operador == devuelve  verdadero si 
		 * los dos valores son iguales, el operador != devuelve verdadero si son diferentes. El resultado de 
		 * la comparación es un valor booleano que indica si la igualdad o desigualdad es verdadera o falsa.
		 * -->De relación permite comparar dos valores: >, <, >= y <=.
		 * 
		 */
		
		int num1 = 2;
		int num2 = 6;
		int num3 = -4;
		int num4 = -2;
		double numa = 12.5;
		double numb = 9.7;
		
		int suma = num1 + num2;
		int multiplicacion = num4 * num1;
		boolean menor = num3 < 0;
		boolean igual = num2 == num4;
		double resta = numa - numb;
		double division = numa / numb;
		int parentesis = num3 * (num1 - num2);
		int sinParentesis = num3 * num1 - num2;
		int decremento = --num2;
		
		System.out.println(num3);
		System.out.println(suma);
		System.out.println(multiplicacion);
		System.out.println(menor);
		System.out.println(igual);
		System.out.println(resta);
		System.out.println(division);
		System.out.println(parentesis);
		System.out.println(sinParentesis);
		System.out.println(decremento);
		
		/*
		 * Esta segunda parte muestra el uso de operadores lógicos en un programa que utilizaría un docente,
		 * tomando el booleano presente se puede saber si el alumno estuvo presente ya que al no ingresar su 
		 * nombre el valor de length () es menor a cero, en ese caso el operador de negación devuelve que es 
		 * falso.
		 * Lo mismo sucede con las notas que se registran de cada alumno, ya que que el operador Y lógico 
		 * compara ambas notas y si una o ambas son menores que 5 devuelve false, aquí también se implementa
		 * el operador de negación.
		 * 
		 */
	
		
		boolean presente = false;
		
		String alumno = "";
		
		if (alumno.length() > 0) {
			presente = !presente;
		}
		
		System.out.println("El alumno " + alumno + " estuvo presente? " + presente);
		
		String alumno2 = "Alicia";
		
		if (alumno2.length() > 0) {
			presente = !presente;
		}
		
		System.out.println("El alumno " + alumno2 + " estuvo presente? " + presente);
		
		int nota_1_Alumno_1 = 2;
		int nota_2_Alumno_1 = 9;
		
		boolean resultadoAlumno1 = false;
		
		if (nota_1_Alumno_1 > 5 && nota_2_Alumno_1 > 5) {
			resultadoAlumno1 = !resultadoAlumno1;
		}
		
		System.out.println("El alumno 1 aprobo? " + resultadoAlumno1);
		
		int nota_1_Alumno_2 = 6;
		int nota_2_Alumno_2 = 7;
		
		boolean resultadoAlumno2 = false;
		
		if (nota_1_Alumno_2 > 5 && nota_2_Alumno_2 > 5) {
			resultadoAlumno2 = !resultadoAlumno2;
		}
		
		System.out.println("El alumno 2 aprobo? " + resultadoAlumno2);
	
		
		

	}

}
