/*Universidade Estadual do Maranhão
 * Nome: Italo Domingos Rodrigues Matos
 * Disciplina: Programação Orientado a Objetos
 * Programa: Somatória de dois números
 */
package italo; //chamando o pacote de nome "italo"

import java.util.Scanner; //importando o "Scanner" para possibilidar a leitura de dados

public class POO { 

	public static void main(String[] args) { //Chamando a função main para implementar os códigos do programa
		
		Scanner ler = new Scanner(System.in); // Definindo uma variável Scanner de nome "ler", que ira ler os dados digitados no teclado
		
		System.out.println("Digite um número: "); // print da mensagem para q o usuário digite o primeiro número
		int num1 = ler.nextInt(); //Variável do tipo inteiro denominado "num1" que recebe um número resgatado do teclado atravéis do "ler"
		
		System.out.println("Digite outro número: "); // print da mensagem para q o usuário digite o segundo número
		int num2 = ler.nextInt(); //Variável do tipo inteiro denominado "num2" que recebe um número resgatado do teclado atravéis do "ler"
		
		System.out.println("Soma: "+(num1+num2)); // print da soma entre as duas variáveis "num1 + num2"
		
		ler.close(); // Fechando o "LER"
	}

}
