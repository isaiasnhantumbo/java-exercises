import java.util.Scanner;

public class Exercicio4b {
  public static void main(String[] args) {
    Scanner k = new Scanner(System.in);

    System.out.print("DIGITE UM NUMERO");

    int firstNumber = k.nextInt();

    System.out.print("DIGITE UM NUMERO");

    int secondNumber = k.nextInt();

    int result = firstNumber - secondNumber;

    System.out.println(result);
  }
}
