package exerciciosaula03;

import java.util.Scanner;

public class e02 {

	public static void main(String[] args) {
		/*2- Faça um programa que entre com três 
		números e coloque em ordem crescente.*/
		
		Scanner entrada = new Scanner(System.in);
		int n1, n2, n3, teste1, teste2, teste3, teste4;
	
		
		String frase;
System.out.println("Digite 3 numeros: ");
System.out.println("1");
n1= entrada.nextInt();
System.out.println("2");
n2= entrada.nextInt();
System.out.println("3");
n3= entrada.nextInt();


if(n1 > n2) {
	teste1 = n1;
	teste2 = n2;
}else {
	teste1 = n2;
	teste2 = n1;
}
if(n3>teste1) {
	teste4 = teste1;
	teste1 = n3;
	teste3 = teste2;
	teste2 = teste4;
}else {
	teste3=n3;
}
System.out.println("maior n: "+ teste1 + "\nsegundo maior n: "+teste2+"\nterceiro maior n: " + teste3 );



}
}
