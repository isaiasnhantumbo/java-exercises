import java.util.Scanner;

public class ProcessarElectrodemestico {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Electrodomestico electro1, electro2, electro3;
		electro1 = new Electrodomestico("Chaleira", "Philips", 2000, 2020);

		String nome = "Fogao";
		String marca = "Defy";
		double preco = 15000;
		int anoFabrico = 2018;
		electro2 = new Electrodomestico(nome, marca, preco, anoFabrico);

		System.out.print("Digite o nome electrodomestico: ");
		String nome1 = input.next();
		System.out.print("Digite o marca electrodomestico: ");
		String marca1 = input.next();
		System.out.print("Digite o preco electrodomestico: ");
		double preco1 = input.nextDouble();
		System.out.print("Digite o ano de fabbrico electrodomestico: ");
		int anoFabrico1 = input.nextInt();

		electro3 = new Electrodomestico(nome1, marca1, preco1, anoFabrico1);

		electro1.imprimirElectrodomestico();
		System.out.println();

		electro2.visualizarElectrodomestico();
		System.out.println();

		electro3.imprimirElectrodomestico();
		System.out.println(electro1.getMarca());
		electro2.setPreco(17000);
		electro2.visualizarElectrodomestico();

	}
}
