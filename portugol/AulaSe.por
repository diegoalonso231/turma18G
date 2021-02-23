programa
{
	
	funcao inicio()
	{
	cadeia nome
	inteiro nota
	caracter sexo

	escreva("Digite o nome do Aluno(A) ")
	leia(nome)
	escreva("Digite o sexo M/F/O: ")
	leia(sexo)
	escreva("Qual o nota de 1-10 :")
	leia(nota)
//processamento
//estrutura condicional

	se (nota > 5)
	{
		se(sexo =='M')		
		{
			escreva("Oi, ",nome,"Você está aprovado")
		}
	
		senao se(sexo =='F')
		{
			escreva("Oi, ",nome,"Você está aprovada")
		}
		senao se (sexo == 'O')
		{
			escreva("Oi, ",nome,"Você está aprovado(A)")
		}
	}
	
	senao se(nota <=5)
	{
		escreva("Oi, ",nome,"Você está reprovada")
	}

		se(sexo =='M')		
		{
			escreva("Oi, ",nome,"Você está reprovado")
		}
	
		senao se(sexo =='F')
		{
			escreva("Oi, ",nome,"Você está reprovada")
		}
		senao se (sexo == 'O')
		{
			escreva("Oi, ",nome,"Você está reprovada(o)")
		}

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 767; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */