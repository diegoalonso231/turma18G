package EXEMPLOSSE;
import java.util.Scanner;
/*
Fa�a um programa que receba a idade de uma pessoa 
e mostre na sa�da em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
  */
public class Exercicio03 {
public static void main(String[] args) {
	Scanner userEscreva = new Scanner(System.in);
	int idade = 0;
	System.out.println("Quantos anos anos voc� tem? ");
	idade = userEscreva.nextInt();
	userEscreva.close();
	 // ||	(OU)
	 // &&	(E)
	if(idade>=10)
	{
		if(idade<14) 
		{
			System.out.println("Voc� � da turma infantil");
		}
			else if(idade<=17) 
			{
				System.out.println("Voc� � da turma juvenil");
			}
			else if(idade<=25) 
			{
				System.out.println("Voc� � da turma de adultos");
				
			}
	
			else
			{
				System.out.println("Voce est� velho para isso!!");
			}
		
	}
	
	else if(idade<10)
	{
		System.out.println("Voc� � uma crian�a,n�o deveria estar aqui!!");
	}

	

}
}
