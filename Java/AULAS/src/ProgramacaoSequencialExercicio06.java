
	import java.util.Scanner;

public class ProgramacaoSequencialExercicio06 {
public static void main(String[] args) {
	/*
	 * Construa um programa em c que, tendo como dados de entrada dois pontos
	quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula

	que efetua tal cálculo é:
	 */
	Scanner userEscreva = new Scanner(System.in); 

double D;
double x1;
double y1;
double x2;
double y2;

System.out.print("Digite o valor de X1: ");
x1 = userEscreva.nextDouble();
System.out.print("Digite o valor de Y1: ");
y1 = userEscreva.nextDouble();
System.out.print("Digite o valor de X2: ");
x2 = userEscreva.nextDouble();
System.out.print("Digite o valor de Y1: ");
y2 = userEscreva.nextDouble();

D = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1,2));

System.out.println("Distancia: " + Math.round(D));
}
}
