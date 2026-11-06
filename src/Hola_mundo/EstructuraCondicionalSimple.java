package Hola_mundo;
import java.util.Scanner;
public class EstructuraCondicionalSimple {

	public static void main(String[] args) {
	Scanner coso = new Scanner(System.in);
	float sueldo;
	System.out.print("Ingrese el sueldo del trabajador: ");
	sueldo = coso.nextFloat();
	String respuesta = (sueldo < 1000) ? "El trabajador debe pagar impuestos" : "El trabajador no debe pagar impuestos";
	System.out.println(respuesta);
	}
}