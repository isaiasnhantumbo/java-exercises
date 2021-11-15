import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("DIGITE O VALOR DA BASE MAIOR");
		double baseMax = k.nextDouble();

		System.out.print("DIGITE O VALOR DA BASE MENOR");
		double baseMin = k.nextDouble();

		System.out.print("DIGITE O VALOR DA ALTURA");
		double height = k.nextDouble();

		double area = ((baseMax + baseMin) / 2) * height;
		
		System.out.print("A AREA DO TRAPEZIO E: " + area);

	}

}
