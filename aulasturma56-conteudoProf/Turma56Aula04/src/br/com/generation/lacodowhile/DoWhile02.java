package br.com.generation.lacodowhile;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		
		double a, soma = 0.0;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite um número pra soma e zero pra sair: ");
			a = entrada.nextDouble();
			soma += a;
			
		}while(a != 0.0);
		
		System.out.println("A soma dos números é: " + soma);
	}
}
