package controleur;

import java.util.ArrayList;

import modele.Modele;
import vue.Console;
import vue.VueMateriels;


public class C_Materiels {
	
	public static void insertMateriels () {
		Materiels unMateriel = VueMateriels.saisirMateriels();
		Modele.insertMateriels(unMateriel);
	}
	
	public static void afficherLesMateriels () {
		ArrayList<Materiels> lesMateriels = Modele.selectAllMateriels();
		System.out.println("__________ LISTE DES AVIONS __________");
		for (Materiels unMateriel : lesMateriels) {
			VueMateriels.afficherMateriels(unMateriel);
		}
	}
	
	public static void deleteMateriels () {
		int idm = VueMateriels.saisirId();
		Modele.deleteMateriels(idm);
	}
	
	public static void modifierMateriels () {
		int idm = VueMateriels.saisirId();
		Materiels unMateriel = Modele.selectWhereMateriels(idm);
		if (unMateriel!= null) {
			VueMateriels.modifierMateriels(unMateriel);
			Modele.updateMateriels(unMateriel);
		}
	}
	
	public static void count () {
		int nb;
		nb = Modele.countMateriels();
		System.out.println("Le nombre de materiel est de : " + nb);
	}


public static void menuMateriels ()
	{
		
		int choix = 0; 
		do {
			System.out.println("_____ Insertion des Materiels ______");
			System.out.println("1- Inserer un Materiel");
			System.out.println("2-Affichage des Materiels ");
			System.out.println("3 - Supprimer un Materiel");
			System.out.println("4 - Editer un Materiel");
			System.out.println("0- Quitter l'insertion");
			System.out.println("Votre choix :");
			choix = Console.saisirInt(); 
			switch (choix)
			{
			case 1 : insertMateriels();break;
			case 2 : afficherLesMateriels();break;
			case 3 : deleteMateriels();break;
			case 4: modifierMateriels();break;
			}
		}while (choix !=0);
	}

	

	
	
}






