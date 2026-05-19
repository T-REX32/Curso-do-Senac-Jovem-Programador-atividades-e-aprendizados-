package OrientacaoObjetos;

import java.util.ArrayList;
import java.util.List;

import br.senac.sistema.modelo.entidade.pessoa.aluno.Aluno;


public class Curso {
	
	private String nome;
	private String codigoCurso;
	private short cargaHoraria;
	private Professor professor;
	private List<Aluno> alunos;
	
	public String getNome() {
		return nome;
	}
	
	public String getCodigoCurso() {
		return codigoCurso;
	}
	
	public short getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setNome(String nome) {
		this.nome  = nome;
	}
	
	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso  = codigoCurso;
	}

	public void setCargaHoraria(short cargaHoraria) {
		this.cargaHoraria  = cargaHoraria;
	}
	
	public Curso(String nome, String codigoCurso, short cargaHoraria) {
		this.nome = nome;
		this.codigoCurso = codigoCurso;
		this.cargaHoraria = cargaHoraria;
		this.alunos = new ArrayList<>();
	}
	
	public Curso(String nome, String codigoCurso, short cargaHoraria, Professor professor) {
		this(nome, codigoCurso, cargaHoraria);
		this.professor = professor;
		alunos = new ArrayList<>();
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public List<Aluno> getAluno(){
		return alunos;
	}
	
	public boolean inserirAluno(Aluno aluno) {
		return alunos.add(aluno);
	}
	
	public boolean removerAluno(Aluno aluno) {
		return alunos.remove(aluno);
	}
	
	
	
}



