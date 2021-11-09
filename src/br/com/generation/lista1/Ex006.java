package br.com.generation.lista1;
import java.util.Scanner;
import java.lang.Math;
public class Ex006 {
	
	public static void main(String[] args) {
		
		double x1,x2,y1,y2,p1,p2,d;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o ponto x1: ");
		x1 = scan.nextDouble();
		
		System.out.println("Digite o ponto y1: ");
		y1 = scan.nextDouble();
		
		System.out.println("Digite o ponto x2: ");
		x2 = scan.nextDouble();
		
		System.out.println("Digite o ponto y2: ");
		y2 = scan.nextDouble();
		
		p1 = Math.pow((x2-x1), 2.0);
		p2 = Math.pow((y2-y1), 2.0);
		d = Math.sqrt((p1+p2));
		
		System.out.printf("A distancia entre os pontos é: %.2f",d);
		
		scan.close();
	}
 
}
