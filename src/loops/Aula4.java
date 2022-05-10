package loops;

import java.util.Scanner;

public class Aula4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int impar = 0;
		int par = 0;
		int count = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			
			if(num % 2 == 0) 
				par++;
		    else impar++;
				
			count ++;
		} while(count < num);
		
		
		System.out.println("Quantidade de impar: " + impar);
		System.out.println();
		System.out.println("Quantidade de par: " + par);
		
		sc.close();
		
	}

}
