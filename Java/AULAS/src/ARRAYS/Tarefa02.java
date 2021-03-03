package ARRAYS;

import java.util.Scanner;

public class Tarefa02 {
public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int lancamentos[]= new int[10];	
	double	mediaAritmetica=0;
	int maiorPontuacao;
	for(int x=0; x<lancamentos.length;x++)
	{
		System.out.printf("Digite o resultado do lançamento %dº :",(x+1));
		lancamentos[x] = leia.nextInt();
	}
	for(int x=0;x<lancamentos.length;x++)
	{
		System.out.printf("O valor do lançamento %d é %d",(x+1), lancamentos[x]);
	}

}
}
