import java.util.Scanner;


public class Exercicio1 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite o numero de estudantes");
		int cap = input.nextInt();
		int [] idades = new int[cap];
		preencherArray(idades);
		visualizarArray(idades);
		int media = mediaIdades(idades);
		System.out.println("media de idades: " + media);

	}
	
	public static void preencherArray(int[] b){
		for(int i = 0;i<b.length;i++){
			System.out.println("Digite a idade do estudante");
			b[i] = input.nextInt();
		}
	}
	
	public static void visualizarArray(int[] c){
		int i = 0;
		
		do {
			System.out.println(c[i]);
			i++;
		}while(i < c.length);
	}
	
	public static int mediaIdades (int[] a){
		int soma = 0, media, i = 0;
		
		while(i<a.length){
			soma = soma + a[i];
			i++;
		}
		media = soma / a.length;
		return media;
		
	}

}
