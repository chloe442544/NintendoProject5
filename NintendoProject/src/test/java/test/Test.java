package test;

import model.Adresse;
import model.Boutique;
import model.Client;
import model.Console;
import model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console Switch=new Console("Switch");
		Console DS=new Console("Nintendo DS");
		
		Jeu Nintendogs=new Jeu("Nintendogs",DS);
		Jeu HL=new Jeu("Hogwarts Legacy",Switch);
		Jeu Mario=new Jeu("Mario Kart 8 Deluxe",Switch);
		Jeu PL = new Jeu ("Professeur Layton et l'étrange village",DS);
		Jeu FIFA=new Jeu ("EA Sports FC 24", Switch);
		
		Adresse adresseBoutique = new Adresse("50", "rue fictive", "Paris");
		Boutique boutique = new Boutique("Pokeshop", adresseBoutique);
		Client client1 = new Client("Pika", "Chu");
		Client client2 = new Client("Ma", "Rio");
	}

}
