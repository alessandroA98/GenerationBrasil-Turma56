package br.com.generation.aulao2;

import java.util.Scanner;

public class entradaSaida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.println("Escreva o valor de A: ");
		a = leia.nextInt();

		System.out.println("Escreva o valor de A: ");
		b = leia.nextInt();
		
		soma = a + b;
		System.out.println("Resultado da soma: " + soma);
		
		leia.close();
		
	}

}
