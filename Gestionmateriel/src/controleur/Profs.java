package controleur;

public class Profs {
	private String  Nom, Prenom, Adresse,Diplome,diplome;

	public Profs(String nom, String prenom, String adresse, String diplome) {
			super();
			Nom = nom;
			Prenom = prenom;
			Adresse = adresse;
			Diplome = diplome;
		}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public String getDiplome() {
		return Diplome;
	}
	public void setDiplome(String diplome) {
		Diplome = diplome;
	}
	
	
	
	
	
}