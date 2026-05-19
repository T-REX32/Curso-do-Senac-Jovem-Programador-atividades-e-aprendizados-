package br.senac.sistema;

import java.util.ArrayList;
import java.util.List;

import OrientacaoObjetos.CpfInvalidoException;
import OrientacaoObjetos.NomeInvalidoException;
import OrientacaoObjetos.Professor;
import OrientacaoObjetos.SobrenomeInvalidoException;
import br.senac.sistema.modelo.entidade.pessoa.aluno.Aluno;

public class Principal {
 public static void main(String[] args) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
	 
	Professor[] empregados = new Professor [3];
	
	try {
		
		List<Aluno> alunos = new ArrayList<>();
		
		alunos.add(new Aluno("a", "a", "a"));
		alunos.add(new Aluno("a", "a", "a"));
		alunos.add(new Aluno("a", "a", "a"));
		alunos.add(new Aluno("a", "a", "a"));
			
		
		Aluno aluno = new Aluno("a", "a", "a"); // esses valores no ArrayList, são objetos armazenados num vetor que é o próprio ArrayList.
		alunos.remove(aluno);
		System.out.println(alunos.size());
		System.out.println("Entrou!");
 	
		}
	catch(NomeInvalidoException excecao) {
		System.out.println(excecao.getMessage());
		}
	catch(SobrenomeInvalidoException excecao) {
		System.out.println(excecao.getMessage());
	}
	catch(CpfInvalidoException excecao) {
		excecao.printStackTrace();
		}
 	}
}