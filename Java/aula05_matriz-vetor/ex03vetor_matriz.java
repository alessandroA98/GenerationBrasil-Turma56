package matriz;

import java.util.Scanner;

public class ex03vetor_matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		
		int[] n1 = new int[2]; int[] n2 = new int[2]; int[] m1 = new int[2]; int[] m2 = new int[2];
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("digite 2 matrizes de 2 numeros: ");
		for(int i = 0; i < n1.length; i++) {
			System.out.print("Digite matriz 1: ");
			n1[i] = entrada.nextInt();
		}
		for(int i = 0; i<n2.length; i++) {
			System.out.print("Digite matriz 2: ");
			n2[i] = entrada.nextInt();
		}
		
		/*a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
		das matrizes N1 e N2;*/
		
		for(int i = 0;i< n2.length; i++) {
			m1[i]= n1[i] + n2[i];
			System.out.println(" a soma das matrizes na posicao "+i+" e de: "+m1[i]);
		}
		
/*		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
		posição das matrizes N1 e N2.*/
		
		for(int i = 0; i < n2.length; i++) {
			m2[i] = n1[i]-n2[i];
			System.out.println("A diferenca de segunda matriz para a primeira é de: "+m2[i]);
		}

	}

}
