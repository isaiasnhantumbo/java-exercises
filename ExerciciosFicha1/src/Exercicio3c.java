import java.util.Scanner;

public class Exercicio3c {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("DIGITE A SUA IDADE EM ANOS");

    int age = input.nextInt();

    int ageInHour = age * 8760;

    System.out.println("A SUA IDADE EM HORAS E: " + ageInHour);

  }
}
