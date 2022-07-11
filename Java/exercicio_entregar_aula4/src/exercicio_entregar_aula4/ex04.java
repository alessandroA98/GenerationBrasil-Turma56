package exercicio_entregar_aula4;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Uma empresa desenvolveu uma pesquisa para saber as características
//		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
	//	era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
//		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
	//	agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		//pessoas, calcule e mostre: (WHILE)
//		 o número de pessoas calmas;
	//	 o número de mulheres nervosas;
		// o número de homens agressivos;
//		 o número de outros calmos;
	//	 o número de pessoas nervosas com mais de 40 anos;
		// o número de pessoas calmas com menos de 18 anos.
		Scanner entrada = new Scanner(System.in);
		int idade=0, sexo, personalidade=0, maiores=0, menores=0, calma=0, i=1, homemAgressivo=0, mulherNervosa=0, outrosCalmo=0;
		
		while(idade != -1) {
			System.out.println("Pessoa:"+i++);
			System.out.println("idade: ");
			idade = entrada.nextInt();
			System.out.println("Sexo: 1-feminino / 2- masculino / 3- Outros: ");
			sexo = entrada.nextInt();
			System.out.println("Voce é \n1: calma \n2: nervosa \n3: agressiva");
			personalidade = entrada.nextInt();
			
			
			if((idade < 18) && (personalidade == 1)) {
				menores += 1;
			}else if ((idade > 40) && (personalidade == 2)) {
				maiores += 1;
			}
			
			if (personalidade == 1) {
				if(sexo == 3) {
					outrosCalmo++;
				}
				calma += 1;
			}else if(personalidade == 2) {
				if(sexo == 1) {
					mulherNervosa+=1;;
				}
			}else if(personalidade == 3) {
				if(sexo == 2) {
					homemAgressivo +=1;
				}
			}
		}
		System.out.println("Pessoas Calmas: "+calma);
		System.out.println("Outros Calmas: "+outrosCalmo);
		System.out.println("Mulheres nervosas: "+mulherNervosa);
		System.out.println("Homens agressivos: "+homemAgressivo);
		System.out.println("Agressivos idade superior a 40: "+ maiores);
		System.out.println("calmos com idade inferior a 18: " + menores);
		
		
	}

}
