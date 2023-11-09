package model;

public class Client {

	String nom, prenom;
	
	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {return nom;}
	public String getPrenom() {return prenom;}

	public void setNom(String nom) {this.nom = nom;}
	public void setPrenom(String prenom) {this.prenom = prenom;}

	public String toString() {return "Client [nom=" + nom + ", prenom=" + prenom + "]";}
	
}
