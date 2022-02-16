
public class Courant
{
	protected String nom, prenom; 
	protected int numero; 
	protected float solde; 
	protected static String devise ; 
	
	public Courant () {
		this.nom = this.prenom = ""; 
		this.numero =0; 
		this.solde= 0; 
		Courant.devise = " euros "; 
	}
	
	public Courant (String nom, String prenom, int numero)
	{
		this.nom = nom ; 
		this.prenom = prenom; 
		this.numero = numero; 
		this.solde= 0; 
		Courant.devise = " euros "; 
	}
	public void ouvrir () {
		System.out.println("Donner le nom : ");
		this.nom = Console.saisirString(); 
		System.out.println("Donner le prénom : ");
		this.prenom = Console.saisirString(); 
		System.out.println("Donner le numero : ");
		this.numero = Console.saisirInt(); 
	}
	public void consulter () {
		System.out.println("Le nom est    :" + this.nom);
		System.out.println("Le prénom est :" + this.prenom);
		System.out.println("Le numero est :" + this.numero);
		System.out.println("Le solde est :"+this.solde+Courant.devise);	
	}
	public void deposer () {
		float somme; 
		System.out.println("Donner la somme à déposer :");
		somme = Console.saisirFloat(); 
		this.solde += somme; 
		System.out.println("New solde : "+this.solde+Courant.devise);	
	}
	public void deposer(float somme)
	{
		this.solde += somme; 
		System.out.println("New solde : "+this.solde+Courant.devise);
	}
	public void retirer ()
	{
		float somme; 
		System.out.println("Donner la somme à retirer :");
		somme = Console.saisirFloat(); 
		if (this.solde >= somme) {
			this.solde -= somme; 
			System.out.println("New solde : "+this.solde+Courant.devise);
		}else {
			System.out.println("Opération impossible");
		}
	}
	
	public void retirer (float somme)
	{
		if (this.solde >= somme) {
			this.solde -= somme; 
			System.out.println("New solde : "+this.solde+Courant.devise);
		}else {
			System.out.println("Opération impossible");
		}
	}
	public void menu () {
		int choix =0; 
		do {
			System.out.println("_____ MENU COMPTE COURANT ____");
			System.out.println("1- Ouvrir le compte ");
			System.out.println("2- Consulter le compte "); 
			System.out.println("3- Déposer une somme ");
			System.out.println("4- Retirer une somme "); 
			System.out.println("0- Quitter "); 
			System.out.println("Votre choix :"); 
			choix = Console.saisirInt(); 
			switch (choix)
			{
			case 1 : this.ouvrir();break;
			case 2 : this.consulter();break;
			case 3 : this.deposer();break;
			case 4 : this.retirer();break;
			}
					
		}while (choix !=0);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public static String getDevise() {
		return devise;
	}

	public static void setDevise(String devise) {
		Courant.devise = devise;
	}
	
}





