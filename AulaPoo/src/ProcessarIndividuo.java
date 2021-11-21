import java.util.Scanner;

public class ProcessarIndividuo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Individuo individuo1;

		System.out.print("Digite o seu nome: ");
		String nome = input.next();

		System.out.print("Digite a sua idade: ");
		int idade = input.nextInt();

		System.out
				.print("Digite o sexo: 'F' para Feminino ou 'M' para Masculino: ");
		char sexo = input.next().charAt(0);

		System.out.print("Digite o estado civil: ");
		char estadoCivil = input.next().charAt(0);

		individuo1 = new Individuo(sexo, estadoCivil, idade, nome);
		individuo1.imprimirDados();

	}
}
