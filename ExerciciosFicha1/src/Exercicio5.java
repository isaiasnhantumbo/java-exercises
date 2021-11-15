import java.util.Scanner;

public class Exercicio5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o valor do seu salario");
    double salario = input.nextDouble();

    System.out.println("Digite a quantidade de quilowatts");
    double quilowatts = input.nextDouble();

    double precoDoQuilowatts = (salario * 20.0) / 100;

    double precoASerPago = precoDoQuilowatts * quilowatts;

    double precoComDesconto = precoASerPago - ((precoASerPago * 15.0) / 100);

    System.out.println("precoDoQuilowatts " + precoDoQuilowatts + " precoASerPago: " + precoASerPago
        + " precoComDesconto: " + precoComDesconto);

  }
}
