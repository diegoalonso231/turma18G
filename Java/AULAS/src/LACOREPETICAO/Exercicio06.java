package LACOREPETICAO;
import java.util.Scanner;
public class Exercicio06 {
	/*
	Escrever um programa que receba v�rios n�meros inteiros no teclado. 
	E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
	Para sair digitar 0(zero).(DO...WHILE)*
	 
	  M (3) = {0, 3, 6, 9, 12, 15, 18, 21, 24, 27, 30,
	  os m�ltiplos de tr�s s�o todos aqueles valores que, quando divididos por tr�s, resultam em uma 
	  divis�o exata e sem resto. */


		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			int nun=0,soma=0,quantidade=0, media=0;
			do {
				System.out.println("Escreva um numero! ");
				nun = leia.nextInt();
				
				//saber se � multiplo de 3
				if(nun%3 ==0 && nun !=0) {
					quantidade++;
					soma = soma + nun;
					media = soma/quantidade;
				}else {
					System.out.println("[ERRO] Numero "+nun+" N�o � multiplo de 3!\n");

				}
				
			}while(nun !=0);
			if(media==0) {
			System.out.println("N�o teve nenhum numero para poder dar uma media!");
			}else {
			System.out.println("a m�dia dos n�meros m�ltiplos de 3 � "+ media);
			}
		}

	}