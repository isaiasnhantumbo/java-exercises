import java.util.Scanner;

public class Exercicio4g {
  public static void main(String[] args) {

    Scanner k = new Scanner(System.in);

    System.out.print("DIGITE UM NUMERO");

    double firstNumber = k.nextInt();

    System.out.print("DIGITE UM NUMERO");

    int secondNumber = k.nextInt();

    double result = Math.sqrt(firstNumber);

    System.out.println(result);
  }
}
