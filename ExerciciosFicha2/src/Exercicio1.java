import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o valor da nota1:");
    double nota1 = input.nextDouble();

    System.out.print("Digite o valor da nota2:");
    double nota2 = input.nextDouble();

    System.out.print("Digite o valor da nota3:");
    double nota3 = input.nextDouble();
    
    System.out.print("Digite o valor da nota4:");
    double nota4 = input.nextDouble();

    double media = (nota1 + nota2 + nota3 + nota4) / 4;

    if (media >= 10) {
      System.out.println("Aluno Aprovado");
    }
  }
}
