import java.util.Scanner;

public class ProcessaSalario {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Funcionario funcionario1, funcionario2;
		funcionario1 = new Funcionario("Isaias", 20, 10);
		
		funcionario2 = new Funcionario("Larson", 10, 2);
		
		boolean osFuncionariosSaoIguais = funcionario1.equals(funcionario2);
		System.out.println(osFuncionariosSaoIguais);
		
		System.out.println(funcionario1.toString());
		funcionario1.calcularSalario();
		int salario1 = funcionario1.calcularSalario(funcionario1.getQuantidadeDeDiasTrabalhados(), funcionario1.getSalario());
		System.out.println("O funcionario: " + funcionario1.getNome() + ", recebe: " + salario1);
		System.out.println("O numero de funcionarios criados eh: " + Funcionario.quantidadeDeFuncionariosCriados);
		int salario2 = Funcionario.calculaSalario( funcionario1.getQuantidadeDeDiasTrabalhados(), funcionario1.getSalario());
		System.out.println("O funcionario: " + funcionario1.getNome() + ", recebe: " + salario2);
		
		System.out.println();
		System.out.println(funcionario2.toString());
		funcionario2.calcularSalario();
		int salario3 = funcionario2.calcularSalario(funcionario2.getQuantidadeDeDiasTrabalhados(), funcionario2.getSalario());
		System.out.println("O funcionario: " + funcionario2.getNome() + ", recebe: " + salario3);
		System.out.println("O numero de funcionarios criados eh: " + Funcionario.quantidadeDeFuncionariosCriados);
		int salario4 = Funcionario.calculaSalario( funcionario2.getQuantidadeDeDiasTrabalhados(), funcionario2.getSalario());
		System.out.println("O funcionario: " + funcionario2.getNome() + ", recebe: " + salario4);
		
		
	}

}
