
package exerciciosaula03;

import java.util.Scanner;

public class e03 {

	public static void main(String[] args) {
		/*3- Faça um programa que receba a idade 
		 * de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
		
		*/
		int idade;
		boolean infantil, juvenil, adulto;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite sua idade: ");
		idade = entrada.nextInt();
		infantil = (idade > 9 && idade <= 14);
		juvenil = (idade>14 && idade <= 17);
		adulto = (idade > 17 && idade <=25);
		
		if(infantil) {
			System.out.println("Infantil");
		}
		else if(juvenil) {
			System.out.println("juvenil");
		}
		else if(adulto) {
			System.out.println("adulto");
		}else {
			System.out.println("idade invalida");
			
		}
			

	}

}
