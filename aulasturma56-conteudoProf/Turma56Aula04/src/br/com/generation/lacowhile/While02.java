package br.com.generation.lacowhile;

public class While02 {

	public static void main(String[] args) throws InterruptedException {
		
		int numero = 10;
		
		while(numero >= 0) {
			
			System.out.println("Contador: " + numero);
			numero--;
			Thread.sleep(500);
		}

	}

}
