package exercicio_entregar_aula4;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
		Scanner entrada = new Scanner(System.in);
		int n1, soma=0, n2;
		
		System.out.println("digite um numero de repeticoes: ");
		n1 = entrada.nextInt();
		do {
			
			System.out.println("digite um numero: ");
			n2 = entrada.nextInt();
			soma += n2;
			
			n1 --;
		}while(n1 != 0);
		System.out.println("soma dos numeros digitados: "+soma);
		
		
	}

}
