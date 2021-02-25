import java.util.Scanner;

public class ProgramacaoSequencialExercicio02 {
	public static void main(String[] args) {
/*
* Faça um sistema que leia a 
* idade de uma pessoa expressa em dias
*  e mostre-a expressa em anos, meses e dias. 

* 
* 
* 
* */		
Scanner userEscreva = new Scanner(System.in); 
							
int idade;
int anos;
int meses;
int diasVividos;
int anosEmDias;

	
	System.out.println("Digite um valor em dias: ");
	diasVividos = userEscreva.nextInt();


	anos = (diasVividos/365);
	meses = (diasVividos%365)/30;
	anosEmDias = (diasVividos%365)%30;	
	
				System.out.println("Anos "+anos);
				System.out.println("Meses "+meses);
				System.out.println("Dias "+anosEmDias);
		}
		}

		
		
		


