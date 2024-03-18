/*1 - Crie uma classe em Java chamada Numero, que tenha dois métodos: éImpar(int n) e éPositivo(int n). 
O método éImpar(int n) deve retornar verdadeiro se o número for ímpar e falso caso contrário. 
O método éPositivo(int n) deve retornar verdadeiro se o número for positivo e falso caso contrário.
Em seguida, crie uma classe Principal com um método main(). No método main(), 
solicite ao usuário que insira um número inteiro. Use o método éImpar(int n) para verificar se o número é ímpar ou não e imprima o resultado. 
Em seguida, solicite ao usuário que insira outro número inteiro. Use o método éPositivo(int n) para verificar se o número é positivo ou não e imprima o resultado.*/

package numbers;

public class Numeros {

	
	public boolean eImpar(int number) {
		
		if(number % 2 == 0) {
			
			return false; 
			
		}else {
			
			return true;
		}
		
	}
	
	public boolean ePositivo(int number) {
		
		if(number > 0) {
			
			return true;
		}else {
			
			return false;
		}
		
	}
	
	
}
