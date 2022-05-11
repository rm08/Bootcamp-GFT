package arrays;

import java.util.Random;
import java.util.Scanner;

public class Aula4 {

	public static void main(String[] args) {
		Random random = new Random();

		int[][] M = new int[4][4];

		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = random.nextInt(10);
			}
		}

		System.out.println("Matriz: ");
		for (int[] linha : M) {
			for (int coluna : linha) {
				System.out.print(coluna + " ");
			}
			System.out.println();

			int[] numerosAleatorios = new int[20];

			for (int i = 0; i < numerosAleatorios.length; i++) {
				int numero = random.nextInt(100);
				numerosAleatorios[i] = numero;
			}

			System.out.print("Numeros Aleatorios: ");
			for (int numero : numerosAleatorios) {
				System.out.print(numero + " ");
			}

			System.out.println();
			System.out.print("Sucessores dos Numeros Aleatorios: ");
			for (int numero : numerosAleatorios) {
				System.out.print((numero + 1) + " ");
			}
		}
	}
}
