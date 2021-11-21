import java.util.Scanner;

public class Exercicio19 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o valor do diametro");
    double diametro = input.nextDouble();

    System.out.println("Digite o valor do altura");
    double altura = input.nextDouble();

    double raio = diametro / 2;

    double areaDaBase = Math.PI * Math.pow(raio, 2);

    double volume = (areaDaBase * altura);

    System.out.println("O volume da piramide cilindro e: " + volume);

  }
}
