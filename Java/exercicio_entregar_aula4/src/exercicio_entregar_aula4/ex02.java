package exercicio_entregar_aula4;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		int i, vet, par = 0, impar = 0;
		Scanner entrada = new Scanner(System.in);
		
		for(i=0;i<10;i++) {
			System.out.println("digite 10 numeros: ");
			vet = entrada.nextInt();
			
			if((vet % 2) == 0) {
				par += 1;
			}else {
				impar += 1;
			}
		}
		System.out.println("quantidade par: " + par);
		System.out.println("quantidade impar: " + impar);
	}

}
