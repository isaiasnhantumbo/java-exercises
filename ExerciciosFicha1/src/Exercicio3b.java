import java.util.Scanner;

public class Exercicio3b {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("DIGITE A SUA IDADE EM ANOS");

    int age = input.nextInt();

    int ageInDays = age * 365;

    System.out.println("A SUA IDADE EM DIAS E: " + ageInDays);

  }
}
