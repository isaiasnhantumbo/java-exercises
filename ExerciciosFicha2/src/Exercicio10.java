import java.util.Scanner;

public class Exercicio10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o seu Peso:");
    double weight = input.nextDouble();

    System.out.print("Digite a sua Altura:");
    double height = input.nextDouble();

    double imc = weight / Math.pow(height, 2);

    if (imc < 18.5) {
      System.out.println("Abaixo do peso");

    } else if (imc > 18.5 && imc < 25) {
      System.out.println("Peso normal");

    } else if (imc > 25 && imc < 30) {
      System.out.println("Acima do peso");

    } else if (imc > 30) {
      System.out.println("Obeso");

    }
  }
}
