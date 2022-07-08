package exerciciosaula03;

import java.util.Scanner;

public class e01 {

	public static void main(String[] args) {
		// 1- Faça um programa que receba três 
		//inteiros e diga qual deles é o maior.
		Scanner entrada = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("digite 1 n: ");
		n1 = entrada.nextInt();
		System.out.println("digite 1 n: ");
		n2 = entrada.nextInt();
		System.out.println("digite 1 n: ");
		n3 = entrada.nextInt();
		
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("n1 maior: "+n1);
		}else if (n2 > n3) {
			System.out.println("n2 maior: "+n2);	
		}else {
			System.out.println("n3 maior: " + n3);
		}
			
		
		

	}

	private static int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
