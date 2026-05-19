package br.senac.sistema.modelo.entidade.pessoa.aluno;

import br.senac.sistema.modelo.entidade.pessoa.Pessoa;

public class Aluno extends Pessoa{
	
	public Aluno(String nome, String sobrenome, String cpf) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException{
		super(nome, sobrenome, cpf);
	}
	
	public boolean equals(Object objeto) {
		if (objeto == null) {
			return false;
		}
		if (this == objeto) {
			return true;
		}
		
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Aluno aluno = (Aluno) objeto;
		
		
		return this.getNome().equals(aluno.getNome()) && this.getSobrenome().equals(aluno.getSobrenome()) && this.getCPF().equals(aluno.getCPF());
	}
	
	public void respostaAlunoChamada() {
		System.out.println(getNome() + " professor! Estou presente!\n");
	}
}