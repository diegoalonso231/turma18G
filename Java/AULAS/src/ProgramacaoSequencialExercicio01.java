import java.util.Scanner;
public class ProgramacaoSequencialExercicio01 {
		public static void main(String[] args) {
/*
 * . Faça um sistema que leia a idade de uma pessoa expressa em 
 * anos, meses e dias e mostre-a expressa apenas em dias. */
			
		Scanner userEscreva = new Scanner(System.in); 
			
		int idade;
		int anos;
		int meses;
		int dias;
		System.out.println("Escreva o ano de hoje: ");
		System.out.println("Escreva o mês de hoje: ");
		System.out.println("Escreva o dia de hoje: ");
		int anoAtual = userEscreva.nextInt();
		int mesesAtual = userEscreva.nextInt();
		int diasAtual  = userEscreva.nextInt();
		
	//	System.out.flush();
/*		
 * ERRO PRECISO LIMPAR A TELA...
 * 
 * public void limpaTela(){
			for(int i = 0; i <= 20; i++){

			              System.out.println();
			}}
	*/
		System.out.printf("Primeiro escreva o ano de nascimento(Numericamente): \nSegundo escreva o mês de nascimento(Numericamente): \nTerceiro escreva o dia de nascimento(Numericamente): \n");
		anos = userEscreva.nextInt();
		meses = userEscreva.nextInt();
		dias = userEscreva.nextInt();
		idade = anoAtual - anos;
		meses = mesesAtual - meses;
		dias = diasAtual - dias;
		
		System.out.print("Você tem: "+((idade*365)+(meses*30)+(dias)));
		System.out.print(" dias vividos");
}
}
