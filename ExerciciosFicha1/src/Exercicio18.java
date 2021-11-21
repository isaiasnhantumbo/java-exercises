import java.util.Scanner;

public class Exercicio18 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o valor do comprimento");
    double comprimento = input.nextDouble();

    System.out.println("Digite o valor do altura");
    double altura = input.nextDouble();

    double areaDaBaseDaPiramide = (comprimento * altura) / 2;

    double volume = (areaDaBaseDaPiramide * altura) / 3;

    System.out.println("O volume da piramide triangular e: " + volume);

  }
}
