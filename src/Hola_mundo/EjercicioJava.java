package Hola_mundo;
import java.util.Scanner;
public class EjercicioJava {

	//Realizar un programa que lea por teclado dos números, si el primero es mayor al segundo informar su suma y diferencia, en caso contrario informar el producto y la división del primero respecto al segundo.
	public static void main(String[] args) {
		try (Scanner Coso = new Scanner(System.in)) {
			int numero1;
			int numero2;
			System.out.print("Ingrese el primer numero: ");
			numero1 = Coso.nextInt();
			System.out.print("Ingrese el segundo numero: ");
			numero2 = Coso.nextInt();
			String respuesta = (numero1 > numero2)    
		            ? "La suma es: " + (numero1 + numero2) + " y la resta es: " + (numero1 - numero2)
		            : "El producto es: " + (numero1 * numero2) + " \nLa division es: " + (numero2 == 0 ? "No se puede dividir entre 0" : ((float)numero1 / numero2));
			System.out.println(respuesta);
		}
		
		
	}

}
