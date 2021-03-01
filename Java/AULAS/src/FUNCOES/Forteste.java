package FUNCOES;

import java.util.Scanner;

public class Forteste {
public static void main(String[] args) {
int numeroRepeticao=0,numeroPulos=0;	
Scanner ler = new Scanner(System.in);

System.out.println("Escreva quantas vezes ira repetir:"
		+ "\nEscreva de quanto em quanto ira pular: ");

numeroRepeticao = ler.nextInt();
numeroPulos = ler.nextInt();
	for(int i= 0;i<=numeroRepeticao;i= i+numeroPulos)
	{
	System.out.println("Numero: "+i);
	}
}
}
