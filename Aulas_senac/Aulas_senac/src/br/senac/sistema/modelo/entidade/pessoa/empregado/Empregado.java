package br.senac.sistema.modelo.entidade.pessoa.empregado;

import OrientacaoObjetos.StatusEmpregado;
import br.senac.sistema.modelo.entidade.pessoa.Pessoa;

public abstract class Empregado extends Pessoa{
	
	private float salario;
	private StatusEmpregado  status;
	
	
	public Empregado(String nome, String sobrenome, String cpf, float salario)  throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
		super(nome, sobrenome, cpf);
		this.salario = salario;
		this.status = StatusEmpregado.CONTRATADO;
	}
 
	public Empregado(String nome, String sobrenome, String cpf, float salario, StatusEmpregado status)  throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
		super(nome, sobrenome, cpf);
		this.salario = salario;
		this.status = status;
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public StatusEmpregado getStatusEmpregado() {
		return status;
	}
	public void setStatusEmpregado(StatusEmpregado status) {
		this.status = status;
	}
	public abstract float calcularSalario();
	
	public float calcularSalario(short quantidadeHorasTrabalhadas) {
		return getSalario() + quantidadeHorasTrabalhadas * 10;
	}
}
