package br.com.generation.lista1;
import java.util.Scanner;

public class Ex005 {
	
	public static void main(String[] args) {
		
		double nota1,nota2,nota3,media;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		nota1 = scan.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		nota2 = scan.nextDouble();
		
		System.out.println("Digite a nota 3: ");
		nota3 = scan.nextDouble();
		
		media = ((nota1*2) + (nota2*3) + (nota3*5)) / 10.0;
		
		System.out.printf("A media final do aluno foi: %.2f",media);
		
		scan.close();
	}
 
}
