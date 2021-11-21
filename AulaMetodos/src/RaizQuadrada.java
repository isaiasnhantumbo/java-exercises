import java.util.Scanner;


public class RaizQuadrada {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Exercicio.calculaQuadrado();

		System.out.println("Digite um numero: ");
		int numbero1 = input.nextInt();
		Exercicio.calculaQuadradoComParametro(numbero1);

		System.out.println("Digite um numero: ");
		int numbero2 = input.nextInt();
		Exercicio.calculaQuadradoComRetorno(numbero2);

	}

}
