import java.util.Scanner;

public class Exercicio20 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("DIGITE O VALOR DA HIPOTENUSA");

    double hypotenuse = input.nextDouble();

    System.out.print("DIGITE O VALOR DO CATETO ADJACENTE");

    double b = input.nextDouble();

    double a = Math.sqrt((Math.pow(hypotenuse, 2) - Math.pow(b, 2)));

    System.out.println("O CATETO OPOSTO DO TRIANGULO E IGUAL A " + a);
  }
}
