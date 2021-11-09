package br.com.generation.lista1;
import java.util.Scanner;

public class Ex004 {
	
	public static void main(String[] args) {
		
		double a,b,c,d,r,s;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite o valor de A: ");
		a = scan.nextDouble();
		
		System.out.println("digite o valor de B: ");
		b = scan.nextDouble();
		
		System.out.println("digite o valor de C: ");
		c = scan.nextDouble();
		
		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		d = (r+s)/2;
		
		System.out.printf("O resultado da expressão é: %.2f",d);
		
		scan.close();
	}
 
}
