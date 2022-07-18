package br.com.generation.lacodowhile;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int i = 0;
		
		do {
			
			System.out.println("Digite o 1� n�mero: ");
			int numero1 = entrada.nextInt();
			
			System.out.println("Digite o 2� n�mero: ");
			int numero2 = entrada.nextInt();
			
			if(numero2 == 0) {
				System.out.println("N�o � poss�vel dividir por zero...");
				continue; // --> o c�digo continua mesmo que o erro aconte�a...
				//break; // ---> bloqueia a instru��o do while...
			}
			
			System.out.println((i+1) + "� resultado: " + numero1 + "/" + numero2 + " �: " + (numero1/numero2));
			
			i++;
			
		}while(i <= 10);
		
		System.out.println("Fim... do Sistema...");
	}

}
