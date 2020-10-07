/*Universidade Estadual do Maranhão
 * Nome: Italo Domingos Rodrigues Matos
 * Disciplina: Programação Orientado a Objetos
 * Programa: Receber e printar os dados
 */

package italo; //Chamei o pacote italo

import java.util.Scanner;//Importação do Scanner para receber entrada de dados

public class LAB3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);// Declarando "ler" como Scanne
		
		System.out.println("Informe seu nome: ");
		String nome = ler.nextLine(); 
		//Lendo a variável "nome" do tipo String, usando nextLine para armazenar Strings logo após o espaço tambem
	
		System.out.println("Informe sua idade: ");
		int idade = Integer.parseInt(ler.nextLine()); 
		//Lendo a variável "idade" do tipo Inteiro e ja implementando um método que conserta o bug de ler Inteiro e depois String
		
		System.out.println("Informe seu peso: ");
		double peso = ler.nextDouble(); //Lendo a variável "peso" do tipo Double para números do tipo flutuante
		
		System.out.println("Informe seu sexo[M/F]: ");
		char sexo = ler.next().charAt(0); //Lendo variável "sexo" do tipo Char para armazenar somente um caractere
		
		//Print dos dados armazenados
		System.out.println("\n\n==================================\nNome: "+nome+"\nIdade: "+idade+"\nPeso: "+peso+"\nSexo: "+sexo);
		
		ler.close();

	}

}
