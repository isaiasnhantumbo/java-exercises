import java.util.Scanner;

public class Exercicio7 {

  public static void main(String[] args) {

    Scanner k = new Scanner(System.in);

    System.out.print("DIGITE O VALOR DA BASE DO RETANGULO");

    int base = k.nextInt();

    System.out.print("DIGITE O VALOR DA ALTURA DO RETANGULO");

    int height = k.nextInt();

    int area = base * height;

    System.out.println("A AREA DO RETANGULO E IGUAL A " + area);

  }

}
