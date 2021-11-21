public class Individuo {
	private char sexo;
	private char estadoCivil;
	private int idade;
	private String nome;

	public Individuo(char sexo, char estadoCivil, int idade, String nome) {
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.idade = idade;
		this.nome = nome;

	}

	public void imprimirDados() {

		String sexoPorExtenso = "";
		String estadoCivilPorExtenso = "";

		if (sexo == 'M') {
			sexoPorExtenso = "Masculino";
		}
		if (sexo == 'F') {
			sexoPorExtenso = "Feminino";
		}

		switch (estadoCivil) {
		case 'C':
			estadoCivilPorExtenso = "Casado";
			break;
		case 'S':
			estadoCivilPorExtenso = "Solteiro";
			break;
		case 'D':
			estadoCivilPorExtenso = "Divorciado";
			break;
		case 'V':
			estadoCivilPorExtenso = "Viuvo";
			break;
		default:
			break;
		}
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexoPorExtenso);
		System.out.println("Estado Civil: " + estadoCivilPorExtenso);
		System.out.println("Idade: " + idade);
	}
}
