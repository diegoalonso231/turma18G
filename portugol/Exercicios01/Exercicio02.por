programa
{
	

	/*
	3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em 
	segundos e mostre-o expresso em horas, minutos e segundos. 
*/
	funcao inicio()
	{
inteiro tempo = 0
inteiro segundos = 1
const inteiro minuto = 60
const inteiro hora = 3600

	escreva("Tempo de segundos é = ")
	leia(tempo) //100
//100/60 = 40segundos

	escreva("\nSeu tempo em horas é igual a : ",(tempo/hora))
	escreva("\nSeu tempo em minutos é igual a: ",(tempo%hora)/minuto)
	escreva("\nSeu tempo em segundos igual a: ",(tempo%minuto))                 


	
	
	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 562; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */