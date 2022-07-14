package br.com.generation.exercicios;

public class TestarCachorro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro cachorro = new Cachorro();
		
		cachorro.setNome("viralata");
		cachorro.setIdade(5);
		cachorro.emiteSom();
		
		System.out.println(cachorro.getIdade());
		System.out.println(cachorro.getNome());
		
		
	}

}
