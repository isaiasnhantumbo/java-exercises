import java.util.Scanner;

public class MetodosDeEstudante {

	static Scanner k = new Scanner(System.in);

	public static Estudante[] preencherArray() {

		System.out.print("Digite a capacidade: ");
		int capacidade = k.nextInt();

		Estudante[] estudantes = new Estudante[capacidade];

		for (int i = 0; i < estudantes.length; i++) {

			System.out.print("Digite o nome do estudante: ");
			String nome = k.next();
			System.out.print("Digite o teste 1: ");
			double teste1 = k.nextDouble();
			System.out.print("Digite  o teste 2: ");
			double teste2 = k.nextDouble();

			estudantes[i] = new Estudante(nome, teste1, teste2);

		}
		return estudantes;
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

	public static void menu() {

		int opccao = 0;
		char continuar;
		Estudante[] estudantes = null;
		do {

			System.out.println("1: Preencher array");
			System.out.println("2: Listar estudantes ");
			System.out.println("3: Listar estudantes com media positiva e nota1 positiva");

			opccao = k.nextInt();

			switch (opccao) {

			case 1:
				estudantes = preencherArray();
				break;
			case 2:
				listarEstudantes(estudantes);
				break;
			case 3:
				listaDeEstudantesComMediaETeste1Positiva(estudantes);
				break;
			default:
				System.out.println("Opccao invalida");
				break;

			}
			System.out.print("Digite s para continuar e outra letra para sair: ");
			continuar = k.next().charAt(0);
			System.out.println(continuar);
		} while (continuar == 'S' || continuar == 's');

	}
}
