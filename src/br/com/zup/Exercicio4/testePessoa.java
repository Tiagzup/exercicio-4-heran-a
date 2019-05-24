package br.com.zup.Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class testePessoa {

	public static void main(String[] args) {
		List<String> array = new ArrayList<String>();
		
		array.add("Java");
		array.add("C++");
		array.add("Phyton");
		
		Programador programador = new Programador ("JOe", "Brown",  26, array, 10, true );
		System.out.println(programador);
		
		
		List<String> filmes = new ArrayList<String>();
		
		
		filmes.add("Colombiana");
	    filmes.add("Guardiões da Galálxia");
		filmes.add("Vingadores Ultimato");

	
		
		Ator atriz = new Ator ("Zoe", "Saldana", 40, filmes, true, 1978, "Vingadores Ultimato" );
		System.out.println(atriz);
		
	}

}
