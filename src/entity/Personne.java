package entity;

/**
 * @author nschauss
 *
 */
public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	public Personne(String nom, String prenom, AdressePostale adresse)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	@Override
	public String toString()
	{
		return "############ Personne.ToString() ############\n"+
				"Nom : "+ this.nom + "\n"+
				"Prenom : "+ this.prenom + "\n"+
				"Adresse : "+ this.adresse;
	}
}
