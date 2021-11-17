import java.util.Scanner;

public class ChamadaDeMedias {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Media sem retorno e sem parametro");
		Medias.mediaSemRetornoSemParametro();

		System.out.println("Media sem retorno e com parametro");
		System.out.print("Digite teste 1:");
		double t1 = input.nextDouble();

		System.out.print("Digite teste 2:");
		double t2 = input.nextDouble();
		Medias.mediaSemRetornoComParametro(t1, t2);

		System.out.println("Media com retorno e sem parametro");
		double media1 = Medias.mediaComRetornoSemParametro();

		System.out.println("Media :" + media1);

		System.out.println("Media com retorno e com parametro");
		System.out.print("Digite teste 1:");
		double t3 = input.nextDouble();

		System.out.print("Digite teste 2:");
		double t4 = input.nextDouble();

		double media2 = Medias.mediaComRetornoComParametro(t3, t4);

		System.out.println("Media :" + media2);
	}

}
