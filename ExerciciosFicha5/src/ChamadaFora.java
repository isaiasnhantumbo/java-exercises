import java.util.Scanner;


public class ChamadaFora {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o numero de estudantes");
		int cap = input.nextInt();
		int [] idades = new int[cap];
		Exercicio1.preencherArray(idades);
		Exercicio1.visualizarArray(idades);
		int media = Exercicio1.mediaIdades(idades);
		System.out.println("media de idades: " + media);

	}

}
