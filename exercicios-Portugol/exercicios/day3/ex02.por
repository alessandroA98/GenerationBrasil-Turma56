programa
{
	
	funcao inicio()
	{
	//2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
//que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
//imprima a média aritmética dos lançamentos, contabilize e apresente também
//quantas foram as ocorrências da maior pontuação.

	inteiro vetor[10], cont = 0, media=0, maior = 0

	para(inteiro x = 0; x<10; x++){
		
	escreva("digite 10 numeros: ")
	leia(vetor[x])
	cont += vetor[x]
	se(vetor[x] > maior){
		maior = vetor[x]
	}
	media ++
	}
	media = cont / media

	para(inteiro x = 0; x<10;x++){
		escreva("\nnumero digitado: ", vetor[x])
	}
		escreva("\nmedia: ", media)
		escreva("\nsoma total: ", cont)
		escreva("\nmaior: ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 737; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */