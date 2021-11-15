import java.util.Scanner;

public class Exercicio9 {
  public static void main(String[] args) {

    Scanner k = new Scanner(System.in);

    System.out.print("DIGITE O VALOR DO CATETO OPOSTO");

    double a = k.nextDouble();

    System.out.print("DIGITE O VALOR DO CATETO ADJACENTE");

    double b = k.nextDouble();

    double hypotenuse = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));

    System.out.println("A HIPOTENUSA DO TRIANGULO É IGUAL A " + hypotenuse);
  }

}

