package Hola_mundo;

import java.util.Scanner;

public class SistemaAprendices {

	public static void main(String[] args) {
		mostrarMenu();
		registrarAprendices("Jashi");
		consultarAprendices();
		double promedio = CalcularPromedio(4.5, 3.2, 5.0);
		System.out.println("El promedio calculado es: " + promedio);
	}
	public static void mostrarMenu() {
		System.out.println("=========SISTEMA DE APRENDICES=========");
		System.out.println("1. Registrar aprendices");
		System.out.println("2. Consultar aprendices");
		System.out.println("3. Calcular notas");
	}
	public static void registrarAprendices(String nombre) {
		System.out.println("Preparando el registro de aprendices..." + nombre);
	}
	public static void consultarAprendices() {
		System.out.println("Consultando informacion del aprendiz...");
	}
	public static double CalcularPromedio(double nota1, double nota2, double nota3) {
		double promedio = (nota1 + nota2 + nota3) / 3;
		System.out.println("El promedio de las notas es: " + promedio);
		return promedio;
	}
}
