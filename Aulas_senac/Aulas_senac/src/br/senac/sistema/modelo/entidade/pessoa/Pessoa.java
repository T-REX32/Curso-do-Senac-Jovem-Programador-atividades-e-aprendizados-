package br.senac.sistema.modelo.entidade.pessoa;

public abstract class Pessoa {
	private String nome;
	private String sobrenome;
	private String cpf;
	
	
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public String getCPF() {
		return cpf;
	}
	
	public void setNome(String nome) throws NomeInvalidoException{
		if (nome.isEmpty()) {
			throw new NomeInvalidoException("O valor "+ nome +" é inválido!");
		}
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) throws SobrenomeInvalidoException{
		if(sobrenome.isEmpty()) {
			throw new SobrenomeInvalidoException("O valor "+ sobrenome +" é inválido!");
		}
		
		this.sobrenome = sobrenome;
	}
	
	public void setCPF(String cpf) throws CpfInvalidoException{
		if(cpf.isEmpty()) {
			throw new CpfInvalidoException("O valor "+ cpf +" é inválido!");
		}
		
		this.cpf = cpf;
	}
	
	protected Pessoa (String nome, String sobrenome, String cpf) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
		super();
		if (nome.isEmpty()) {
			throw new NomeInvalidoException("O valor "+ nome +" é inválido!");
		}
		
		if(sobrenome.isEmpty()) {
			throw new SobrenomeInvalidoException("O valor "+ sobrenome +" é inválido!");
		}
		
		if(cpf.isEmpty()) {
			throw new CpfInvalidoException("O valor "+ cpf +" é inválido!");
		}

		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}
	
	
}
