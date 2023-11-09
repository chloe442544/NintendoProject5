package model;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String nom, prenom;
	private List<Achat> listAchat;
	
	public Client(String nom, String prenom,List<Achat> listAchat) {
		this.nom = nom;
		this.prenom = prenom;
		this.listAchat=listAchat;
	}

	
	public String getNom() {return nom;}
	public String getPrenom() {return prenom;}
	public List<Achat> getListAchat() {
		return listAchat;
	}


	public void setListAchat(List<Achat> listAchat) {
		this.listAchat = listAchat;
	}

	public void setNom(String nom) {this.nom = nom;}
	public void setPrenom(String prenom) {this.prenom = prenom;}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", listAchat=" + listAchat + "]";
	}
	
}
