import java.util.Scanner;

public class ProgramacaoSequencialExercicio03 {
public static void main(String[] args) {
	
	
	/*
	 * /*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e 
 segundos.*/

		int entrada, horas , minutos , segundos;
		Scanner userEscreva = new Scanner(System.in);
		 
		System.out.println("Digite o tempo da festa em segundos! ");
		entrada = userEscreva.nextInt();
		
		horas = entrada / 3600;
		minutos = (entrada % 3600)/60 ;
		segundos = (entrada % 3600)% 60 ;
		
		System.out.printf("O total de horas do tempo da du��o do evento � : %d horas, %d minutos e %d segundos",horas , minutos , segundos);
		
	}

}

