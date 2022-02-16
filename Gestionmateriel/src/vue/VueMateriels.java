package vue;

import controleur.Materiels;
import controleur.Professeurs;


public class VueMateriels {
	public static Materiels saisirMateriels ()
	{
		Materiels unMateriel = null; 
		System.out.println("Donner la designation : ");
		String designation = Console.saisirString(); 
		System.out.println("saisissez la date d'achat: ");
		String DateAchat = Console.saisirString();
		System.out.println("Donner l'Etat du materiel  : ");
		String Etat = Console.saisirString();
		
		
		unMateriel = new Materiels(designation, DateAchat, Etat);
		return unMateriel;
	}
	
	public static void afficherMateriels (Materiels unMateriel)
	{
		System.out.println("________ Affichage des Materiels ______");
		System.out.println("designation  : " + unMateriel.getDesignation()); 
		System.out.println("Date d'achat    : " + unMateriel.getDateAchat()); 
		System.out.println("Etat      : " + unMateriel.getEtat()); 
	
		System.out.println("_______________________________"); 
	}
	
	public static int saisirId()//suppression et  Saisie de l'id
	{
		System.out.println("--------------------------------------------");
		System.out.println("---------- SUPPRESSION D'UN Materiel ----------");
		System.out.println("--------------------------------------------");
		System.out.println("Donner l'id du Materiel :");
		return Console.saisirInt(); 
	}

	
	public static Materiels modifierMateriels (Materiels unMateriel) {// modification des Materiels
		System.out.println("----------------------------------------");
		System.out.println("---------- EDITION D'UN Materiel ----------");
		System.out.println("----------------------------------------");
		System.out.println("Ancien designation du materiel: " + unMateriel.getDesignation());
		System.out.println("Donner la nouvelle designation du materiel : ");
		unMateriel.setDesignation(Console.saisirString());
		System.out.println("Ancienne Date d'achat du materiel : " + unMateriel.getDateAchat());
		System.out.println("Donner la nouvelle Date d'achat du materiel  : ");
		unMateriel.setDateAchat(Console.saisirString());
		System.out.println("Ancien Etat du Materiel: " + unMateriel.getEtat());
		System.out.println("Donner le  nouveau Etat du Materiel : ");
		unMateriel.setEtat(Console.saisirString());
		return unMateriel;
	}
	
	
	
	
	
}
