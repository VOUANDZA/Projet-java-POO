package vue;


import controleur.Professeurs;

public class VueProfesseurs {
	public static Professeurs saisirProfesseurs () //Fonction(appelle la classe et fait la  Saisie des profs)
	{
		Professeurs unProfesseur = null; 
		System.out.println("Donner le nom du professeur : ");
		String Nom = Console.saisirString(); 
		System.out.println("Donner le Prénom du professeur : ");
		String Prenom = Console.saisirString();
		System.out.println("Donner l'adresse du professeur : ");
		String Adresse = Console.saisirString();
		System.out.println("Donner le diplome du professeur  : ");
		String Diplome = Console.saisirString();
		
		unProfesseur = new Professeurs(Nom, Prenom, Adresse,Diplome);
		return unProfesseur;
	}
	
	public static void afficherProfesseurs (Professeurs unProfesseur)//Fonction  Affichage professeurs
	{
		System.out.println("________ Information des professeurs ______");
		System.out.println("Nom   : " + unProfesseur.getNom()); 
		System.out.println("Prenom    : " + unProfesseur.getPrenom()); 
		System.out.println("Adresse       : " + unProfesseur.getAdresse()); 
		System.out.println("Diplome       : " + unProfesseur.getDiplome());
		System.out.println("_______________________________"); 
	}
	
	public static int saisirId()                    // suppression et  Saisie de l'id
	{
		System.out.println("--------------------------------------------");
		System.out.println("---------- SUPPRESSION D'UN Professeur ----------");
		System.out.println("--------------------------------------------");
		System.out.println("Donner l'id du Professeur :");
		return Console.saisirInt(); 
	}

	public static Professeurs modifierProfesseurs (Professeurs unProfesseur) {// modification des profs
		System.out.println("----------------------------------------");
		System.out.println("---------- EDITION D'UN Professeurs ----------");
		System.out.println("----------------------------------------");
		System.out.println("Ancien nom du professeur : " + unProfesseur.getNom());
		System.out.println("Donner le nouveau nom du professeur : ");
		unProfesseur.setNom(Console.saisirString());
		System.out.println("Ancien Prenom du professeur : " + unProfesseur.getPrenom());
		System.out.println("Donner le nouveau Prenom du Professeur de: ");
		unProfesseur.setPrenom(Console.saisirString());
		System.out.println("Ancienne Adresse du Professeur: " + unProfesseur.getAdresse());
		System.out.println("Donner la  nouvelle Adresse du Professeur : ");
		unProfesseur.setAdresse(Console.saisirString());
		System.out.println("Ancien Diplome du Professeur: " + unProfesseur.getDiplome());
		System.out.println("Donner le  nouveau diplome du Professeur : ");
		unProfesseur.setDiplome(Console.saisirString());
		
		
		
		return unProfesseur;
	}

	
	
	
}

