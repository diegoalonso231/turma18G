programa
{
	inclua biblioteca Matematica
/*
3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/	
	funcao inicio()
	{
real n1
real n2
real n3
real n4


real m1
real m2
real m3
real m4

	escreva("Escreva 4 números: ")
	escreva("\nNumero 1: ")
	leia(n1)
	escreva("Numero 2: ")
	leia(n2)
	escreva("Numero 3: ")
	leia(n3)
	escreva("Numero 4: ")
	leia(n4)
	
	m1 = (Matematica.potencia(n1,2))
	m2 = (Matematica.potencia(n2,2))
	m3 = (Matematica.potencia(n3,2))
	m4 = (Matematica.potencia(n4,2))

	
	

	se(m3>= 1000)
	{
		escreva(m3)
	}
	senao escreva ("A soma dos 4 numeros ao quadrado é: ",m1+m2+m3+m4)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 700; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */