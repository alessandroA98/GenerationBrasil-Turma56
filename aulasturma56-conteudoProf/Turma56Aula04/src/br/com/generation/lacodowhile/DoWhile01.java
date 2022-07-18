package br.com.generation.lacodowhile;

public class DoWhile01 {

	public static void main(String[] args) throws InterruptedException {
		
		
		int i = 0; // inicialização da variavel
		do {
			
			
			System.out.println("Contador: " +  i );
			//loop.....
		
		
		i++; // --> incremento
		Thread.sleep(500);
		
		}while(i <= 10);

	}

}
