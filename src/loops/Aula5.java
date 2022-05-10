package loops;

import java.util.Scanner;

public class Aula5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número numero para saber a tabuada: ");
		num = sc.nextInt();
		for (int i=0; i<=10; i++) {
			int total = num * i;
			System.out.println(num + "*" + i + " = " + total);
		}
		
		sc.close();
		
	}

}
