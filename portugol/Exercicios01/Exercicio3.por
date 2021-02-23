programa
{
	
	funcao inicio()
	{
 	//exercicio 3
	inteiro segundos = 0 //= 1
	inteiro minutos = 0 //= 60
	inteiro horas = 0 //= 3600
	inteiro tempoDuracao

	escreva("Digite o tempo de duração em segundos ")
	leia(tempoDuracao)
	
	horas = tempoDuracao / 3600
	minutos = (tempoDuracao % 3600) / 60
	segundos = (tempoDuracao % 3600) % 60

	escreva("Hora[s]: ", horas)
	escreva("\nMinutos[s]: ",minutos)
	escreva("\nSegundo[s]: ",segundos)


	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 451; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */