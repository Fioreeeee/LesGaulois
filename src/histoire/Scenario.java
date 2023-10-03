package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 25);
		Druide panoramix = new Druide("Panoramix",5,10);
		Romain minus = new Romain("Minus", 6);
		
		panoramix.parler("Je vais aller me preaprer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("par Belenos, ce n'est pas juste");
		asterix.boirePotion(6);
		
		asterix.parler("Bonjour");
		minus.parler("UN GAU GAU.... UN GAULOIS");
		
		asterix.frapper(minus);

	}

}
