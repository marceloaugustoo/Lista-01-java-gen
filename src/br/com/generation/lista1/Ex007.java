package br.com.generation.lista1;
import java.util.Scanner;

public class Ex007 {
	
	public static void main(String[] args) {
		
		double A,B,C,D,E,F,X,Y;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		A = scan.nextDouble();
		
		System.out.println("Digite o valor de B:");
		B = scan.nextDouble();
		
		System.out.println("Digite o valor de C:");
		C = scan.nextDouble();
		
		System.out.println("Digite o valor de D:");
		D = scan.nextDouble();
		
		System.out.println("Digite o valor de E:");
		E = scan.nextDouble();
		
		System.out.println("Digite o valor de F:");
		F = scan.nextDouble();
		
		X = ((C*E)-(B*F))/((A*E)-(B*D));
		Y = ((A*F) - (C*D))/((A*E)-(B*D));
		
		System.out.printf("O valor de X é: %.2f \nO valor de Y é: %.2f ",X,Y);
		
		scan.close();
	}
 
}
