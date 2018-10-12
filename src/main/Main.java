/**
 * 
 */
package main;

import entity.AdressePostale;
import entity.Personne;

/**
 * @author nschauss
 *
 */
public class Main {

	/**
	 * Here, arguments are not used.
	 * @param args
	 */
	public static void main(String[] args) {
		
		AdressePostale trebes = new AdressePostale(6, "rue d'Alsace", 11800, "Trèbes");
		AdressePostale montpellier = new AdressePostale(294, "Avenue Maurice Begart", 34000, "Montpellier");
				
		Personne stagiaire = new Personne("SCHAUSS", "Nicolas", trebes);
		Personne formateur = new Personne("MAURICE", "Noël", montpellier);
		
		System.out.println(stagiaire);
		System.out.println(formateur);
	}

}
