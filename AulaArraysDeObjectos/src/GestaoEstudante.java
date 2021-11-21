import java.util.Scanner;

public class GestaoEstudante {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite a capacidade do array");

		int capacidade = input.nextInt();

		Estudante[] estudantes = new Estudante[capacidade];

		for (int i = 0; i < capacidade; i++) {
			System.out.print("Digite o nome do estudante: ");
			String nome = input.next();

			System.out.print("Digite o teste 1: ");
			double teste1 = input.nextDouble();

			System.out.print("Digite  o teste 2: ");
			double teste2 = input.nextDouble();

			estudantes[i] = new Estudante(nome, teste1, teste2);
		}

		for (int i = 0; i < capacidade; i++) {

			System.out.println(estudantes[i].toString());

			System.out.println("-----------------------------------");

			estudantes[i].visualizarEstudante();
		}

		for (int i = 0; i < capacidade; i++) {

			if (estudantes[i].calcularMedia() >= 9.5 && estudantes[i].getTeste1() >= 9.5) {
				System.out.println("-----------------------------------");
				System.out.println("Estudante com media e nota positiva:");
				estudantes[i].visualizarEstudante();
			}
		}
	}

}
