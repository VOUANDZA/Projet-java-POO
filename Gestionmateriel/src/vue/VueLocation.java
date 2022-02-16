package vue;

import controleur.Location;
import controleur.Materiels;

public class VueLocation {
	public static Location saisirLocation ()//saisie des Location
	{
		Location uneLocation= null; 
		System.out.println("Donner l'id du professeur : ");
		int idprof = Console.saisirInt(); 
		System.out.println("Donner la date de location : ");
		String DATEL = Console.saisirString();
		System.out.println("Donner l'heure de location  : ");
		String heureL = Console.saisirString();
		System.out.println("Donner la duree de location : ");
		String Duree = Console.saisirString();
		
		uneLocation = new Location(idprof, DATEL, heureL,Duree);
		return uneLocation;
	}
	
	public static void afficherLocations (Location uneLocation)//Affichage des Locations
	{
		System.out.println("________ Affichages des locations ______");
		System.out.println("idprof  : " + uneLocation.getIdprof()); 
		System.out.println("Date de location    : " + uneLocation.getDATEL()); 
		System.out.println("heure de location       : " + uneLocation.getHeureL()); 
		System.out.println("Duree de location      : " + uneLocation.getDuree());
		System.out.println("_______________________________"); 
	}
	
	public static int saisirId()//suppression et  Saisie de l'id
	{
		System.out.println("--------------------------------------------");
		System.out.println("---------- SUPPRESSION D'une Location ----------");
		System.out.println("--------------------------------------------");
		System.out.println("Donner l'id de location:");
		return Console.saisirInt(); 
	}
	
	

	public static Location modifierLocations (Location uneLocation) {// modification des Locations
		System.out.println("----------------------------------------");
		System.out.println("---------- EDITION D'une Location ----------");
		System.out.println("----------------------------------------");
		System.out.println("Ancienne Date de location: " + uneLocation.getDATEL());
		System.out.println("Donner la nouvelle Date de location : ");
		uneLocation.setDATEL(Console.saisirString());
		System.out.println("Ancienne Heure de location : " + uneLocation.getHeureL());
		System.out.println("Donner la nouvelle Heure de location  : ");
		uneLocation.setHeureL(Console.saisirString());
		System.out.println("Duree Ancienne de location: " + uneLocation.getDuree());
		System.out.println("Donner la nouvelle Duree de location: ");
		uneLocation.setDuree(Console.saisirString());
		return uneLocation;
	}
	
	
}


