package br.com.generation.lista1;
import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		
		int anos,meses,dias,idade;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos, meses e dias.");
		System.out.println("Anos: ");
		anos = scan.nextInt();
		
		System.out.println("Meses: ");
		meses = scan.nextInt();
		
		System.out.println("Dias: ");
		dias = scan.nextInt();
		
		idade = (365*anos) + (30*meses) + dias;
		
		System.out.printf("Sua idade é %d dias",idade);
		
		scan.close();
	}

}
