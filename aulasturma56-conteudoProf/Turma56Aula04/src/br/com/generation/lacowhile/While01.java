package br.com.generation.lacowhile;

public class While01 {

	public static void main(String[] args) throws InterruptedException {
		
		int contador = 0; // ---> inicialização
		
		
		while(contador <= 10) { // --> condição
			
			//loop.......
			System.out.println("Repetição: " + contador);
			
			contador++; // incremento
			Thread.sleep(1000); // --> instrução que determina o tempo de giro do laço... baseado em milisegundos...
		}

	}

}
