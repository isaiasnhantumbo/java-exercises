import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double somaDoIndicePar = 0, mediaDoIndicePar = 0, somaDoIndiceImpar = 0, mediaDoIndiceImpar = 0;

		System.out.println("Digite o numero de individuos: ");
		int numeroDeIndividuos = input.nextInt();

		double[] alturas = new double[numeroDeIndividuos];

		for (int i = 0; i < alturas.length; i++) {
			System.out.print("Digite a sua altura: ");
			alturas[i] = input.nextDouble();

		}

		for (int i = 0; i < alturas.length; i++) {

			System.out.println(alturas[i]);

		}

		int indicesPares = 0, indicesImpares = 0;

		for (int i = 0; i < alturas.length; i++) {

			if (i != 0 && i % 2 == 0) {
				somaDoIndicePar = somaDoIndicePar + alturas[i];
				indicesPares++;
			} else {
				somaDoIndiceImpar = somaDoIndiceImpar + alturas[i];
				indicesImpares++;
			}
		}

		mediaDoIndicePar = somaDoIndicePar / indicesPares;

		mediaDoIndiceImpar = somaDoIndiceImpar / indicesImpares;

		System.out.println(mediaDoIndicePar);

		System.out.println(mediaDoIndiceImpar);

		double alturaMaxima = alturas[0], alturaMinima = alturas[0];

		for (int i1 = 1; i1 < alturas.length; i1++) {

			if (alturas[i1] > alturaMaxima) {
				alturaMaxima = alturas[i1];
			}
			if (alturas[i1] < alturaMinima) {
				alturaMinima = alturas[i1];
			}

		}
		System.out.println("A altura maxima e: " + alturaMaxima);
		System.out.println("A altura maxima e: " + alturaMinima);
	}

}
