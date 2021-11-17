import java.util.Scanner;

public class RecolhaDeDadosDoCidadao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Individuo individuo1, individuo2;

		System.out.print("Digite o seu nome: ");
		String nome = input.next();

		System.out.print("Digite a sua idade: ");
		int idade = input.nextInt();

		System.out
				.print("Digite o sexo: 'F' para Feminino ou 'M' para Masculino: ");
		char sexo = input.next().charAt(0);

		System.out.print("Digite o estado civil: ");
		char estadoCivil = input.next().charAt(0);
		System.out.print("Digite o seu nome: ");

		String nome2 = input.next();

		System.out.print("Digite a sua idade: ");
		int idade2 = input.nextInt();

		System.out
				.print("Digite o sexo: 'F' para Feminino ou 'M' para Masculino: ");
		char sexo2 = input.next().charAt(0);

		System.out.print("Digite o estado civil: ");
		char estadoCivil2 = input.next().charAt(0);

		individuo1 = new Individuo(sexo, estadoCivil, idade, nome);
		individuo2 = new Individuo(sexo2, estadoCivil2, idade2, nome2);
		individuo1.imprimirDados();
		System.out.println();
		individuo2.imprimirDados();

	}

}
