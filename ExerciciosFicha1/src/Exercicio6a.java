import java.util.Scanner;

public class Exercicio6a {

  public static void main(String[] args) {

    Scanner k = new Scanner(System.in);

    System.out.print("DIGITE O SEU ANO DE NASCIMENTO");

    int birthYear = k.nextInt();

    System.out.print("DIGITE O ANO ACTUAL");

    int currentYear = k.nextInt();

    int age = currentYear - birthYear;

    System.out.print("A SUA IDADE É " + age + " ANOS");
  }
}
