package controleur;

public class Location {
private int idm, idprof;
private String DATEL,heureL,Duree;


public Location(int idm, int idprof, String dATEL, String heureL, String duree) {
	super();
	this.idm = idm;
	this.idprof = idprof;
	DATEL = dATEL;
	this.heureL = heureL;
	Duree = duree;
}

public Location( int idprof, String dATEL, String heureL, String duree) {
	super();
	this.idm = 0;
	this.idprof = idprof;
	DATEL = dATEL;
	this.heureL = heureL;
	Duree = duree;
}

public int getIdm() {
	return idm;
}

public void setIdm(int idm) {
	this.idm = idm;
}

public int getIdprof() {
	return idprof;
}

public void setIdprof(int idprof) {
	this.idprof = idprof;
}

public String getDATEL() {
	return DATEL;
}

public void setDATEL(String dATEL) {
	DATEL = dATEL;
}

public String getHeureL() {
	return heureL;
}

public void setHeureL(String heureL) {
	this.heureL = heureL;
}

public String getDuree() {
	return Duree;
}

public void setDuree(String duree) {
	Duree = duree;
}


}


