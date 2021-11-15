import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		System.out.print("DIGITE O SEU SALÃ�RIO");
		double salary = k.nextDouble();

		System.out.print("DIGITE O VALOR DO SALÃ�RIO MÃ�NIMO");
		double basicSalary = k.nextDouble();
		
		int numbersOfSalaries = (int) (salary / basicSalary);

		System.out.println("O funcionÃ¡rio ganha " + numbersOfSalaries + " salÃ¡rios mÃ­nimos");
	}

}
