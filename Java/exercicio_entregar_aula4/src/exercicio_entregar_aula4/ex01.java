package exercicio_entregar_aula4;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1- Informar todos os números de 1000 a 1999 que quando divididos por 11
		//obtemos resto = 5. (FOR)
		int i;
		for( i = 1000; i < 2000; i++ ) {
			if((i % 11) == 5) {
				System.out.println("numero dividido por 11 e com resto de 5 " + i);
			}
			 
		}
		
		

	}

}
