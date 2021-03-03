package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Conta conta3 = new Conta(22,"222.222.222.22");
		double valor;
		char opcao;
		
		System.out.println("Digite o valor: ");
		valor = leia.nextDouble();
		System.out.println("Debito ou Credito: D/C: ");
		opcao = leia.next().toUpperCase().charAt(0);
		if(opcao == 'D') 
		{
			conta3.debito(valor);
		}
		else if (opcao == 'C')
		{
			System.out.println("opção invalida!!!");
		}
		
	
	
	
	
	
	
	
	
	}
	}


