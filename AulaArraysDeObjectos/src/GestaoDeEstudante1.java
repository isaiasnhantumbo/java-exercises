import java.util.Scanner;

public class GestaoDeEstudante1 {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Digite a capacidade do array: ");
		int capacidade = input.nextInt();
		
		Estudante[] estudantes = new Estudante[capacidade];
		
		EstudantesMetodos.preencherArray(estudantes);
		EstudantesMetodos.listarEstudantes(estudantes);
		EstudantesMetodos.listaDeEstudantesComMediaETeste1Positiva(estudantes);
		
		

	}

}
