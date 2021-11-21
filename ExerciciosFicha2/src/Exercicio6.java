import java.util.Scanner;

public class Exercicio6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite um numero inteiro");
    int firstNumber = input.nextInt();

    System.out.print("Digite um numero inteiro");
    int secondNumber = input.nextInt();

    System.out.print("Digite um numero inteiro");
    int thirdNumber = input.nextInt();

    int sum = firstNumber + secondNumber + thirdNumber;

    if (sum >= 100) {
      System.out.println("A soma é maior ou igual a 100");
    }
  }
}
