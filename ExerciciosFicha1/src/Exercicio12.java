import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o valor de a");
		int a = input.nextInt();

		System.out.println("Digite o valor de b");
		int b = input.nextInt();

		System.out.println("Digite o valor de c");
		int c = input.nextInt();

		System.out.println("Digite o valor de d");
		int d = input.nextInt();

		System.out.println("Digite o valor de e");
		int e = input.nextInt();

		System.out.println("Digite o valor de f");
		int f = input.nextInt();

		int x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		int y = ((a * f) - (c * d)) / ((a * e) - (b * d));

		System.out.println("x e igual a :" + x + " e, y e igual a :" + y);

	}

}
