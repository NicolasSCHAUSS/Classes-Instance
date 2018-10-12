package entity;

/**
 * @author nschauss
 *
 */
public class AdressePostale {

	public int numeroRue;
	public String nomRue;
	public int codePostale;
	public String ville;

		public AdressePostale(int num, String rue, int codeP, String ville)
		{
			this.numeroRue = num;
			this.nomRue = rue;
			this.codePostale = codeP;
			this.ville = ville;
		}	
		
		public void affiche()
		{
			System.out.println(this.toString());
		}
		
		@Override
		public String toString()
		{
			return "############ AdressePostale.toString() ############\n"+
								"Numero de rue : "+ this.numeroRue + "\n"+
								"Rue : "+ this.nomRue + "\n"+
								"Code postale : "+ this.codePostale + "\n"+
								"Ville : "+ this.ville + "\n";
		}
}
