import java.util.Scanner;

public class GestaoDeEstudantes2 {
	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		Scanner input = new Scanner(System.in);

		int opccao = 0;

		System.out.println("Digite a capacidade do array: ");

		int capacidade = input.nextInt();

		char continuar;

		Estudante[] estudantes = new Estudante[capacidade];

		do {
			System.out.println("1: Preencher array");
			System.out.println("2: Listar estudantes");
			System.out.println("3: Listar estudantes com media positiva e nota1 positiva");

			opccao = input.nextInt();

			switch (opccao) {
			case 1:
				EstudantesMetodos.preencherArray(estudantes);
				break;
			case 2:
				EstudantesMetodos.listarEstudantes(estudantes);
				break;
			case 3:
				EstudantesMetodos.listaDeEstudantesComMediaETeste1Positiva(estudantes);
				break;
			default:
				System.out.println("Opccao invalida");
				break;
			}
			System.out.print("Digite s para continuar e outra letra para sair: ");
			continuar = input.next().charAt(0);
		} while (continuar == 'S' || continuar == 's');

	}

}
