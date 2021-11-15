import java.util.Scanner;


public class AreaRectangulo {

	
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
 		System.out.print("DIGITE O VALOR DA LARGURA");
		double largura = k.nextDouble();
		
		System.out.print("DIGITE O VALOR DO COMPRIMENTO");
		double comprimento = k.nextDouble();
		
		double  area = comprimento * largura;
		
		System.out.print("area do rectangulo:" + area);
		
	}

}
