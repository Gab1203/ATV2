package numbers;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Numeros pessoa = new Numeros();
		
		System.out.println("Digite um n�mero inteiro e descubra se ele � �mpar ou n�o:");
		int number = scan.nextInt();
		
		System.out.println("O n�mero � �mpar? " + pessoa.eImpar(number));
		
		System.out.println("Agora digite outro n�mero inteiro para descobrir se o n�mero � positivo: ");
		int numero = scan.nextInt();
		
		System.out.println("O n�mero � positivo? " + pessoa.ePositivo(numero));
		
	}

}
