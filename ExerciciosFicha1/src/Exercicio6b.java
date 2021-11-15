import java.util.Scanner;

public class Exercicio6b {

  public static void main(String[] args) {
    Scanner k = new Scanner(System.in);

    System.out.print("DIGITE O SEU ANO DE NASCIMENTO");

    int birthYear = k.nextInt();

    System.out.print("DIGITE O ANO ACTUAL");

    int currentYear = k.nextInt();

    int age = currentYear - birthYear;

    int ageInWeeks = age * 52;

    System.out.print("A SUA IDADE EM SEMANAS É DE " + ageInWeeks + " SEMANAS");
  }

}
