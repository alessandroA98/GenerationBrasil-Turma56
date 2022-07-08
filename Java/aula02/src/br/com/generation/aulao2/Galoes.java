package br.com.generation.aulao2;

import java.util.Scanner;

public class Galoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double galoes, litros;
		
		System.out.println("Escreva quantidade de galoes: ");
		
		galoes = leia.nextInt();
		
		litros = galoes * 3.600;
		
		System.out.println("litros: " + litros);
	}

}
