programa {
    inclua biblioteca Matematica-->m
	funcao inicio() {
		real x1 = 0
		real x2 = 0
		real y1 = 0
		real y2 = 0
		real d = 0
		
		escreva("\nP1 X: ")
        leia(x1)
        escreva("\nP1 Y: " )
        leia(y1)
        
		escreva("\nP2 X: ")
        leia(x2)
        escreva("\nP2 Y: ")
        leia(y2)
        
       
        
        d = m.raiz(m.potencia((x2 - x1), 2) + m.potencia((y2 - y1), 2), 2)
		
		escreva("\nResultado: ", d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 271; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */