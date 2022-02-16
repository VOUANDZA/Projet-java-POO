
package modele;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Bdd {                        // Class bdd et déclaration des attributs
private String serveur ,bdd,user, mdp;
private Connection maConnexion;
public Bdd(String serveur, String bdd, String user, String mdp) { //constructeur de la bdd
	super();
	this.serveur = serveur;
	this.bdd = bdd;
	this.user = user;
	this.mdp = mdp;
	this.maConnexion = null;
	
}

public void seConnecter() // connection à mysql
{
	String url="jdbc:mysql://"+this.serveur+"/"+this.bdd;
	try {
		Class.forName("com.mysql.jdbc.Driver");// permet de vérifier si elle est présente dans la librairie
	}
	catch(ClassNotFoundException exp) {
		System.out.println("Absence du pilote jdbc");
	}
	
	try {
		this.maConnexion=DriverManager.getConnection(url,this.user,this.mdp);
	}
	catch(SQLException  exp){
		System.out.println("Erreur de connexion a:" + url);
		exp.printStackTrace();  //afficher l'erreur en rouge
	}
}


public void seDeconnecter() {  // deconnexion
	try {
	if (this.maConnexion!=null) {
		this.maConnexion.close();
	}
}
catch(SQLException exp){
	System.out.println("Erreur de déconnexion au serveur");
}
}
public Connection  getMaconnexion() {
	return this.maConnexion;
}
}
