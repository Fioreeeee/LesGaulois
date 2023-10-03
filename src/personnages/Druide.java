package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		this.forcePotion = forcePotion;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");

	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void preparerPotion() {
		Random random = new Random();
		int force = random.nextInt(effetPotionMax);
		
		while(force<effetPotionMin)
		{
			force = random.nextInt(effetPotionMax);
		}

		
		if (force > 7) {
	        System.out.println("J'ai préparé une super potion de force " + force);
	    } 
		else { 
	        System.out.println("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + force);
		}
	}
	
	public void booster(Gaulois gaulois) {
			
			if( gaulois.getNom().equals("Obélix")) {
				System.out.println("Non, Obélix !... Tu n'auras pas de potion magique !");
			}
			else {
				gaulois.boirePotion(forcePotion);
			}
			
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
	}
}