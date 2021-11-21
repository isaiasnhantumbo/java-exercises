import java.util.Scanner;

public class Exercicio16 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("DIGITE O VALOR DO CATETO OPOSTO");

    double a = input.nextDouble();

    System.out.print("DIGITE O VALOR DO CATETO ADJACENTE");

    double b = input.nextDouble();

    double hypotenuse = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));

    System.out.println("A HIPOTENUSA DO TRIANGULO E IGUAL A " + hypotenuse);
  }
}
