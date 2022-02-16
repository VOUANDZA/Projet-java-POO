package controleur;

public class Materiels {
private int idm;
private String designation, DateAchat,Etat;


public Materiels(int idm, String designation, String dateAchat, String etat) {
	super();
	this.idm = idm;
	this.designation = designation;
	DateAchat = dateAchat;
	Etat = etat;
}


public Materiels(String designation, String dateAchat, String etat) {
	super();
	this.idm = 0;
	this.designation = designation;
	DateAchat = dateAchat;
	Etat = etat;
}


public int getIdm() {
	return idm;
}


public void setIdm(int idm) {
	this.idm = idm;
}


public String getDesignation() {
	return designation;
}


public void setDesignation(String designation) {
	this.designation = designation;
}


public String getDateAchat() {
	return DateAchat;
}


public void setDateAchat(String dateAchat) {
	DateAchat = dateAchat;
}


public String getEtat() {
	return Etat;
}


public void setEtat(String etat) {
	Etat = etat;
}




}














