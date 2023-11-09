package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Achat;
import model.Adresse;
import model.Boutique;
import model.Client;
import model.Console;
import model.Hybride;
import model.Jeu;
import model.Portable;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Hybride Switch=new Hybride("Switch",250.0,LocalDate.now());
		Portable DS=new Portable("Nintendo DS",100.0,"2012-06-07");
		
		Jeu Nintendogs=new Jeu("Nintendogs",DS);
		Jeu HL=new Jeu("Hogwarts Legacy",Switch);
		Jeu Mario=new Jeu("Mario Kart 8 Deluxe",Switch);
		Jeu PL = new Jeu ("Professeur Layton et l'étrange village",DS);
		Jeu FIFA=new Jeu ("EA Sports FC 24", Switch);
		
		Adresse adresseBoutique = new Adresse("50", "rue fictive", "Paris");
		Boutique boutique = new Boutique("Pokeshop", adresseBoutique);
		
		Nintendogs.setBoutique(boutique);
		HL.setBoutique(boutique);
		Mario.setBoutique(boutique);
		PL.setBoutique(boutique);
		FIFA.setBoutique(boutique);
		
		Achat a1=new Achat(PL, LocalDate.parse("2023-09-06"),30.0);
		Achat a2=new Achat(FIFA,LocalDate.now(),40.0);
		
		List<Achat> listAchat=new ArrayList();
		listAchat.add(a1);
		listAchat.add(a2);
		List<Achat> listAchat2=new ArrayList();
		listAchat2.add(a2);
		Client client1 = new Client("Pika", "Chu",listAchat);
		Client client2 = new Client("Ma", "Rio",listAchat2);
		
		
		
	}

}
