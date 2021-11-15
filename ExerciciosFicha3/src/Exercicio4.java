import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		System.out.print("Digite o numero de estudantes");
		int n = k.nextInt();

		double nota1, nota2, media;

		for (int i = 1; i <= n; i++) {

			do {
				System.out.print("DIGITE A NOTA 1:");
				nota1 = k.nextDouble();

			} while (nota1 < 0 || nota1 > 10);

			do {
				System.out.print("DIGITE A NOTA 2:");
				nota2 = k.nextDouble();

			} while (nota2 < 0 || nota2 > 10);

			media = (nota1 + nota2) / 2;

			System.out.println(i + " " + nota1 + " " + nota2 + " " + media);

		}

	}

}
