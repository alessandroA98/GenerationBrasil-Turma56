package matriz;

import java.util.Scanner;

public class ex04vetor_matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner teclado = new Scanner(System.in);

	        int[][] matriz = new int[3][3];
	        int soma = 0, somaDiagonal = 0;
	        String mensagem = "Digite um numero: ";

	        System.out.print(mensagem);
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz.length; j++) {
	                matriz[i][j] = teclado.nextInt();
	                soma += matriz[i][j];
	            }
	            somaDiagonal += matriz[i][i];
	            mensagem = "Valor da Soma das Matrizes = " + soma + "\nValor da Soma das Diagonais = " + somaDiagonal;
	        }
	        System.out.println(mensagem);
		
	}

}
