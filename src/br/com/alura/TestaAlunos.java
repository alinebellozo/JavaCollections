package br.com.alura;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Collection<String> alunos = new HashSet<>();
//		Set<String> alunos = new HashSet<>();  HashSet não é uma lista; implementa set, que é filha de collection, mas não é filha de list
// quando eu uso um set, não tem garantia da ordem em que os elementos vão aparecer. Usar set é bem mais rápido em alguns casos.
		alunos.add("Marcelo da Silva");
		alunos.add("Antônia Oliveira");
		alunos.add("Josefina Marques");
		alunos.add("Sérgio Lopes");
		alunos.add("Marta Maria");
		alunos.add("Eduardo José");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(alunos);
	}
}
