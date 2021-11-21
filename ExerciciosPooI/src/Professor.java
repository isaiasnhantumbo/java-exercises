
public class Professor {
	private int codigo;
	private String nome;
	private String contacto;
	private String curso;
	private String turma;
	private int numeroDeHorasTrabalhadasNoMes;
	private double salarioPorHora;

	public static int quantidadeDeProfessoresCriados = 0;

	public Professor(int codigo, String nome, String contacto, String curso, String turma,
			int numeroDeHorasTrabalhadasNoMes, double salarioPorHora) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.contacto = contacto;
		this.curso = curso;
		this.turma = turma;
		this.numeroDeHorasTrabalhadasNoMes = numeroDeHorasTrabalhadasNoMes;
		this.salarioPorHora = salarioPorHora;

		quantidadeDeProfessoresCriados++;
	}

	@Override
	public String toString() {
		return "Professor [codigo=" + codigo + ", nome=" + nome + ", contacto=" + contacto + ", curso=" + curso
				+ ", turma=" + turma + ", numeroDeHorasTrabalhadasNoMes=" + numeroDeHorasTrabalhadasNoMes
				+ ", salarioPorHora=" + salarioPorHora + "Salario=" + calcularSalarioDoProfessor() + "]";
	}

	public void imprimirProfessor() {
		System.out.println("Nome: " + nome);
		System.out.println("Codigo: " + codigo);
		System.out.println("Contacto: " + contacto);
		System.out.println("Curso: " + curso);
		System.out.println("Turma: " + turma);
		System.out.println("Numero de Horas Trabalhadas: " + numeroDeHorasTrabalhadasNoMes);
		System.out.println("Salario Por Hora: " + salarioPorHora);
		System.out.println("Salario: " + calcularSalarioDoProfessor());
	}

	public boolean equals(Professor professor) {
		if (this.codigo == professor.codigo) {
			return true;
		} else {
			return false;
		}
	}

	public double calcularSalarioDoProfessor() {
		double salario = salarioPorHora * numeroDeHorasTrabalhadasNoMes;
		return salario;
	}

	public String getNome() {
		return nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	
}
