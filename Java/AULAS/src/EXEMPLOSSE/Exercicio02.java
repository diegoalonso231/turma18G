package EXEMPLOSSE;

import java.util.Scanner;

/*
 * Faça um programa que entre com três números e coloque em ordem crescente.
 * */
public class Exercicio02 {
public static void main(String[] args) {
	Scanner userEscreva = new Scanner(System.in);
	int a = 0,b=0 ,c=0;
	System.out.println("Ola, humanoide estamos testando um sistema de organização de valores, você é uma cobaia!!!");
	System.out.println("Insira três valores, e salve a terra!!! ");
	a = userEscreva.nextInt();
	b = userEscreva.nextInt();
	c = userEscreva.nextInt();
	userEscreva.close();
	 // ||	(OU)
	 // &&	(E)
	if(a>c && a>b) 
	{
		if(c>b)
			System.out.println("\n1º: "+b+"\n2º: "+c+"\n3º: "+a);
			else
			{
				System.out.println("\n1º: "+c+"\n2º: "+b+"\n3º: "+a);
			}
	}
	else if(b>a && b>c) 
	{
		if(a>c)
			System.out.println("\n1º: "+c+"\n2º: "+a+"\n3º: "+b);
		else
			{
				System.out.println("\n1º: "+a+"\n2º: "+c+"\n3º: "+b);
			}
	}
	else if(c>a && c>b)
		{
			if(a>b)
				System.out.println("\n1º: "+b+"\n2º: "+a+"\n3º: "+c);
			else
			{			
				System.out.println("\n1º: "+a+"\n2º: "+b+"\n3º: "+c);	
			}
		}


	}
	
}

