package br.senac.sistema.modelo.entidade.pessoa.empregado.diretor;

import br.senac.sistema.modelo.entidade.pessoa.empregado.Empregado;
import br.senac.sistema.modelo.entidade.pessoa.empregado.gestao.RH;

public class Diretor extends Empregado implements RH{

	public Diretor(String nome, String sobrenome, String cpf, float salario) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
		super(nome, sobrenome, cpf, salario);
	}
	
	public float calcularSalario () {
		return getSalario() * 3000;
	}

	
	public void demitirEmpregado(Empregado empregado) {
		empregado.setStatusEmpregado(StatusEmpregado.DEMITIDO);
	}
}
