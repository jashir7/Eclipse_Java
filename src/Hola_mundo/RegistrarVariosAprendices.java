package Hola_mundo;
import java.util.Scanner;
public class RegistrarVariosAprendices {

	public static void main(String[] args) {
		try (Scanner Coso = new Scanner(System.in)) {
			int cantidadAprendices;
			String nombre;
			
			System.out.print("Ingrese la cantidad de aprendices a registrar: ");
			cantidadAprendices = Coso.nextInt();
			
			Coso.nextLine(); // Limpiar el buffer de entrada
			for (int i = 1; i <= cantidadAprendices; i++) {
				System.out.print("Ingrese el nombre del aprendiz " + i + ": ");
				nombre = Coso.nextLine();
				System.out.println("Aprendiz registrado: " + nombre);
			}
			System.out.print("Se han registrado " + cantidadAprendices + " aprendices.");
		}
	}

}
