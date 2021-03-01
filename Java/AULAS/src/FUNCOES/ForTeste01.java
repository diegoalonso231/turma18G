package FUNCOES;
//while que quando escrevo Exit ele saia, mesmo antes de completar
import java.util.Scanner;

public class ForTeste01 {
public static void main(String[] args) {
	
	int a=0,b=0,c,d,e,f,g;
	int sair = 123;
	int comando = -1;
	Scanner ler = new Scanner(System.in);	
	do // limite 100
	{
			System.out.println("Insira um numero ");
			a = ler.nextInt();
			b = b + a;
			System.out.println(b);
			if(b<100)
			{
				System.out.println("Deseja sair digite 123: ");
				comando = ler.nextInt();
			}
	}
	while(b<100&&comando != sair);
	System.out.println("Fechou!!!!");
}
}