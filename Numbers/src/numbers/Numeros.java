/*1 - Crie uma classe em Java chamada Numero, que tenha dois m�todos: �Impar(int n) e �Positivo(int n). 
O m�todo �Impar(int n) deve retornar verdadeiro se o n�mero for �mpar e falso caso contr�rio. 
O m�todo �Positivo(int n) deve retornar verdadeiro se o n�mero for positivo e falso caso contr�rio.
Em seguida, crie uma classe Principal com um m�todo main(). No m�todo main(), 
solicite ao usu�rio que insira um n�mero inteiro. Use o m�todo �Impar(int n) para verificar se o n�mero � �mpar ou n�o e imprima o resultado. 
Em seguida, solicite ao usu�rio que insira outro n�mero inteiro. Use o m�todo �Positivo(int n) para verificar se o n�mero � positivo ou n�o e imprima o resultado.*/

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
		
		if(number >= 0) {
			
			return true;
		}else {
			
			return false;
		}
		
	}
	
	
}
