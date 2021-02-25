
public class VariaveisPrint {
	public static void main(String[] args) {
	/*
	 * byte, short, char, int, long, float, double e boolean.
byte -> short -> char -> int -> long -> float -> double.
int -> long -> float -> double.
	 * */
		
		byte memoria =  2;			//inteiros de -127 a 128
		short pequeno = 10;			//inteiros de -32767 a 32768
		char sexoM ='M';			//codigo de caracteres(num�ricos) - 0 a 65535
		int numeroFilhos = 10;		//inteiros(aprox.-2.000.000 a +2.000.000)
		long numerosLongos = 10000l;//Inteiros muito grandes
		float nf = 100f;			//Ponto flutuante de simples precis�o
		double  dinheiroBanco = 10.20;//ponto flutuante de dupla precis�o
		boolean verdade = true;		//true or false

		System.out.println("byte: "+memoria);
		System.out.println("short: "+pequeno);
		System.out.println("int: "+numeroFilhos);
		System.out.println("long: "+numerosLongos);
		System.out.println("float: "+nf);
		System.out.println("double: "+dinheiroBanco);
		System.out.println("boolean: "+verdade);

		//COMANDOS DO PRINTF
		//System.out.printf("Voc� tem: %d anos vividos \n", idade);
		//System.out.printf("Seu salario � %.2f e sua idade %d", salario, idade);
		

		// %d numero inteiro
		// %f numero com virgula 
		// %.2f com duas casas 
		// %s textologo nome, etc
		
		
		/*
		 * 											OPERADORES 
		 * +	(SOMA)
		 * -	(SUBTRA��O)
		 * *	(MULTIPLICA��O)
		    /   (DIVIS�O)                                                           *
		%		(M�DULO)
		
												(OPERADORES DE IGUALDADE)
			==	(ATRIBUI VALOR DE ALGO A ALGUMA COISA)
		 * !=	(DIFERENTE DE)
		 * >	(MAIOR)
		 * <	(MENOR)
		 * <=	(MENOR E IGUAL A...)
		 * >=	(MAIOR E IGUAL A...)
		 * <>	(N�O � IGUAL)
		 * 
		 * 										OPERADORES DE INCREMENTOS
		 * 
		 * ++	(PR�-INCROMENTO)
		 * ++	(P�S-INCROMENTO)
		 * --	(PR�-DECREMENTO)
		 * --	(P�S-DECREMENTO)
		 * 
		 * 										OPERADORES LOGICOS
		 * ||	(OU)
		 * 
		 * &&	(E)
		 * !	(N�O)
		 * */
		
}
}
