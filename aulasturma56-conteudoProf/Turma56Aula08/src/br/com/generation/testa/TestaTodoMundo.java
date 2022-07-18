package br.com.generation.testa;

import br.com.generation.funcionarios.Professor;

public class TestaTodoMundo {

	public static void main(String[] args) {
		
		//Criação do objeto
		Professor prof1 = new Professor();
		
		
		//Adicionando dados ao objeto
		//----------------------------------------------
		prof1.setNome("Juliano"); // --> pessoa
		prof1.setIdade(23);
		prof1.setEndereco("Rua: Das Olivas, 250");
		
		prof1.setDisciplina("Java - Puro"); // --> Professor
		
		prof1.setSalario(2000.00); // --> Funcionario
		
		//------------------------------------------
		//Recuperar/Visualizar os dados inseridos no objeto
		System.out.println("Nome do Funcionario:  "  + prof1.getNome());
		System.out.println("Idade do Funcionário: "  + prof1.getIdade());
		System.out.println(prof1.getEndereco());
		System.out.println(prof1.getDisciplina());
		System.out.println(prof1.getSalario());
		

	}

}
