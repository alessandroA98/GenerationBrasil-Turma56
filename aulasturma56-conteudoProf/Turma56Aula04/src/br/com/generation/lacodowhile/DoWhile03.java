package br.com.generation.lacodowhile;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int i = 0;
		
		do {
			
			System.out.println("Digite o 1º número: ");
			int numero1 = entrada.nextInt();
			
			System.out.println("Digite o 2º número: ");
			int numero2 = entrada.nextInt();
			
			if(numero2 == 0) {
				System.out.println("Não é possível dividir por zero...");
				continue; // --> o código continua mesmo que o erro aconteça...
				//break; // ---> bloqueia a instrução do while...
			}
			
			System.out.println((i+1) + "º resultado: " + numero1 + "/" + numero2 + " é: " + (numero1/numero2));
			
			i++;
			
		}while(i <= 10);
		
		System.out.println("Fim... do Sistema...");
	}

}
