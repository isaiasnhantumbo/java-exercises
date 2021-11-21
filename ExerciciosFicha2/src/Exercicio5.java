import java.util.Scanner;

public class Exercicio5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite um numero inteiro");
    int firstNumber = input.nextInt();

    System.out.print("Digite um numero inteiro");
    int secondNumber = input.nextInt();

    System.out.print("Digite um numero inteiro");
    int thirdNumber = input.nextInt();

    if (firstNumber > secondNumber && firstNumber > thirdNumber) {
      System.out.println("O maior numero e: " + firstNumber);
    } else if (secondNumber > thirdNumber) {
      System.out.println("O maior numero e: " + secondNumber);

    } else {
      System.out.println("O maior numero e: " + thirdNumber);

    }
  }
}
