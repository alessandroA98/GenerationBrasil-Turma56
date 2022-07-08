package exerciciosaula03;

import java.util.Scanner;

public class e04 {

	public static void main(String[] args) {
		/*4- Faça um programa em que permita a entrada
		 *  de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também
 a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
		*/ 
				
				Scanner leia= new Scanner(System.in);
				
				int num, i;
				
				System.out.println("Informe um numero: ");
				num = leia.nextInt();
				
				if(num % 2 == 0) {
				System.out.println("O numero informado par!");
				System.out.println("E sua raiz quadrada correponde a: "+Math.sqrt(num));
				                 }
			    else {System.out.println("impar!");
			    System.out.println("E quando elevamos seu numero ao quadrado o resultado: "+num*num);
				
				
				}
			}
		
	}
