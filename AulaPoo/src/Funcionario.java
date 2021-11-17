public class Funcionario {
	private String nome;
	private int salario;
	private int quantidadeDeDiasTrabalhados;

	public static int quantidadeDeFuncionariosCriados = 0;

	public Funcionario() {
		
	}
	
	public Funcionario(String nome, int salario, int diasTrabalhados
			) {
		this.nome = nome;
		this.salario = salario;
		quantidadeDeDiasTrabalhados = diasTrabalhados;
		

		quantidadeDeFuncionariosCriados++;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getQuantidadeDeDiasTrabalhados() {
		return quantidadeDeDiasTrabalhados;
	}

	public void setQuantidadeDeDiasTrabalhados(int quantidadeDeDiasTrabalhados) {
		this.quantidadeDeDiasTrabalhados = quantidadeDeDiasTrabalhados;
	}

	public boolean equals(Funcionario func) {
		if (this.nome == func.nome) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {

		String descricao = "Funcionario: " + nome + " Trabalhou " + quantidadeDeDiasTrabalhados +" dias"
				+ " Valor Diario: " + salario;
		return descricao;
	}

	public void calcularSalario() {
		int salarioTotal = quantidadeDeDiasTrabalhados * salario;
		System.out.println(salarioTotal);
	}

	public int calcularSalario(int dias, int salarioDiario) {
		int salarioTotal = dias * salarioDiario;
		return salarioTotal;
	}
	
	public static int calculaSalario(int dias, int salarioDiario){
		int salarioTotal = dias * salarioDiario;
		return salarioTotal;
		
	}
}
