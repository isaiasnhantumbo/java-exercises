import java.util.Scanner;

public class Exercicio15 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o valor do diametro");
    double diametro = input.nextDouble();

    double raio = diametro / 2;

    double area = Math.PI * Math.pow(raio, 2);

    System.out.println("A area do circulo e: " + area);

  }
}
