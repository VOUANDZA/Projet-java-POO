package vue;




	import java.util.ArrayList;

	import controleur.Profs;

	public class VProf {
		
		public static void afficherProfs (ArrayList<Profs> lesProfs) {
			System.out.println("__________ TABLEAU DE BORD  des profs__________");
			System.out.println("|  NOM    |     Prénom     |     Adresse   |         Diplome  |");
			for (Profs unProf : lesProfs) {
			System.out.print("    " + unProf.getNom());
				System.out.print("    " + unProf.getPrenom());
				System.out.print("     " + unProf.getAdresse());
				System.out.print("");
				System.out.print("     " + unProf.getDiplome());
				
				System.out.println("");
			}
		}


	}


