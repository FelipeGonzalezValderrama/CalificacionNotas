package cl.felipeGonzalez;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		// Ingresa Nota por consola
		System.out.println("Ingresa su Nota del 0 al 10");
		var nota = sc.nextInt();
		//

		if (nota >= 0 && nota < 6) {
			System.out.println("Tu Nota es: " + nota + " Tu Calificacion es una F");

		} else if (nota >= 6 && nota < 7) {
			System.out.println("Tu Nota es: " + nota + " Tu Calificacion es una D");
		} else if (nota >= 7 && nota < 8) {
			System.out.println("Tu Nota es: " + nota + " Tu Calificacion es una C");

		} else if (nota >= 8 && nota < 9) {
			System.out.println("Tu Nota es: " + nota + " Tu Calificacion es una B");

		} else if (nota >= 9 && nota <= 10) {
			System.out.println("Tu Nota es: " + nota + " Tu Calificacion es una A");
			// Si la Nota no esta en el rango
		} else {
			System.out.println("Ingresaste una Nota Incorrecta " + nota);
		}
	}
}
