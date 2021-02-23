programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
//exercicio 6

	real d
	real x1
	real x2
	real y1
	real y2

	escreva("Digite o valor de x1: ")
	leia (x1)
	escreva("Digite o valor de x2: ")
	leia (x2)
	escreva("Digite o valor de y1: ")
	leia (y1)
	escreva("Digite o valor de y2: ")
	leia (y2)


	d = Matematica.raiz((Matematica.potencia((x2-x1), 2) + Matematica.potencia((y2-y1), 2)),2)


	//processamento
	/*
	p2 = (x2-x1)
	p1 = (y2-y1)
	p2 = Matematica.potencia(p1, 2)
	d = Matematica.raiz((p1+p2),2)
	*/
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 311; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */