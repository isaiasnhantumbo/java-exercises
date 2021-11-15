import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("DIGITE O SEU NOME");

		String name = k.next();

		System.out.print(name + " DIGITE  O SEU SAL�RIO");

		double salary = k.nextDouble();

		double incomeTaxToPay = (salary * 5.0) / 100;

		System.out.println(name + " O VALOR DO IMPOSTO DE RENDA A PAGAR � DE " + incomeTaxToPay);
		for (int i = 0; i < 10; i++) {
			
		}
	}

}
