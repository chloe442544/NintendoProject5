package model;

import java.util.List;

public class Jeu {

	private String titre;
	private Console console;
	protected Boutique boutique;
	
	public Jeu(String titre, Console console) {
		this.titre = titre;
		this.console = console;
		
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Console getConsole() {
		return console;
	}

	public void setConsole(Console console) {
		this.console = console;
	}

	public Boutique getBoutique() {
		return boutique;
	}

	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	}

	@Override
	public String toString() {
		return "Jeu [titre=" + titre + ", console=" + console + ", boutique=" + boutique + "]";
	}
	
	
	
	
}
