package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAluno {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Mauricio Aniche");
		alunos.add("Renan Saggio");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		for (String aluno : alunos) {
			System.out.println(aluno);
			
		}
		
		alunos.forEach(resp->{
			System.out.println(resp);
		});
		
		System.out.println(alunos);
		

	}

}
