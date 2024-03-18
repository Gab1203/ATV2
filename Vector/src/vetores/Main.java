/*2 - Crie tr�s classes em Java: Vetor, Matriz e Verificador.
A classe Vetor deve ter um atributo que � um vetor de inteiros e um m�todo preencher(int n) que preenche o vetor com n n�meros inteiros inseridos pelo usu�rio.
A classe Matriz deve ter um atributo que � uma matriz de inteiros e um m�todo preencher(int m, int n) que preenche a matriz com m linhas e n 
colunas com n�meros inteiros inseridos pelo usu�rio.
A classe Verificador deve ter um m�todo �Par(int n) que retorna verdadeiro se o n�mero for par e falso caso contr�rio.
Em seguida, crie uma classe Principal com um m�todo main(). No m�todo main(), crie um objeto da classe Vetor e um objeto da classe Matriz. 
Use os m�todos preencher(int n) e preencher(int m, int n) para preencher o vetor e a matriz, respectivamente. Em seguida, crie um objeto da classe Verificador. 
Percorra o vetor e a matriz e use o m�todo �Par(int n) para verificar se cada n�mero � par ou n�o. Imprima o resultado.*/
package vetores;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	Vetor vetor = new Vetor();
	Matriz matriz = new Matriz();
	Verificador verificador = new Verificador();
	
	System.out.println("Digite o �ndice do vetor:");
	int indice = scan.nextInt();
	
	vetor.preencher(indice);
	
	System.out.println("Digite a quantidade de linhas da matriz:");
	int linhas = scan.nextInt();
	
	System.out.println("Agora, digite a quantidade de colunas da matriz:");
	int colunas = scan.nextInt();
	
	matriz.preencher(linhas, colunas);
		
	System.out.println("\nVerifica��o do vetor:");
	
	for(int i = 0; i < indice; i++) {
		
	System.out.printf("O n�mero %d � par? %B\n", vetor.numeros[i], verificador.ePar(vetor.numeros[i]));
		
	}
	
	
System.out.println("\nVerifica��o da matriz:");
	
	for(int i = 0; i < linhas; i++) {
		
		for(int j = 0; j < colunas; j++) {
			
			System.out.printf("O n�mero %d da linha %d e coluna %d � par? %B\n", matriz.matriz[i][j], i+1, j+1, verificador.ePar(matriz.matriz[i][j]));
			
		}
		
	}
	
	
	}

}
