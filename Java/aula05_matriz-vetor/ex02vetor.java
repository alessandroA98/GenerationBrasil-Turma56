package matriz;

import java.util.Random;

public class ex02vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Random aleatorio = new Random();

	    	    int[] dado = new int[10];
	        double media = 0, contador = 0, maiorNumero = 0, soma = 0;
	        String mensagem;

	        for (int i = 0; i < dado.length; i++) {
	            dado[i] = aleatorio.nextInt((6 - 1) + 1) + 1;
	            if (maiorNumero < dado[i]) {
	                maiorNumero = dado[i];
	                }
	            soma += dado[i];
	            media = soma / dado.length;
	            }

	        for (int i = 0; i < dado.length; i++) {
	            System.out.println(dado[i]);
	            if (dado [i] == maiorNumero) {
	                contador++;
	        }
	        }
	        mensagem = "Média de Lançamentos = " + media + "\nNumero de Lançamentos: " + contador;
	        System.out.println(mensagem);
	    }
	}


