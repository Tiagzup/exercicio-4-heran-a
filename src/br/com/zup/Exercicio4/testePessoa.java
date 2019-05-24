package br.com.zup.Exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class testePessoa {

	public static void main(String[] args) {
		
		//Criando Lista
		List<String> linguagens = new ArrayList<String>();
		
		//Adicionando linguagens
		linguagens.add("Java");
		linguagens.add("C++");
		linguagens.add("Phyton");
		
		//Instanciar objeto
		Programador programador = new Programador ("JOe", "Brown",  26, linguagens, 10, true );
		System.out.println(programador);
		
		
		List<String> filmes = new ArrayList<String>();

		
		
		filmes.add("Colombiana");
	    filmes.add("Guardiões da Galálxia");
		filmes.add("Vingadores Ultimato");

	    Random random = new Random();
		
		Ator atriz = new Ator ("Zoe", "Saldana", 40, filmes, true, 1978);
	
		
		int numero = random.nextInt(atriz.getFilmesParticipados().size());
		
		atriz.setMelhorFilme(atriz.sorteioFilme(numero, atriz.getFilmesParticipados()));
		
		System.out.println(atriz);
		
	}

}
