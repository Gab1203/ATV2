/*2 - Crie três classes em Java: Vetor, Matriz e Verificador.
A classe Vetor deve ter um atributo que é um vetor de inteiros e um método preencher(int n) que preenche o vetor com n números inteiros inseridos pelo usuário.
A classe Matriz deve ter um atributo que é uma matriz de inteiros e um método preencher(int m, int n) que preenche a matriz com m linhas e n 
colunas com números inteiros inseridos pelo usuário.
A classe Verificador deve ter um método éPar(int n) que retorna verdadeiro se o número for par e falso caso contrário.
Em seguida, crie uma classe Principal com um método main(). No método main(), crie um objeto da classe Vetor e um objeto da classe Matriz. 
Use os métodos preencher(int n) e preencher(int m, int n) para preencher o vetor e a matriz, respectivamente. Em seguida, crie um objeto da classe Verificador. 
Percorra o vetor e a matriz e use o método éPar(int n) para verificar se cada número é par ou não. Imprima o resultado.*/
package vetores;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	Vetor vetor = new Vetor();
	Matriz matriz = new Matriz();
	Verificador verificador = new Verificador();
	
	System.out.println("Digite o índice do vetor:");
	int indice = scan.nextInt();
	
	vetor.preencher(indice);
	
	System.out.println("Digite a quantidade de linhas da matriz:");
	int linhas = scan.nextInt();
	
	System.out.println("Agora, digite a quantidade de colunas da matriz:");
	int colunas = scan.nextInt();
	
	matriz.preencher(linhas, colunas);
		
	System.out.println("\nVerificação do vetor:");
	
	for(int i = 0; i < indice; i++) {
		
	System.out.printf("O número %d é par? %B\n", vetor.numeros[i], verificador.ePar(vetor.numeros[i]));
		
	}
	
	
System.out.println("\nVerificação da matriz:");
	
	for(int i = 0; i < linhas; i++) {
		
		for(int j = 0; j < colunas; j++) {
			
			System.out.printf("O número %d da linha %d e coluna %d é par? %B\n", matriz.matriz[i][j], i+1, j+1, verificador.ePar(matriz.matriz[i][j]));
			
		}
		
	}
	
	
	}

}
