import java.util.Scanner;

public class Medias {
  static Scanner input = new Scanner(System.in);
		
	public static void mediaSemRetornoSemParametro(){
		System.out.print("Digite teste 1:");
		double teste1 = input.nextDouble();
		
		System.out.print("Digite teste 2:");
		double teste2 = input.nextDouble();
		
		double media = (teste1+ teste2) / 2;
		
		System.out.println("Medeia: " + media);
	}
	
	public static void mediaSemRetornoComParametro(double teste1,double teste2){
			
		double media = (teste1+ teste2) / 2;
		
		System.out.println("Medeia: " + media);
	}
	
	public static double mediaComRetornoSemParametro(){
		System.out.print("Digite teste 1:");
		double teste1 = input.nextDouble();
		
		System.out.print("Digite teste 2:");
		double teste2 = input.nextDouble();
		
		double media = (teste1+ teste2) / 2;
		
		return media;
	}
	
	public static double mediaComRetornoComParametro(double teste1,double teste2){
		
		double media = (teste1+ teste2) / 2;
		
		return media;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Media sem retorno e sem parametro");
		mediaSemRetornoSemParametro();
		
		System.out.println("Media sem retorno e com parametro");
		System.out.print("Digite teste 1:");
		double t1 = input.nextDouble();
		
		System.out.print("Digite teste 2:");
		double t2 = input.nextDouble();
		mediaSemRetornoComParametro(t1,t2);
		
		System.out.println("Media com retorno e sem parametro");
		double media1 = mediaComRetornoSemParametro();
		
		System.out.println("Media :" + media1);
		
		System.out.println("Media com retorno e com parametro");
		System.out.print("Digite teste 1:");
		double t3 = input.nextDouble();
		
		System.out.print("Digite teste 2:");
		double t4 = input.nextDouble();
		
		double media2 = mediaComRetornoComParametro(t3,t4);
		
		System.out.println("Media :" + media2);
	}

}
