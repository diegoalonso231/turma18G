package LACOREPETICAO;
import java.util.Scanner;
/*
Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
 No final, mostre a soma dos n�meros digitados.(DO...WHILE)
*/


public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		byte nun =0 ;
		int soma=0;
		do {
			System.out.println("Digite um numero! Digite 0 para poder parar o programa");
			nun = leia.nextByte();
			soma = soma +nun;
			
		}while(nun !=0);
		System.out.println("A soma dos numeros � :"+ soma);
	}

}