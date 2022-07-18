package br.com.generation.polimorfismo;

public class Cachorro extends Animal{
	
	Cachorro(String nome){
		System.out.println("Nome do Cachorro: " + nome);
	}
	
	//Sobrescrita de método
	public void comer() {
		System.out.println("Cachorro comendo....");
	}

}
