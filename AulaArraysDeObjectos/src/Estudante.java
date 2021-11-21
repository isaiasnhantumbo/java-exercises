
public class Estudante {
	private String nome;
	private double teste1;
	private double teste2;
	
	public Estudante(String nome, double teste1, double teste2) {
		super();
		this.nome = nome;
		this.teste1 = teste1;
		this.teste2 = teste2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTeste1() {
		return teste1;
	}

	public void setTeste1(double teste1) {
		this.teste1 = teste1;
	}

	public double getTeste2() {
		return teste2;
	}

	public void setTeste2(double teste2) {
		this.teste2 = teste2;
	}
	
	public double calcularMedia(){
		double media = (teste1 + teste2) / 2;
		return media;
	}

	@Override
	public String toString() {
		return "Estudante [nome=" + nome + ", teste1=" + teste1 + ", teste2="
				+ teste2 + "media=" + calcularMedia() +"]";
	}
	
	public void imprimirEstudante() {
		System.out.println("Estudante [nome=" + nome + ", teste1=" + teste1 + ", teste2="
				+ teste2 + "media=" + calcularMedia() + "]");
	}
	
	public void visualizarEstudante(){
		System.out.println("Nome: " + nome);
		System.out.println("Teste 1: " + teste1);
		System.out.println("Teste 2: " + teste2);
		System.out.println("media: " + calcularMedia());
	}
	
	
	
}
