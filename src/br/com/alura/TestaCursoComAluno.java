package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 18));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Rodrigo Bonini", 12345);
		Aluno a2 = new Aluno("Maria da Graça", 67890);
		Aluno a3 = new Aluno("Sabrina Joana", 24680);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("O aluno " + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		
		Aluno bonini = new Aluno("Rodrigo Bonini", 12345);
		System.out.println("E esse Bonini?");
		System.out.println(javaColecoes.estaMatriculado(bonini));
		
		System.out.println("O a1 é igual ao Bonini?");
		System.out.println(a1.equals(bonini));
		
		// obrigatoriamente, o seguinte é true:
		
		System.out.println(a1.hashCode() == bonini.hashCode());
	}

}
