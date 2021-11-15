import java.util.Scanner;

public class Exercicio3a {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("DIGITE A SUA IDADE EM ANOS");

    int age = input.nextInt();

    int ageInMonth = age * 12;

    System.out.println("A IDADE EM MESES E: " + ageInMonth);
  }
}
