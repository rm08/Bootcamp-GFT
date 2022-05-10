package arrays;

import java.util.Random;
<<<<<<< HEAD
=======
import java.util.Scanner;
>>>>>>> 43bbbcab174211ba53ba6cf14b0ce422cd81ec3e

public class Aula3 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] numerosAleatorios = new int[20];
		
		for(int i=0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.print("Numeros Aleatorios: ");
		for(int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		
		System.out.println();
<<<<<<< HEAD
		System.out.println("Sucessores dos Numeros Aleatorios: ");
=======
		System.out.print("Sucessores dos Numeros Aleatorios: ");
>>>>>>> 43bbbcab174211ba53ba6cf14b0ce422cd81ec3e
		for(int numero : numerosAleatorios) {
			System.out.print((numero+1) + " ");
		}
		
	}
}
