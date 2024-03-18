/*2 - Crie três classes em Java: Vetor, Matriz e Verificador.
A classe Vetor deve ter um atributo que é um vetor de inteiros e um método preencher(int n) que preenche o vetor com n números inteiros inseridos pelo usuário.
A classe Matriz deve ter um atributo que é uma matriz de inteiros e um método preencher(int m, int n) que preenche a matriz com m linhas e n 
colunas com números inteiros inseridos pelo usuário.
A classe Verificador deve ter um método éPar(int n) que retorna verdadeiro se o número for par e falso caso contrário.
Em seguida, crie uma classe Principal com um método main(). No método main(), crie um objeto da classe Vetor e um objeto da classe Matriz. 
Use os métodos preencher(int n) e preencher(int m, int n) para preencher o vetor e a matriz, respectivamente. Em seguida, crie um objeto da classe Verificador. 
Percorra o vetor e a matriz e use o método éPar(int n) para verificar se cada número é par ou não. Imprima o resultado.*/
package vetores;

public class Verificador {
	
	
	public boolean ePar(int n) {
		
		if(n % 2 == 0) {
			
			return true;
		}else {
			
			return false;
		}
	}

}
