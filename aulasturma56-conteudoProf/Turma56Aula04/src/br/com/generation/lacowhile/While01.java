package br.com.generation.lacowhile;

public class While01 {

	public static void main(String[] args) throws InterruptedException {
		
		int contador = 0; // ---> inicializa��o
		
		
		while(contador <= 10) { // --> condi��o
			
			//loop.......
			System.out.println("Repeti��o: " + contador);
			
			contador++; // incremento
			Thread.sleep(1000); // --> instru��o que determina o tempo de giro do la�o... baseado em milisegundos...
		}

	}

}
