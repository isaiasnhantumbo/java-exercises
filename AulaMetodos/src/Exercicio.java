import java.util.Scanner;

public class Exercicio {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		calculaQuadrado();

		System.out.println("Digite um numero: ");
		int numbero1 = input.nextInt();
		calculaQuadradoComParametro(numbero1);

		System.out.println("Digite um numero: ");
		int numbero2 = input.nextInt();
		calculaQuadradoComRetorno(numbero2);
	}

	public static void calculaQuadrado() {
		System.out.println("Digite um numero: ");
		int numbero = input.nextInt();

		double quadrado = Math.pow(numbero, 2); 

		System.out.println("o quadrado e: " + quadrado);

	}

	public static void calculaQuadradoComParametro(int numero) {
		double quadrado = Math.pow(numero, 2);

		System.out.println("o quadrado e: " + quadrado);

	}

	public static int calculaQuadradoComRetorno(int numero) {
		double quadrado = Math.pow(numero, 2);

		System.out.println("o quadrado e: " + quadrado);

		int valor = (int) quadrado;

		return valor;
	}

}
