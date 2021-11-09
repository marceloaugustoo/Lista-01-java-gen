package br.com.generation.lista1;
import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		
		int segundos,minutos,hora,tempo;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tempo em segundos: ");
		tempo = scan.nextInt();
		
		hora = tempo/3600;
		minutos = (tempo%3600)/60;
		segundos = (tempo%3600) % 60;
		
		System.out.printf("O tempo do evento é %d hora(s), %d "
				+ "minuto(s) e %d segundo(s).", hora,minutos,segundos);
		
		scan.close();

	}

}
