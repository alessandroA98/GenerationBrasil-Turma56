package br.com.generation.teste.software;

import java.util.Scanner;

public class TestaMetodoUnitario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Calculadora calc = new Calculadora();
		
		int resultadoEsperado = 4;
		
		System.out.println("Digite os valores: ");
		double resultado = calc.somar(entrada.nextDouble(), entrada.nextDouble());
		
		if(resultado == resultadoEsperado) {
			System.out.println("OK");
		}
		else {
			System.out.println("Falhou!");
		}

	}

}
