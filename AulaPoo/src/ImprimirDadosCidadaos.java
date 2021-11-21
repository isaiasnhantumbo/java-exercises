public class ImprimirDadosCidadaos {
	public static void main(String[] args) {
		Individuo cidadao1, cidadao2, cidadao3;

		cidadao1 = new Individuo('M', 'C', 34, "Albert");
		cidadao2 = new Individuo('F', 'S', 27, "Rhosty");
		cidadao3 = new Individuo('F', 'V', 72, "Phaula");

		cidadao1.imprimirDados();
		System.out.println();
		cidadao2.imprimirDados();
		System.out.println();
		cidadao3.imprimirDados();

	}
}
