package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as Cole��es do Java", "Paulo");

		//List<Aula> aulas = javaColecoes.getAulas();

		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adiciona(new Aula("Criando uma aula",20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es",22));

		System.out.println(javaColecoes.getAulas());
	}

}
