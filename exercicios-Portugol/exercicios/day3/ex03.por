programa
{
	
	funcao inicio()
	{
		escreva("Olá Mundo")

	//	3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
//das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
//posição das matrizes N1 e N2.

inteiro n1[2], n2[2], m1[2], m2[2]
para(inteiro x=0; x<2;x++){
escreva("\n dois n1: ")
leia(n1[x])

escreva("\ndois n2: ")
leia(n2[x])

m1[x]= n1[x] + n2[x]
escreva("\n m1: ", m1[x])

m2[x]= n1[x]-n2[x]
escreva("\n m2: ", m2[x])
	
}




	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 252; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */