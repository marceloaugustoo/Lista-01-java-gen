package br.com.generation.lista1;
import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		
		int anos,meses,dias,idade;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias.");
		System.out.println("Dias: ");
		idade = scan.nextInt();
		
		anos = idade/365;
		meses = (idade%365)/30;
		dias = (idade%365)%30;
		
		System.out.printf("Sua idade é %d anos, %d meses e %d dias",anos,meses,dias);
		
		scan.close();
	}

}
