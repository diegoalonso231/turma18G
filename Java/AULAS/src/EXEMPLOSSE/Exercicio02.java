package EXEMPLOSSE;

import java.util.Scanner;

/*
 * Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
 * */
public class Exercicio02 {
public static void main(String[] args) {
	Scanner userEscreva = new Scanner(System.in);
	int a = 0,b=0 ,c=0;
	System.out.println("Ola, humanoide estamos testando um sistema de organiza��o de valores, voc� � uma cobaia!!!");
	System.out.println("Insira tr�s valores, e salve a terra!!! ");
	a = userEscreva.nextInt();
	b = userEscreva.nextInt();
	c = userEscreva.nextInt();
	userEscreva.close();
	 // ||	(OU)
	 // &&	(E)
	if(a>c && a>b) 
	{
		if(c>b)
			System.out.println("\n1�: "+b+"\n2�: "+c+"\n3�: "+a);
			else
			{
				System.out.println("\n1�: "+c+"\n2�: "+b+"\n3�: "+a);
			}
	}
	else if(b>a && b>c) 
	{
		if(a>c)
			System.out.println("\n1�: "+c+"\n2�: "+a+"\n3�: "+b);
		else
			{
				System.out.println("\n1�: "+a+"\n2�: "+c+"\n3�: "+b);
			}
	}
	else if(c>a && c>b)
		{
			if(a>b)
				System.out.println("\n1�: "+b+"\n2�: "+a+"\n3�: "+c);
			else
			{			
				System.out.println("\n1�: "+a+"\n2�: "+b+"\n3�: "+c);	
			}
		}


	}
	
}

