package EXEMPLOSSE;

import java.util.Scanner;

public class Exercicio01 {
/*Fa�a um programa que receba tr�s inteiros e 
 * diga qual deles � o maior.*/
public static void main(String[] args) {
		
	Scanner userEscreva = new Scanner(System.in); 
	

	System.out.println("Ola terr�queo, voc� vai conhecer o programa que retorna o maior dos valores inseridos");
	System.out.println("Escreva os tr�s valores: ");
	
	int a = userEscreva.nextInt();
	int b = userEscreva.nextInt();
	int c = userEscreva.nextInt();
	userEscreva.close();
	
	if(a>c && a>b) 
	{
		System.out.println("O maior valor �: "+a);
	}
	else if(b>a && b>c) 
	{
		System.out.println("O maior valor �: "+b);
	}
	else if(c>a && c>b)
	{
		System.out.println("O maior valor �: "+c);
	}
	
}
}
