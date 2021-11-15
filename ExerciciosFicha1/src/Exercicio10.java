import java.util.Scanner;

public class Exercicio10 {
  public static void main(String[] args) {
    Scanner k = new Scanner(System.in);

    System.out.print("DIGITE O VALOR DO xA");

    double xA = k.nextDouble();

    System.out.print("DIGITE O VALOR DO xB");

    double xB = k.nextDouble();

    System.out.print("DIGITE O VALOR DO yA");

    double yA = k.nextDouble();

    System.out.print("DIGITE O VALOR DO yB");

    double yB = k.nextDouble();

    double x = xA - xB;
    double y = yA - yB;

    double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

    System.out.println("A DISTANCIA É DE " + distance);

  }
}
