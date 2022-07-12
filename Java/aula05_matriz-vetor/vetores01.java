package br.com.generation.vetores;

import java.util.Scanner;

public class vetores01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=0;
Scanner entrada = new Scanner(System.in);
System.out.println("digite um n: ");
n = entrada.nextInt();
int[] vetor = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Posicao: " + i + " | "+ vetor[i]);
			vetor[i] = entrada.nextInt();
		}
		for(int i = 0; i < n; i++) {
			System.out.println("Posicao: " + i + " | info: "+ vetor[i]);
		}
		
		
		
		
		
	}

}
