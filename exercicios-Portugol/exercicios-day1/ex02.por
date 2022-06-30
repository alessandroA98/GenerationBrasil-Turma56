programa {
	funcao inicio() {
		inteiro anos, meses, dia, dias

        escreva(" Quantos dias de vida voce tem: ")
        leia(dias)
        
        
     
        anos = dias / 365
        meses = (anos % 365) / 12
        dia = meses % 12
        
        escreva("\n anos ",anos)
        escreva("\n meses", meses )
        escreva("\n dias", dia)
	}
}
