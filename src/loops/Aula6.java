package loops;

import java.util.Scanner;

public class Aula6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Fatorial: ");
		int fatorial = sc.nextInt();
		
		int multiplicacao = 1;
		
		System.out.print(fatorial +" != ");
		for (int i=fatorial; i>=1; i--) {
			multiplicacao = multiplicacao * i;
		}
		
		System.out.println(multiplicacao);
		
		sc.close();
		
	}

}
