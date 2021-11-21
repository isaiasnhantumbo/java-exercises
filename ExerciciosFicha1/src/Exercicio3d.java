import java.util.Scanner;

public class Exercicio3d {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("DIGITE A SUA IDADE EM ANOS");

    int age = input.nextInt();

    int ageInMinutes = age * 525600;

    System.out.println("A SUA IDADE EM MINUTOS E: " + ageInMinutes);

  }
}
