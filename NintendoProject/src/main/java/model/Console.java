package model;

import java.time.LocalDate;

public class Console {

	private String nom;
	private double prix;
	private LocalDate dateSortie;

	public Console(String nom, double prix, String dateSortie) {
		this.nom = nom;
		this.prix = prix;
		this.dateSortie = LocalDate.parse(dateSortie);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

	public double getPrix() {
		return prix;
	}

	public LocalDate getDateSortie() {
		return dateSortie;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public void setDateSortie(LocalDate dateSortie) {
		this.dateSortie = dateSortie;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + ", prix=" + prix + ", dateSortie=" + dateSortie + "]";
	}

	
	
}
