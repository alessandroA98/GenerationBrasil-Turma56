package br.com.aula06.exercicios2;

public class Pessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente();
		
		cliente.setNome("alessandro");
		cliente.setPeso(82.0);
		cliente.setTamanho(185.0);
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getPeso());		
		
	}

}
