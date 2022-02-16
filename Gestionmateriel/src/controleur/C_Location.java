package controleur;

import java.util.ArrayList;

import modele.Modele;
import vue.Console;
import vue.VueLocation;


public class C_Location {
	
	public static void insertLocation () {
		Location uneLocation = VueLocation.saisirLocation();
		Modele.insertLocation(uneLocation);
	}
	
	public static void afficherLesLocations() {
		ArrayList<Location> lesLocation = Modele.selectAllLocation();
		System.out.println("__________ LISTE DES Locations __________");
		for (Location uneLocation : lesLocation) {
			VueLocation.afficherLocations(uneLocation);
		}
	}
	
	public static void deleteLocation () {
		int idprof = VueLocation.saisirId();
		Modele.deleteLocation(idprof);
	}
	
	public static void modifierLocation () {
		int idprof = VueLocation.saisirId();
		Location uneLocation = Modele.selectWhereLocation(idprof);
		if (uneLocation!= null) {
			VueLocation.modifierLocations(uneLocation);
			Modele.updateLocation(uneLocation);
		}
	}
	
	public static void count () {
		int nb;
		nb = Modele.countLocation();
		System.out.println("Le nombre de location est  de : " + nb);
	}


public static void menuLocation ()
	{
		
		int choix = 0; 
		do {
			System.out.println("_____ Insertion des Location ______");
			System.out.println("1- Inserer une Location");
			System.out.println("2-Affichage des Location ");
			System.out.println("3 - Supprimer une Location");
			System.out.println("4 - Editer une Location");
			System.out.println("0- Quitter l'insertion");
			System.out.println("Votre choix :");
			choix = Console.saisirInt(); 
			switch (choix)
			{
			case 1 : insertLocation();break;
			case 2 : afficherLesLocations();break;
			case 3 : deleteLocation();break;
			case 4: modifierLocation();break;
			}
		}while (choix !=0);
	}
}