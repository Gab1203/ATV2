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

public class Vetor {
	Scanner scan = new Scanner(System.in);
	
	
	public int[] numeros;

	public void preencher(int n) {
		
		int[] numeros = new int[n];
		this.numeros = numeros;
		
		for(int i = 0; i < n; i++) {
			
			System.out.printf("Digite o %d� n�mero do vetor:\n", i+1);
			numeros[i] = scan.nextInt();
			
		}
		
	}

	
	
	
	
}
