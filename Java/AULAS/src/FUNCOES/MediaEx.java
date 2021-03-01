package FUNCOES;
import java.util.Scanner;
/*
Programa de notas e menor e maior nota
//Não consegui imprimir a menor nota!;C
  */
public class MediaEx {
public static void main(String[] args) {
	Scanner userEscreva = new Scanner(System.in);
	String aluno;
	int nota=0,maiorNota=0,menorNota=10,
	numeroAlunos=0,notaP=0,notaM=0,notaC=0;
	//nota = (notaP+notaM+notaC)/3;
	System.out.println("Quantos alunos deseja pesquisa? ");
	numeroAlunos = userEscreva.nextInt();
	for(int i = 0; i<numeroAlunos;i++)
	{
		System.out.println("Insira o nome do aluno: ");
		aluno = userEscreva.next();
		System.out.println("Nota Portugues: ");
		notaP = userEscreva.nextInt();
		System.out.println("Nota Matematica: ");
		notaM = userEscreva.nextInt();
		System.out.println("Nota Ciencias: ");
		notaC = userEscreva.nextInt();
		nota = (notaP+notaM+notaC)/3;
		System.out.println("Aluno: "+aluno+"\nNota: "+nota);
		if(nota>=maiorNota)
		{
			maiorNota = nota;		
		
		}
		else if (nota<=menorNota)
		{
			menorNota = nota;
			
		}
		
	}
	System.out.println("A maior nota é de: "+maiorNota);
	System.out.println("A menor nota é de: "+menorNota);
	
}
}
