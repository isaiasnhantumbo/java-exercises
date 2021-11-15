import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o primeiro numero:");
		double firstNumber = input.nextDouble();

		System.out.print("Digite o segundo numero:");
		double secondNumber = input.nextDouble();

		System.out.print("Digite o operador aritmetrico desejado:");
		char operator = input.next().charAt(0);

		switch (operator) {

		case '+':
			System.out.print("adicao: " + (firstNumber + secondNumber));
			break;

		case '-':
			System.out.print("substracao: " + (firstNumber - secondNumber));
			break;

		case '*':
			System.out.print("multiplicacao: " + (firstNumber * secondNumber));
			break;

		case '/':
			System.out.print("divisao: " + (firstNumber / secondNumber));
			break;
		default:
			System.out.print("Operador Invalido ");

		}

	}

}
