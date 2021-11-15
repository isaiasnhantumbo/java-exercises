import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite um numero inteiro");
    int firstNumber = input.nextInt();

    System.out.print("Digite um numero inteiro");
    int secondNumber = input.nextInt();

    if (firstNumber == secondNumber) {
      System.out.println("Os numeros " + firstNumber + " e " + secondNumber + " são iguais");
    }

  }
}
