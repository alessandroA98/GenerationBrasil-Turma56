package exercicio_entregar_aula4;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
		Scanner entrada = new Scanner(System.in);
		int saida, mult=0, cont=0;
		
		do {
			System.out.println("digite um n");
			saida = entrada.nextInt();
			if((saida > 0)&&(saida % 3)== 0) {
				mult += saida;
				cont ++;
			}
		}while(saida != 0);
		System.out.println("media dos numeros multiplicado por 3: "+(mult / cont));
	
	
	}

}
