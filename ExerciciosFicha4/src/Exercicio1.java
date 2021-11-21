import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o numero de estudantes: ");
		int numeroDeEstudantes = input.nextInt();

		int[] idades = new int[numeroDeEstudantes];
		
		int soma = 0;
		
		for (int i = 0; i < idades.length; i++) {
			System.out.print("Digite a nota do estudante ");
			idades[i] = input.nextInt();
		}

		int i = 0;
		
		do {
			System.out.println("O estudante " + i + " a nota e: " + idades[i]);
			i++;

		} while (i < idades.length);
	
		
		int j = 0;
		
		while (j < idades.length) {
			soma = soma+ idades[j];
			j++;
		}
		
		int mediaDeIdade = soma / numeroDeEstudantes;
		
		System.out.println("A media de idades e: " + mediaDeIdade);
		
		
				
	}

}
