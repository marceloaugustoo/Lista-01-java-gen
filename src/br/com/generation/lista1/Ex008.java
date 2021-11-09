package br.com.generation.lista1;
import java.util.Scanner; 
public class Ex008 {

	public static void main(String[] args) {
		
		double preco,custof; 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o custo de fabrica: ");
		custof = scan.nextDouble();
		
		preco = custof + (0.28*custof) + (0.45*custof);
		
		System.out.printf("O preço ao consumidor é de: R$ %.2f", preco);
		
		scan.close();
	}

}
