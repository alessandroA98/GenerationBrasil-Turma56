package exercicio_entregar_aula4;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		//idade for =-99. (WHILE)
		Scanner entrada = new Scanner(System.in);
		int menor = 0, maior = 0, idade=0;
		String pessoas;
		
		while(idade != -99) {
			System.out.println("nome: ");
			pessoas = entrada.next();
			System.out.println("idade: ");
			idade = entrada.nextInt();
			
			if(idade < 21) {
				menor += 1;
			}else if(idade > 50) {
				maior += 1;
			}
		}
		System.out.println("pessoas maior que 50: " + maior);
		System.out.println("pessoas menor que 21: " + menor);
	}

}
