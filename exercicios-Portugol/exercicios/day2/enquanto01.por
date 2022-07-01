programa
{
	
	funcao inicio()
	{
		//1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
//apresente no final o total do somatório, a média e o total de valores lidos. O programa
//deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
//positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
//negativo.
inteiro totalLido =0, x
real media, totalsomatorio=0

escreva(" digite um valor: ")
leia(x)

enquanto (x > 0){
	totalLido += 1
	totalsomatorio += x
escreva(" digite um valor: ")
leia(x)
	
}
escreva("\ntotal somados: ", totalsomatorio)
media = totalsomatorio / totalLido
escreva("\nmedia: ", media)
escreva("\ntotal lido: ", totalLido)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 33; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */