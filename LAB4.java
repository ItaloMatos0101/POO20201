/*Universidade Estadual do Maranhão
 * Nome: Italo Domingos Rodrigues Matos
 * Disciplina: Programação Orientado a Objetos
 * Programa: Determinar e mostra os cinco primeiros múltiplos de 3.
 */

package italo; //Pacote Italo

public class LAB4 {

	public static void main(String[] args) {
		int mul3 = 3;
		
		for(int i = 1;i<=5;i++) {
			System.out.println(i+"º múltiplo de 3: "+(mul3*i));//a cada repetição ira ser multiplicado o valor de três para saber seus múltiplos
		}
		System.out.println("Fim xD!");
		
	}

}