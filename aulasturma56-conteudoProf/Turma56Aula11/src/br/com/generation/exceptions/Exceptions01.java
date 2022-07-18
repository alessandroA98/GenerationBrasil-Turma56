package br.com.generation.exceptions;

public class Exceptions01 {

	public static void main(String[] args) {

		int[] vetor = new int[4]; //[0]...[1]...[2]...[3]....-->[4]
		System.out.println("Antes da Exception!!");

		try {// --> tentar
			vetor[4] = 10;
			System.out.println("após a exception!!");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Existe um problema no código" 
					+ " porém vai ficar assim mesmo!!");
		}
		
		//System.out.println(vetor[4]);

	}

}
