package exercicios;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor 1: ");
		double valor1 = sc.nextDouble();
		System.out.println("Digite o valor 2: ");
		double valor2 = sc.nextDouble();
		System.out.println("Digite a hora do dia: ");
		int hora = sc.nextInt();
		System.out.println("Qual o valor para emprestimo: ");
		double valorE = sc.nextDouble();
		System.out.println("Quantas parcelas 1, 2 ou 3 ? ");
		int parcelas = sc.nextInt();
		
		Calculadora.soma(valor1, valor2);
		System.out.println();
		Calculadora.subtracao(valor1, valor2);
		System.out.println();
		Calculadora.multiplicacao(valor1, valor2);
		System.out.println();
		Calculadora.divisao(valor1, valor2);
		System.out.println();
		Mensagem.obterMensagem(hora);
		System.out.println();
		Emprestimo.calcular(valorE, parcelas);		

		sc.close();
	}

}
