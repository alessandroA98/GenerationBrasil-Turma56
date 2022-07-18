package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaCollection {

	public static void main(String[] args) {
		
		String aula1 = "D - Bloco I - Java Puro";
		String aula2 = "1 - C - Bloco II - SpringBoot";
		String aula3 = "A - Bloco III - FrontEnd";
		String aula4 = "B - Bloco IV - Java Mobile";
		
		ArrayList<String> listaAulas = new ArrayList<>();
		listaAulas.add(aula1);//[0]
		listaAulas.add(aula2);
		listaAulas.add(aula3);
		listaAulas.add(aula4);
		
		/*System.out.println(listaAulas);
		listaAulas.remove(2);
		
		System.out.println(listaAulas);*/
		
		//for --> each
		/*for(String i: listaAulas) {
			System.out.println(i);
		}
		*/
		/*String aula = listaAulas.get(1);
		
		System.out.println(aula);*/
		
		/*for(int i = 0; i < listaAulas.size(); i++) {
			System.out.println(i + " | " + listaAulas.get(i));
		}
		
		System.out.println("Tamanho da lista: " + listaAulas.size());*/
		
		Collections.sort(listaAulas); // --> organiza  a lista em ordem crescente 
		System.out.println(listaAulas);
		
		Collections.shuffle(listaAulas); // --> embaralha a lista
		System.out.println(listaAulas);
		
		
		
	}

}
