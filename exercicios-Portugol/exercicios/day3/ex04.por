programa
{
	
	funcao inicio()
	{
//		4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
//em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
//diagonal, ou seja, diagonal principal.

	inteiro vetor[3][3], x=0, cont=0, diagonal=0

	para(x ; x<3;x++){
para(inteiro j=0;j<3;j++){
	escreva("n ",x+1," : ")
			leia(vetor[x][j])
}
escreva("\n")
	}
	para(x=0;x<3;x++){
		diagonal += vetor[x][x]
		para(inteiro j=0;j<3;j++){
			escreva(" n digitado: ",vetor[x][j])
		}
		escreva("\n")
	}
		escreva("\ndiagonal somada: ", diagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 579; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */