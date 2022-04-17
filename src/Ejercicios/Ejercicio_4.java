/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 *
 */
/*
 * Declarar 5 variables de cada tipo de datos que utiliza Java. Dar formato al 
 * codigo mediante comentarios
 */
/* Este programa ayuda a identificar a un alumno de un personal trainer
 * teniendo en cuenta diferentes datos sobre el mismo
 * trabajando los diferentes tipos de datos con diferentes variables
 * 
 */
public class Ejercicio_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String alumno = "Alicia Tarifa"; // En este caso la variable es alumno, la que nos ayuda a 
                                         // identificarlo por nombre y apellido 
        byte numeroDeOrden = 22; // Aquí la variable es numeroDeOrden, con la cual se le asigna al alumno 
                                 //un número de orden en el listado tmando la primer letra de su apellido
        short edad = 35; // Para este tipo de dato se usó la variable edad, la que nos dice cuántos años
                         // tiene el alumno
        int DNI = 32347884; // Para este tipo de dato su uso la variable DNI, que nos brinda el número de
                            // documento de identidad del alumno
        double altura = 1.67; // Aquí la variable es altura, con este dato se puede calcular el IMC 
                              // ayuda al personal trainer a preparar la rutina adecuada para el alumno
        float peso = (float) 81.3; // En este caso, para float se eligio la ariable peso, aquí se tuvo 
                                   //que agregar la palabra float entre () para que no salga error 
        char simboloElegido = '\u03F4'; // En esta línea se toma la variable simboloElegido, con ella se toma el
                                        // el simbolo que eligio el alumno de un listado brindado por el personal 
                                        //trainer, este se utiliza para diferenciar dos alumnos con el mismo nombre
        boolean mayor = edad > 20; //Mediante este booleano se determina en que grupo pertenece el alumno, al ser mayor 
                                   //la variable ya que su edad es superior a 20

        String grupo = "Mayor de 30"; //Por último, en este String se define a que grupo pertenece el alumno tomando en 
                                     //cuenta la edad del mismo 

System.out.println("La variable alumno contiene " + alumno);
System.out.println("La variable numeroDeOrden contiene " + numeroDeOrden);
System.out.println("La variable edad contiene " + edad);
System.out.println("La variable DNI contiene " + DNI);
System.out.println("La variable altura contiene " + altura);
System.out.println("La variable peso contiene " + peso);
System.out.println("La variable simboloElegido contiene " + simboloElegido);
System.out.println("La variable mayor contiene " + mayor);
System.out.println("La variable grupo contiene " + grupo);

	}

}
