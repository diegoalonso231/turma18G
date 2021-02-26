package EXEMPLOSSE;

import java.util.Scanner;

public class Exercicio01 {
/*Faça um programa que receba três inteiros e 
 * diga qual deles é o maior.*/
public static void main(String[] args) {
		
	Scanner userEscreva = new Scanner(System.in); 
	

	System.out.println("Ola terráqueo, você vai conhecer o programa que retorna o maior dos valores inseridos");
	System.out.println("Escreva os três valores: ");
	
	int a = userEscreva.nextInt();
	int b = userEscreva.nextInt();
	int c = userEscreva.nextInt();
	userEscreva.close();
	
	if(a>c && a>b) 
	{
		System.out.println("O maior valor é: "+a);
	}
	else if(b>a && b>c) 
	{
		System.out.println("O maior valor é: "+b);
	}
	else if(c>a && c>b)
	{
		System.out.println("O maior valor é: "+c);
	}
	
}
}
