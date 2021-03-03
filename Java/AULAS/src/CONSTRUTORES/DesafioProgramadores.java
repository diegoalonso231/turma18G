package CONSTRUTORES;
import java.util.Scanner;
public class DesafioProgramadores {
	/*RECEBE DADOS DE 3 TRIANGULOS
	MOSTRA A BASE, ALTURA E A AREA DE CADA TRIANGULO
	base x altura .2
	receber dados de 3 triangulos mostrar na tela a base altura e a area e falar qual triangulo tem mais area.
	*/
	public static void main(String[] args) {
		double base1,altura1,area1,base2,altura2,area2,base3,altura3,area3,maior=0;
		Scanner userEscreva = new Scanner(System.in);

		System.out.println("Digite a base,e altura Triangulo 1: ");
		base1 = userEscreva.nextDouble();
		altura1 = userEscreva.nextDouble();

		System.out.println("Digite a base,e altura Triangulo 2: ");
		base2 = userEscreva.nextDouble();
		altura2 = userEscreva.nextDouble();

		System.out.println("Digite a base,e altura Triangulo 3: ");
		base3 = userEscreva.nextDouble();
		altura3 = userEscreva.nextDouble();

		
		area1= (base1*altura1)*2;
		area2= (base2*altura2)*2;
		area3= (base3*altura3)*2;
	
		if(area1>area2 && area1>area3) 
		{
			maior = area1;
			System.out.println("A maior area é do triangulo1: "+maior);
		}
		if(area2>area1 && area2>area3)
		{
			maior = area2;
			System.out.println("A maior area é do triangulo2: "+maior);
		}
		if(area3>area1 && area3>area2)
		{
			maior = area3;
			System.out.println("A maior area é do triangulo3: "+maior);
		}
	}

}
