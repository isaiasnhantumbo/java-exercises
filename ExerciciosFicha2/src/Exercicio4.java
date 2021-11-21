import java.util.Scanner;

public class Exercicio4 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Digite a nota do Trabalho");
    int notaDoTrabalho = input.nextInt();

    System.out.println("Digite a nota da Avaliacao Trimestral");
    int notaDaAvalicaoTrimestral = input.nextInt();

    System.out.println("Digite a nota do Exame Final");
    int notaDoExameFinal = input.nextInt();

    int notaTotalDoTrabalho = notaDoTrabalho * 2;
    int notaTotalDaAvalicaoTrimestral = notaDaAvalicaoTrimestral * 3;
    int notaTotalDoExameFinal = notaDoExameFinal * 5;
    
    int media = (notaTotalDoTrabalho + notaTotalDaAvalicaoTrimestral + notaTotalDoExameFinal) / 3;

    if (media >= 18 && media <= 20) {
      System.out.println("Muito bom");
    } else if (media <= 14 && media >= 17) {
      System.out.println("Bom");
    } else if (media <= 13 && media >= 10) {
      System.out.println("Suficiente");
    } else if (media <= 9 && media >= 7) {
      System.out.println("Mediocre");
    } else if (media <= 6 && media >= 0) {
      System.out.println("Bom");
    }

  }
}
