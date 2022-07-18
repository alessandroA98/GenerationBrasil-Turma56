package br.com.generation.collections03;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		System.out.println("Quantos alunos deseja add: ");
		int numeroDeAlunos = sc.nextInt();
		
		for(int i = 0; i < numeroDeAlunos; i++) {
			System.out.println("Digite a idade do Aluno: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Digite o nome do Aluno: ");
			String nome = sc.nextLine();
			
			alunos.add(new Aluno(idade, nome));
		}
		
		for(Aluno i : alunos) {
			System.out.println(i);
		}
		
		sc.close();

	}

}
