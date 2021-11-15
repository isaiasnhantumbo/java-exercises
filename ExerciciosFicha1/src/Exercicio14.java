import java.util.Scanner;

public class Exercicio14 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o valor do comprimento");
    int comprimento = input.nextInt();

    System.out.print("Digite o valor do altura");
    int altura = input.nextInt();

    System.out.print("Digite o valor do largura");
    int largura = input.nextInt();

    int volume = comprimento * largura * altura;

    System.out.println("O volume do prisma e: " + volume);

  }
}
