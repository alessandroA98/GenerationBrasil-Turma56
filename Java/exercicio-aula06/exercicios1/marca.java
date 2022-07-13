package br.com.aula06.exercicios1;

public class marca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patinete patinete = new Patinete();

		patinete.setName("Patinetera");
		patinete.setMaterial("aço");
		patinete.setBrand("Caloi");
		patinete.setWeight(5.0);
		patinete.setWheels(2);
		
		System.out.println("Dados do Patinete: ");
		System.out.println("Nome: " + patinete.getName());
		System.out.println("Material: " + patinete.getMaterial());
		System.out.println("Marca: " + patinete.getBrand());
		System.out.println("Peso: " + patinete.getWeight() + "kg");
		System.out.println("Numero de rodas: " + patinete.getWheels());
	}

}
