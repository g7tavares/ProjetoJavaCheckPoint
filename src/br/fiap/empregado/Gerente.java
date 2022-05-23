package br.fiap.empregado;

import br.fiap.bonus.Bonus;

public class Gerente extends Empregado implements Bonus {

	private double salario;
	private double bonus;
		
	public Gerente(String nome, String cpf, String matricula, double salario, double bonus) {
		super(nome, cpf, matricula);
		this.salario = salario;
		this.bonus = bonus;
	}

	@Override
	public double calcularBonus() {
		return salario * bonus / 100;
	}

	@Override
	public String toString() {
		String aux = super.toString();
		aux += "Salário R$ " + salario + "\n";
		aux += "Bônus: " + bonus + "%\n";
		return aux;
	}
	
}
