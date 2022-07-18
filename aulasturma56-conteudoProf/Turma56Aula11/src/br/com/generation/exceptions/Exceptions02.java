package br.com.generation.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Digite o n�mero 1: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite o n�mero2: ");
		int numero2 = sc.nextInt();
		
		int divisao = numero1 / numero2;
		
		System.out.println("O resultado �: " + divisao);
		}
		catch(ArithmeticException e) {
			System.out.println("Imposs�vel dividir por zero!!");
		}
		catch(InputMismatchException f) {
			System.out.println("Imposs�vel dividir por letra");
		}
		finally {
			System.out.println("Finalizando o programa, favor reiniciar");
		}
		sc.close();

	}

}
