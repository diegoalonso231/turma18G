package EXEMPLOSSE;

import java.util.Scanner;

public class ParImpar {
public static void main(String[] args) 
{

	Scanner ler = new Scanner(System.in);
	int valorDigitado = 0;
	
	System.out.println("Digite um valor inteiro positivo: ");
	valorDigitado = ler.nextInt();
	
	if(valorDigitado%2 == 0)
	{
	System.out.println("O n�mero "+valorDigitado+" � par!!!");

	}
	else
	{
	System.out.println("O n�mero � impar");
	}
	
	
}
}
