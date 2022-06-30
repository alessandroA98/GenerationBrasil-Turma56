programa {

    funcao inicio() {
        inteiro anos, meses, dias, atualMes

        escreva("Insira qual ano voce nasceu: ")
        leia(anos)
        escreva("Quantos meses: ")
        leia(meses)
        escreva("Quantos dias: ")
        leia(dias)
        anos = 2022 - anos
        escreva(anos)

        dias = (anos * 365) + (meses * 30) + dias + (anos / 4)

        escreva("dias de vida: " + dias )

    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 419; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */