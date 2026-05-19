package OrientacaoObjetos;

import br.senac.sistema.modelo.entidade.pessoa.empregado.Empregado;

public class Professor extends Empregado {
	 
	private Curso curso;
	
	public Professor(String nome, String sobrenome, String cpf, float salario)  throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
		super(nome, sobrenome, cpf, salario);
	}
	
	public Professor(String nome, String sobrenome, String cpf, Curso curso, float salario)  throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
		super(nome, sobrenome, cpf, salario);
		this.curso = curso;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public void efetuarChamada() {
		System.out.println("Pessoal, vamos realizar a chamada!\n");
	}
 
	public float calcularSalario() {
		return getSalario() + 1200;
	}
	
}