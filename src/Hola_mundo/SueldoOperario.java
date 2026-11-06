package Hola_mundo;
import java.util.Scanner;
public class SueldoOperario {
	public static void main(String[] args) {
		//Desarrollar un programa en Java que calcule el sueldo de un operario, teniendo en cuenta las horas trabajadas y el valor pagado por cada hora
		// los datos se asignan directamente a la variable. MUestra el valor del sueldo en total a cobrar
		Scanner sc = new Scanner(System.in);
		int horasTrabajadas;
		double valorHora;
		
		
		System.out.print("Ingrese el nombre del trabajador: ");
		String nombre = sc.nextLine();
		System.out.print("Ingrese el valor de las horas: ");
		valorHora = sc.nextDouble();
		System.out.print("Ingrese las horas trabajadas: ");
		horasTrabajadas = sc.nextInt();
		double sueldoTotal = horasTrabajadas * valorHora;
		
		
		
		
		System.out.println("El trabajador " + nombre + " Ganara un total de: " + sueldoTotal + " dolares");
		sc.close();
	}
}
