public class Electrodomestico {
	private String nome;

	private String marca;
	private double preco;
	private int anoFabrico;
	
	public static int quantidadeDeFuncionariosCriados = 0;
	
	public Electrodomestico() {

	}

	public Electrodomestico(String nome, String marca, double preco,
			int anoFabrico) {
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
		this.anoFabrico = anoFabrico;
		
		quantidadeDeFuncionariosCriados++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getAnoFabrico() {
		return anoFabrico;
	}

	public void setAnoFabrico(int anoFabrico) {
		this.anoFabrico = anoFabrico;
	}

	public void imprimirElectrodomestico() {
		System.out.println(nome + "\t" + marca + "\t" + preco + "\t"
				+ anoFabrico);
	}

	public void visualizarElectrodomestico() {
		System.out.println("Nome: " + nome);
		System.out.println("Marca: " + marca);
		System.out.println("Preco: " + preco);
		System.out.println("Ano de fabrico: " + anoFabrico);
	}
}
