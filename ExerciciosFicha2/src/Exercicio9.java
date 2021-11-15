import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double a, b, c, x;

		System.out.print("Digite o valor de a:");

		a = input.nextDouble();

		System.out.print("Digite o valor de b:");

		b = input.nextDouble();

		System.out.print("Digite o valor de c:");

		c = input.nextDouble();

		double delta = Math.pow(a, 2) - 4 * (a * c);

		if (a != 0 && b != 0 && c != 0) {
			if (delta < 0) {
				System.out.print("n�o existe raiz real");
			} else if (delta == 0) {

				x = -b / (2 * a);

				System.out.print("existe uma raiz real x = " + x);
			} else if (delta > 0) {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);

				double x2 = (-b - Math.sqrt(delta)) / (2 * a);

				System.out.print("existem duas ra�zes reais: x1 = " + x1 + " e x2 = " + x2);
			}

		} else {
			System.out.print("As vari�veis a devem ser diferentes de zero");
		}
	}
}
