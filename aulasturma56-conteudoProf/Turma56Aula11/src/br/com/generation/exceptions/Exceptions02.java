package br.com.generation.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Digite o número 1: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite o número2: ");
		int numero2 = sc.nextInt();
		
		int divisao = numero1 / numero2;
		
		System.out.println("O resultado é: " + divisao);
		}
		catch(ArithmeticException e) {
			System.out.println("Impossível dividir por zero!!");
		}
		catch(InputMismatchException f) {
			System.out.println("Impossível dividir por letra");
		}
		finally {
			System.out.println("Finalizando o programa, favor reiniciar");
		}
		sc.close();

	}

}
