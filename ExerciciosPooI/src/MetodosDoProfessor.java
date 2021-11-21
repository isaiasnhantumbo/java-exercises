import java.util.Scanner;

public class MetodosDoProfessor {
	static Scanner input = new Scanner(System.in);

	public static Professor[] preencherArray() {
		System.out.print("Digite a capacidade: ");
		int capacidade = input.nextInt();
		Professor[] professores = new Professor[capacidade];

		for (int i = 0; i < professores.length; i++) {
			System.out.println("Digite o nome: ");
			String nome = input.next();
			System.out.println("Digite o codigo: ");
			int codigo = input.nextInt();
			System.out.println("Digite o contacto: ");
			String contacto = input.next();
			System.out.println("Digite o curso: ");
			String curso = input.next();
			System.out.println("Digite a turma: ");
			String turma = input.next();
			System.out.println("Digite o numero de horas trabalhadas: ");
			int horasTrabalhadas = input.nextInt();
			System.out.println("Digite o salario por hora: ");
			double salarioPorHora = input.nextDouble();

			professores[i] = new Professor(codigo, nome, contacto, curso, turma, horasTrabalhadas, salarioPorHora);

		}
		return professores;

	}

	public static void imprimirArray(Professor[] professores) {
		for (int i = 0; i < professores.length; i++) {
			System.out.println(professores[i].toString());
			System.out.println("----------------------------------");
		}
	}

	public static void listarProfessoresDeInformatica(Professor[] professores) {
		for (int i = 0; i < professores.length; i++) {
			System.out.println("----------------------------------");
			System.out.println(professores[i].getCurso());
			System.out.println(professores[i].getCurso() == "informatica");
			if (professores[i].getCurso() == "informatica" || professores[i].getCurso() == "Informatica") {
				System.out.println(professores[i].getNome());
				System.out.println(professores[i].getTurma());
				System.out.println(professores[i].calcularSalarioDoProfessor());
				System.out.println("----------------------------------");
			}
		}
	}
}
