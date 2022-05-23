package br.fiap.pessoa;

public abstract class Pessoa {
	protected String nome;
	protected String cpf;
	
	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		String aux = "";
		aux += "Nome: " + nome + "\n";
		aux += "CPF: " + cpf + "\n";
		return aux;
	}

	public String getCpf() {
		return cpf;
	}	
	
}
