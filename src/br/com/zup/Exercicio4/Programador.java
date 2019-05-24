package br.com.zup.Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Programador extends Pessoa {

	 //Atributos
	private List<String> linguagensUsadas = new ArrayList<String>();
	private int anosExperiencia;
	private boolean gostaDeCafe;
	
	// Construtor
	public Programador (String Nome, String Sobrenome, int idade, List<String> linguagensUsadas, int experiencia, boolean gostaDeCafe) {
		super (Nome, Sobrenome, idade);
		 
		this.gostaDeCafe = gostaDeCafe;
		this.anosExperiencia = experiencia;
		this.linguagensUsadas = linguagensUsadas;
	}
	// Get e Sets

	public List<String> getLinguagensUsadas() {
		return linguagensUsadas;
	}

	public void setLinguagensUsadas(List<String> linguagensUsadas) {
		this.linguagensUsadas = linguagensUsadas;
	}

	public int getAnosExperiencia() {
		return anosExperiencia;
	}

	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}

	public boolean isGostaDeCafe() {
		return gostaDeCafe;
	}

	public void setGostaDeCafe(boolean gostaDeCafe) {
		this.gostaDeCafe = gostaDeCafe;
	}
	
	public String toString() {
		String modelo = "";
		modelo += "Linguagens Usadas -> " + this.getLinguagensUsadas() + "\n";
		modelo += "Anos de experiência -> " + this.getAnosExperiencia() + "\n";
		modelo += "Gostade café? -> " + this.isGostaDeCafe()+ "\n";
		modelo += "Nome -> " + super.getNome()+ "\n";
		modelo += "Sobrenome -> " + super.getSobrenome() + "\n";
		modelo += "Idade -> " + super.getIdade() + "\n";
		return modelo;
	}
	
}

