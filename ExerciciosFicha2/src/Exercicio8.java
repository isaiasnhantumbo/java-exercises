import java.util.Scanner;

public class Exercicio8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite um numero");
    int number = input.nextInt();

    if (number >= 0) {
      System.out.println(-number);
    } else {
      System.out.println(number);
    }
  }
}
