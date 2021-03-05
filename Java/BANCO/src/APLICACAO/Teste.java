package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		double valor;
		char opcao;
		
		
		System.out.println("Insira o numero: ");
		 int numero = leia.nextInt();
		 
		System.out.println("Isira o nome: ");
		 String nome = leia.next();
		 System.out.println("CPF");
		 String cpf = leia.next();
		 

		 
		 
		
		
		
		System.out.println("Digite o valor: ");
		valor = leia.nextDouble();
		System.out.println("Debito ou Credito: D/C: ");
		opcao = leia.next().toUpperCase().charAt(0);
		if(opcao == 'D') 
		{

		}
		else if (opcao == 'C')
		{
			System.out.println("opção invalida!!!");
		}
		
	
	
	
	
	
	
	
	
	}
	}


