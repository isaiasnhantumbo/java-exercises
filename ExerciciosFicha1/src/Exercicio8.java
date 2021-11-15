import java.util.Scanner;


public class Exercicio8 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("Digite o valor de C");
		int c = k.nextInt();
		

		System.out.print("Digite o valor de B");
		int b = k.nextInt();
		
		int a = (c / b) - b;
		
		System.out.print("O valor de a: " + a + " ,o valor de b: " + b + " o valor de c: " + c);

	}

}
