programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		
inteiro contador = 10
cadeia login, senha

	//enquanto (contador>0){
	//	escreva(" contagem Regressiva... ", contador)
	//	contador --
	//	Util.aguarde(2000)
	//	limpa()
	//}
//escreva("Boommmm..")
	faca{ 
		escreva ("digite seu login: ")
		leia(login)
		escreva("digite sua senha com letras e numeros: ")
		leia(senha)
		se(login == " " ou login == ""){
		escreva ("Digite algum login valido(nao pode ficar vazio): ")
		leia(login)	
		}
		se(senha == "" ou senha == " "){
		escreva("Digite alguma senha valida: ")
		leia(senha)

		escreva("campo nao pode ficar vazio e nao tente burlar as regras")
		}
	}
enquanto(login != "Melissa" ou senha != "1234a")
escreva("bem vindo ")



	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 666; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */