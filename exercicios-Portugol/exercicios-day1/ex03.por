programa {
    
	funcao inicio() {
		inteiro seg, hora, min 
		escreva("qual o tempo de duração em segundos: ")
		leia(seg)
		hora = seg/3600
		min = (seg % 3600) / 60
		seg = (min % 60) 
		
		escreva("\n hr ", hora)
		escreva("\n min ", min)
		escreva("\n seg ", seg)
		
	}
}
