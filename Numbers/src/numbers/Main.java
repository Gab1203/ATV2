package numbers;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Numeros pessoa = new Numeros();
		
		System.out.println("Digite um número inteiro e descubra se ele é ímpar ou não:");
		int number = scan.nextInt();
		
		System.out.println("O número é ímpar? " + pessoa.eImpar(number));
		
		System.out.println("Agora digite outro número inteiro para descobrir se o número é positivo: ");
		int numero = scan.nextInt();
		
		System.out.println("O número é positivo? " + pessoa.ePositivo(numero));
		
	}

}
