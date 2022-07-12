package matriz;

import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
*/
		int[] vet = new int[5];
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite 5 numeros: ");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = entrada.nextInt();
		}
		for(int i = 0; i < vet.length; i++) {
			System.out.println("numeros digitados: "+vet[i]);
		}
		
		




	}

}
