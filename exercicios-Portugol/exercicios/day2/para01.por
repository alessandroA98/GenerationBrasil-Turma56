programa
{
	
	funcao inicio()
	{
		inteiro hab=2, filhos, x
		real sal=0.0, mediaSal=0.0, mediaFilhos = 0.0, maiorSal=0, m100=0

//1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
//coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
//a) média do salário da população;
//b) média do número de filhos;
//c) maior salário;
//d) percentual de pessoas com salário até R$100,00.

	para(x = 1;x<=hab;x++){
		escreva("salario: ")
		leia(sal)
		mediaSal += sal
		se( sal > maiorSal){
			maiorSal = sal
		}
		se(sal <= 100){
			m100 += 1
		}

		escreva("filhos: ")
		leia(filhos)
		mediaFilhos += filhos
		}
		m100 = (100/hab) * m100
		mediaSal = mediaSal / hab
			escreva("mediaSal: ", mediaSal)//feito
	mediaFilhos = mediaFilhos / hab
	escreva("\n media filhos: ", mediaFilhos)//feito
	escreva("\n maior salario: ", maiorSal)//feito
	escreva("\n salarios até 100RS percentual: ", m100)
		
		
	}
	

	

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 676; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */