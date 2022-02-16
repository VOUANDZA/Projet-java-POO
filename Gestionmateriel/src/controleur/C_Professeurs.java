package controleur;


import java.util.ArrayList;

import modele.Modele;
import vue.Console;
import vue.VueProfesseurs;


public class C_Professeurs {
	
	public static void insertProfesseurs () {
		Professeurs unProfesseur = VueProfesseurs.saisirProfesseurs();
		Modele.insertProfesseurs(unProfesseur);
	}
	
	public static void afficherLesProfesseurs () {
		ArrayList<Professeurs> lesProfesseurs = Modele.selectAllProfesseurs();
		System.out.println("__________ LISTE DES Professeurs __________");
		for (Professeurs unProfesseur : lesProfesseurs) {
			VueProfesseurs.afficherProfesseurs(unProfesseur);
		}
	}
	
	public static void deleteProfesseurs () {//supression des professeurs
		int idprof = VueProfesseurs.saisirId();
		Modele.deleteProfesseur(idprof);
	}
	
	public static void modifierProfesseurs () {
		int idprof = VueProfesseurs.saisirId();
		Professeurs unProfesseur = Modele.selectWhereProfesseurs(idprof);
		if (unProfesseur != null) {
			VueProfesseurs.modifierProfesseurs(unProfesseur);
			Modele.updateProfesseur(unProfesseur);
		}
	}
	
	public static void count () {
		int nb;
		nb = Modele.countProfesseurs();
		System.out.println("Le nombre de professeur est de : " + nb);
	}


public static void menuProfesseurs ()//Menu Profs
	{
	
		int choix = 0; 
		do {
			System.out.println("_____ Menu Professeurs ______");
			System.out.println("1- Inserer un Professeur");
			System.out.println("2-Affichage des Professeurs ");
			System.out.println("3 - Supprimer un Professeur");
			System.out.println("4 - Editer un professeur");
			System.out.println("0- Quitter le menu");
			System.out.println("Votre choix :");
			choix =Console.saisirInt();
			switch (choix)
			{
			case 1 : insertProfesseurs();break;
			case 2 : afficherLesProfesseurs();break;
			case 3 : deleteProfesseurs();break;
			case 4 : modifierProfesseurs();break;
			}
		}while (choix !=0);
	}

	
	
	
	
	
	
	
	
}
	

	