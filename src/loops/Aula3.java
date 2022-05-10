package loops;

import java.util.Scanner;

public class Aula3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int count = 0;
		int soma = 0;
		int total;
		
		do {
			System.out.println("Número: ");
			num = sc.nextInt();
			soma += num;
			count++;
		} while (count < 5);
		total = soma/count;
		
		System.out.println("Médial é igual: " + total);
		
		sc.close();
		
	}

}
