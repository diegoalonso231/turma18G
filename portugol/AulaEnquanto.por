programa
{
	funcao inicio()
/*solicite o nome da pessoa (ok)
 * 
 o ano de nascimento da pessoa (apenas o ano) (ok)
 
mostre o nome,(ok)

e a idade aproximada da pessoa (ok)

pergunte, deseja continua (ok)
dependendo da resposta, continue ou pare o programa*/	
{
cadeia nome
inteiro anoDeNascimentoP
inteiro anoAtual = 2021
caracter parar = 'S'
	
	escreva("\n Ola gafanhoto ")
	escreva("\nEscreva seu nome: ")

	leia(nome)
	escreva("\nEscreva o ano de nascimento: ")
	leia(anoDeNascimentoP)
	
	escreva("\nSeu nome é: ",nome)
	escreva("\nVocê tem ",anoAtual-anoDeNascimentoP," anos")

 enquanto (parar == 'S' ou parar == 's'){
	
	escreva("\nDeseja continuar? [s/n]: ")
	leia(parar)
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 497; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */