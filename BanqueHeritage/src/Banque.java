import java.util.ArrayList;

public class Banque {
	private ArrayList<Courant> lesComptes ; 
	
	public Banque () {
		this.lesComptes = new ArrayList<Courant>(); 
	}
	
	public void ouvrirCompte ()
	{
		int choix = 0; 
		do {
			System.out.println("____ Ouverture de Compte____");
			System.out.println("1- Compte Courant ");
			System.out.println("2- Compte Epargne");
			System.out.println("0- Quitter");
			System.out.println("Votre choix :");
			choix = Console.saisirInt(); 
			switch (choix)
			{
			case 1 : {
						Courant unCompte = new Courant(); 
						unCompte.ouvrir();
						this.lesComptes.add(unCompte); 
					 } break;
			case 2 : {
						Epargne unEpargne= new Epargne(); 
						unEpargne.ouvrir();
						this.lesComptes.add(unEpargne);
					 } break;
			}
		}while (choix !=0);
	}
	public void listerComptes () {
		System.out.println("_____ Liste des Comptes _____");
		for (Courant unCompte : this.lesComptes)
		{
			if (unCompte instanceof Epargne)
			{
				System.out.println("____ Compte Epargne_____");
			}else 
			{
				System.out.println("____ Compte Courant ____");
			}
			unCompte.consulter();
		}
	}
	public void menu ()
	{
		int choix =0; 
		do {
			System.out.println("_______ MENU BANQUE _______");
			System.out.println("1- Ouvrir un compte ");
			System.out.println("2- Lister tous les comptes ");
			System.out.println("3- Total comptes Epargnes");
			System.out.println("4- Fermer un compte ");
			System.out.println("5- Gérer un compte");
			System.out.println("0- Quitter");
			System.out.println("Votre choix :");
			choix = Console.saisirInt(); 
			switch (choix)
			{
			case 1 : this.ouvrirCompte();break;
			case 2 : this.listerComptes();break;
			case 3 : System.out.println("Total comptes epargnes : "
					+ this.totalEpargnes()+ Courant.getDevise());
					break;
			case 4 : this.fermerCompte();break;
			case 5 : this.gererCompte();break;
			}
		}while (choix !=0);
	}
	
	public void fermerCompte ()
	{
		//demande un numéro de compte et le recherche, s'il est 
		//present, il sera supprimer de l'ArrayList 
		int numero ;
		System.out.println("Donnez le numero du compte :");
		numero = Console.saisirInt();
		for (Courant unCompte : this.lesComptes)
		{
			if (unCompte.getNumero() == numero)
			{
				this.lesComptes.remove(unCompte); 
				System.out.println("Compte supprime");
				break;
			}
		}
	}
	public void gererCompte ()
	{
		//demande un numéro de compte et le recherche, s'il est
		//present, on appelle le menu de gestion du compte
		int numero ;
		System.out.println("Donnez le numero du compte :");
		numero = Console.saisirInt();
		for (Courant unCompte : this.lesComptes)
		{
			if (unCompte.getNumero() == numero)
			{
				unCompte.menu();  //gestion du compte
				break;
			}
		}
	}
	public float totalEpargnes ()
	{
		//cumule tous les soldes des comptes epargnes et retourne 
		//le total. 
		float total = 0; 
		for (Courant unCompte : this.lesComptes)
		{
			if (unCompte instanceof Epargne)
			{
				total += unCompte.getSolde(); 
			}
		}
		return total ;
	}
	
	
	public static void main(String[] args) {
		Banque uneBanque = new Banque(); 
		uneBanque.menu();
	}

}






