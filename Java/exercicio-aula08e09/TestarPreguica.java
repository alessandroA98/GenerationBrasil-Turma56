package br.com.generation.exercicios;

public class TestarPreguica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Preguica pg = new Preguica();
		
		pg.setIdade(10);
		pg.setNome("Verinha");
		pg.emiteSom();

		System.out.println(pg.getNome());
		System.out.println(pg.getIdade());
		

	}

}
