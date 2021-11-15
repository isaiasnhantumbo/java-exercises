import java.util.Scanner;

public class Exercicio3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o numero de estudantes");
    int n = input.nextInt();

    double nota1, nota2, nota3, nota4, media;

    for (int i = 1; i <= n; i++) {

      do {
        System.out.print("DIGITE A NOTA 1:");
        nota1 = input.nextDouble();

      } while (nota1 < 0 || nota1 > 20);

      do {
        System.out.print("DIGITE A NOTA 2:");
        nota2 = input.nextDouble();

      } while (nota2 < 0 || nota2 > 20);

      do {
        System.out.print("DIGITE A NOTA 3:");
        nota3 = input.nextDouble();

      } while (nota3 < 0 || nota3 > 20);

      do {
        System.out.print("DIGITE A NOTA 4:");
        nota4 = input.nextDouble();

      } while (nota4 < 0 || nota4 > 20);

      media = (nota1 + nota2 + nota3 + nota4) / 4;

      if (media >= 7) {
        System.out.println("Aluno " + i + " Aprovado");

      } else {
        System.out.println("Aluno "+ i + " Reprovado");

      }

    }

  }
}
