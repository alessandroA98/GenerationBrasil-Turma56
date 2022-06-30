
programa {
    inclua biblioteca Matematica-->m
	funcao inicio() {
	    
        inteiro a, b, c
        real d,r,s
        
        escreva("\nvalor de A: ", a)
        leia(a)
        escreva("\nvalor de B: ", b)
        leia(b)
        escreva("\nvalor de C: ", c)
        leia(c)
        

        
        r = (a + b)
        r = m.potencia(r,2)
        s = (b + c)
        s = m.potencia(s,2)
        
        d = (r + s) / 2
        
        escreva("Resultado: ", d)
        
	}
}
