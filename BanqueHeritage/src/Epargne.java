
public class Epargne extends Courant
{
	private float taux ; 
	
	public Epargne () {
		super ( ); 
		this.taux = 2; 
	}
	public Epargne (String nom, String prenom, int numero, float taux)
	{
		super (nom, prenom, numero); 
		this.taux = taux ;
	}
	//redéfinition de la méthode ouvrir 
	public void ouvrir () {
		//un appel de la méthode ouvrir héritée de Courant 
		super.ouvrir();
		System.out.println("Donner le taux : ");
		this.taux = Console.saisirFloat();
	}
	//redéfinition de la méthode consulter 
	public void consulter () {
		super.consulter();
		System.out.println("Taux d'épargne : " +this.taux);
	}
	
	//pas besoin de redéfinir : deposer //retirer 
	
	public void calculInterets ()
	{
		float interets ; 
		interets = (this.taux * this.solde) /100; 
		System.out.println("Les interets : " + interets);
		this.solde += interets ; 
		System.out.println("New Solde : "+this.solde+Courant.devise);
	}
	//on doit refaire le menu 
	public void menu () {
		int choix =0; 
		do {
			System.out.println("_____ MENU COMPTE Epargne ____");
			System.out.println("1- Ouvrir le compte ");
			System.out.println("2- Consulter le compte "); 
			System.out.println("3- Déposer une somme ");
			System.out.println("4- Retirer une somme ");
			System.out.println("5- Calcul Interets ");
			System.out.println("0- Quitter "); 
			System.out.println("Votre choix :"); 
			choix = Console.saisirInt(); 
			switch (choix)
			{
			case 1 : this.ouvrir();break;
			case 2 : this.consulter();break;
			case 3 : this.deposer();break;
			case 4 : this.retirer();break;
			case 5 : this.calculInterets();break;
			}
					
		}while (choix !=0);
	}
	public float getTaux() {
		return taux;
	}
	public void setTaux(float taux) {
		this.taux = taux;
	}
}










