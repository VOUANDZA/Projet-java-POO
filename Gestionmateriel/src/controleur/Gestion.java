package controleur;


import java.util.ArrayList;
import java.util.Scanner;

import modele.Modele;
import vue.VProf;


public class Gestion {
	public static void tableauBord () {
		ArrayList<Profs> lesProfs= Modele.selectAllProfs();
		VProf.afficherProfs(lesProfs);
	}
	
	
	public static void menuGeneral ()
	{
	Scanner sc=new Scanner(System.in);
		int choix = 0; 
		do {
			System.out.println("_____ MENU Gestion materiel ______");
			System.out.println("1- Gérer les Materiel ");
			System.out.println("2- Gérer les Professeurs ");
			System.out.println("3- Gérer les location ");
			System.out.println("4 - Statistiques");
			System.out.println("5 - Tableau de bord");
			System.out.println("0- Quitter le menu");
			System.out.println("Votre choix :");
			choix =sc.nextInt(); 
			switch (choix)
			{
			case 1 : C_Materiels.menuMateriels();break;
			case 2 : C_Professeurs.menuProfesseurs();break;
			case 3 : C_Location.insertLocation();break;
			case 4 :C_Materiels.count();
				 C_Professeurs.count();
				 C_Location.count();
				break;
			case 5 : tableauBord(); break;
			}
		}while (choix !=0);
	}
	

	public static void main(String[] args) {
		menuGeneral();
	}

	
	
	
	}
