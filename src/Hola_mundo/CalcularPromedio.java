package Hola_mundo;
import java.util.Scanner;
public class CalcularPromedio {
	public static void main(String[] args) {
		//construye un programa que calcule el promedio de 3 notas del aprendiz gustavo camelo
		Scanner sc = new Scanner(System.in);
		String nombre;
		double nota1;
		double nota2;
		double nota3;
		double promedio;
		double minimo = 3.0;
		
		System.out.print("Ingrese su nombre: ");
		nombre = sc.nextLine();
		System.out.print("Ingrese la primera nota: ");
		nota1 = Double.parseDouble(sc.next().replace(',', '.'));
		System.out.print("Ingrese la segunda nota: ");
		nota2 = Double.parseDouble(sc.next().replace(',', '.'));
		System.out.print("Ingrese la tercera nota: ");
		nota3 = Double.parseDouble(sc.next().replace(',', '.'));
		promedio = (nota1 + nota2 + nota3) / 3;
		String respuesta = (minimo > promedio) ? "El estudiante perdio" : "El estudiante aprobo";
		System.out.println(respuesta);
		System.out.println("El estudiante: " + nombre);
		System.out.println("El promedio de las notas es: " + promedio);
		sc.close();
	}
}