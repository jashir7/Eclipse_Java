package Hola_mundo;
import java.util.Scanner;
public class AprendicesWhile {

	public static void main(String[] args) {
		try (Scanner Coso = new Scanner(System.in)) {
			int numero = 1;
			int cantidadAprendices;
			String nombre;
			
			System.out.println("Ingrese la cantidad de aprendices a registrar: ");
			cantidadAprendices = Coso.nextInt();
			
			Coso.nextLine(); // Limpiar el buffer de entrada
		
			while (numero <= cantidadAprendices) {
			System.out.print("Ingrese el nombre del aprendiz " + numero + ": ");
			nombre = Coso.nextLine();
			System.out.println("Aprendiz registrado: " + nombre);
			numero++;
			}
			System.out.print("Se han registrado " + cantidadAprendices + " aprendices.");
		}
	}
}
