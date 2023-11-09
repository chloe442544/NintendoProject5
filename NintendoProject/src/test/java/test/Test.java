package test;

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
	}

}
