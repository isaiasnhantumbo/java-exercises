import java.util.Scanner;

public class EstudantesMetodos {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Digite a capacidade do array: ");
		int capacidade = input.nextInt();

		Estudante[] estudantes = new Estudante[capacidade];

		preencherArray(estudantes);
		listarEstudantes(estudantes);
		listaDeEstudantesComMediaETeste1Positiva(estudantes);

	}

	public static void preencherArray(Estudante[] estudantes) {
		for (int i = 0; i < estudantes.length; i++) {

			System.out.print("Digite o nome do estudante: ");
			String nome = input.next();

			System.out.print("Digite o teste 1: ");
			double teste1 = input.nextDouble();

			System.out.print("Digite  o teste 2: ");
			double teste2 = input.nextDouble();

			estudantes[i] = new Estudante(nome, teste1, teste2);
		}

	}

	public static void listarEstudantes(Estudante[] estudantes) {
		for (int i = 0; i < estudantes.length; i++) {

			System.out.println(estudantes[i].toString());

			System.out.println("----------------------------------");

		}
	}

	public static void listaDeEstudantesComMediaETeste1Positiva(Estudante[] estudantes) {
		for (int i = 0; i < estudantes.length; i++) {

			if (estudantes[i].calcularMedia() >= 9.5 && estudantes[i].getTeste1() >= 9.5) {
				System.out.println(estudantes[i].toString());

			}

		}
	}

}
