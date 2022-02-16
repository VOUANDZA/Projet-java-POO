package controleur;

public class Professeurs {
private int idprof;
private String Nom, Prenom, Adresse,Diplome;
public Professeurs(int idprof, String nom, String prenom, String adresse, String diplome) {
	super();
	this.idprof = idprof;
	Nom = nom;
	Prenom = prenom;
	Adresse = adresse;
	Diplome = diplome;
}

public Professeurs( String nom, String prenom, String adresse, String diplome) {
	super();
	this.idprof =0;
	Nom = nom;
	Prenom = prenom;
	Adresse = adresse;
	Diplome = diplome;
}

public int getIdprof() {
	return idprof;
}

public void setIdprof(int idprof) {
	this.idprof = idprof;
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