package br.com.zup.Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Ator extends Pessoa {

	//Atributos
	private List<String> filmesParticipados = new ArrayList<String> ();
	private boolean temOscar;
	private int anoNascimento;
	private String melhorFilme;
	
	//Construtor
	public Ator (String nome, String sobrenome, int idade,List<String> filmesParticipados, boolean temOscar, int anoNascimento) 
	{
		super (nome, sobrenome, idade);
		this.filmesParticipados = filmesParticipados;
		this.temOscar = temOscar;
		this.anoNascimento = anoNascimento;
	
	}
	
	//get e sets

	public List<String> getFilmesParticipados() {
		return filmesParticipados;
	}

	public void setFilmesParticipados(List<String> filmesParticipados) {
		this.filmesParticipados = filmesParticipados;
	}

	public boolean isTemOscar() {
		return temOscar;
	}

	public void setTemOscar(boolean temOscar) {
		this.temOscar = temOscar;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getMelhorFilme() {
		return melhorFilme;
	}

	public void setMelhorFilme(String melhorFilme) {
		this.melhorFilme = melhorFilme;
	}
	
    //Método toString
	public String toString() {
		String modelo = "";
		
		modelo += "Filmes participados -> " + this.getFilmesParticipados() + "\n";
		modelo += "Tem oscar? -> " + this.isTemOscar() + "\n";
		modelo += "Ano de nascimento -> " + this.getAnoNascimento() + "\n";
		modelo += "Melhor filme -> " + this.getMelhorFilme() + "\n";
		modelo += "Nome -> " + super.getNome() + "\n";
		modelo += "Sobrenome -> " + super.getSobrenome() + "\n";
		modelo += "idade - > " + super.getIdade() + "\n";
		
		
		return modelo;
		
	}
	
	public String sorteioFilme(int numero , List<String> filmesParticipados) {
		
		String filme = filmesParticipados.get(numero);
		
		return filme;
	}
	
}
