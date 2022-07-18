package br.com.generation.funcionarios;

import br.com.generation.superclass.Pessoa;

public class Funcionario extends Pessoa{
	
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
