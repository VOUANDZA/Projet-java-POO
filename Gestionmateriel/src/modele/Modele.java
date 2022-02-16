package modele;
import java.util.ArrayList;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import controleur.Location;
import controleur.Materiels;
import controleur.Profs;
import controleur.Professeurs;

public class Modele {// connexion à la bdd
    
    private static Bdd uneBdd = new Bdd ("localhost", "Gestion_materiels", "root", "");
                  
    
 // INSERTION D'UN Professeurs
    public static void insertProfesseurs (Professeurs unProfesseurs) {
        String requete = "INSERT INTO Professeurs values (null,'"
                + unProfesseurs.getNom() + "', '" 
                + unProfesseurs.getPrenom() + "', '"
                + unProfesseurs.getAdresse() + "', '"
                + unProfesseurs.getDiplome() + "') ;";
             
        try {
            uneBdd.seConnecter();
            Statement unStat = uneBdd.getMaconnexion().createStatement();
            unStat.execute(requete);
            unStat.close();
            uneBdd.seDeconnecter();
        } catch (SQLException exp) {
            System.out.println("Erreur de requête : " + requete);
        }
    }
    
    
     // selection de tous les professeurs
    public static ArrayList<Professeurs> selectAllProfesseurs ()
    {
    	ArrayList<Professeurs> lesProfesseurs = new ArrayList<Professeurs>(); 
    	String requete = "select * from Professeurs ; ";
    	try {
    		uneBdd.seConnecter();
    		Statement unStat = uneBdd.getMaconnexion().createStatement(); 
    		ResultSet desResultats = unStat.executeQuery(requete);
    	
    		while (desResultats.next()) //tant qu'il un resultat suivant
    		{
    			Professeurs unProfesseur = new Professeurs (
    					desResultats.getInt("idprof"), 
    					desResultats.getString("Nom"), 
    					desResultats.getString("Prenom"),
    					desResultats.getString("Adresse"),
    					desResultats.getString("Diplome")
    			);
    			//on ajoute le pilote dans la liste des pilotes 
    			lesProfesseurs.add(unProfesseur); 
    		}
    		
    		unStat.close();
    		uneBdd.seDeconnecter();
    	}
    	catch (SQLException exp) {
    		System.out.println("Erreur de requete :"+requete);
    	}
    	return lesProfesseurs; 
    }

    
    
    //SUPPRESSION D'un Professeur
   	public static void deleteProfesseur (int idprof) {
   		String requete = "DELETE FROM Professeurs WHERE idprof = " + idprof;
   		try {
   			uneBdd.seConnecter();
   			Statement unStat = uneBdd.getMaconnexion().createStatement();
   			unStat.execute(requete);
   			unStat.close();
   			uneBdd.seDeconnecter();
   		} catch (SQLException exp) {
   			System.out.println("Erreur de requête : " + requete);
   		}
   	}
    
    
 // SELECTION D'UN Professeur (SELECT WHERE)
 	public static Professeurs selectWhereProfesseurs (int idprof) {
 		Professeurs unProfesseur = null;
 		String requete = "SELECT * FROM Professeurs WHERE idprof = "+idprof+";";
 		try {
 			uneBdd.seConnecter();
 			Statement unStat = uneBdd.getMaconnexion().createStatement();
 			ResultSet unResultat = unStat.executeQuery(requete);
 			if (unResultat.next()) {
 				unProfesseur = new Professeurs(
 						unResultat.getInt("idprof"),
 						unResultat.getString("Nom"),
 						unResultat.getString("Prenom"),
 						unResultat.getString("Adresse"),
 						unResultat.getString("Diplome")
 						
 						);
 			}
 			unStat.close();
 			uneBdd.seDeconnecter();
 		} catch (SQLException exp) {
 			System.out.println("Erreur de requête : " + requete);
 		}
 		return unProfesseur;
 	}
    
    
 // EDITION D'UN PILOTE
 	public static void updateProfesseur (Professeurs unProfesseur) {
 		String requete = "UPDATE Professeurs SET nom = '"
 				+ unProfesseur.getNom() + "', Prenom = '" 
 				+ unProfesseur.getPrenom() + "', Adresse = '"
 				+ unProfesseur.getAdresse() + "', Diplome = '"
 				+ unProfesseur.getDiplome() + "' WHERE idprof = "+unProfesseur.getIdprof()+";";
 		try {
 			uneBdd.seConnecter();
 			Statement unStat = uneBdd.getMaconnexion().createStatement();
 			unStat.execute(requete);
 			unStat.close();
 			uneBdd.seDeconnecter();
 		} catch (SQLException exp) {
 			System.out.println("Erreur de requête : " + requete);
 		}
 	}
    
 // NOMBRE DE Professeurs (COUNT())
 	public static int countProfesseurs () {
 		int nbProfesseurs = 0;
 		String requete = "SELECT count(*) as nb FROM Professeurs;";
 		try {
 			uneBdd.seConnecter();
 			Statement unStat = uneBdd.getMaconnexion().createStatement();
 			ResultSet unResultat = unStat.executeQuery(requete);
 			if (unResultat.next()) {
 				nbProfesseurs = unResultat.getInt("nb");
 			}
 			unStat.close();
 			uneBdd.seDeconnecter();
 		} catch (SQLException exp) {
 			System.out.println("Erreur de requête : " + requete);
 		}
 		return nbProfesseurs;
 	}
 	
 	
 // INSERTION D'UN Materiel
    public static void insertMateriels(Materiels unMateriel) {
        String requete = "INSERT INTO Materiels values (null,'"
                + unMateriel.getDesignation() + "', '" 
                + unMateriel.getDateAchat() + "', '"
                + unMateriel.getEtat() + "') ;";
             
        try {
            uneBdd.seConnecter();
            Statement unStat = uneBdd.getMaconnexion().createStatement();
            unStat.execute(requete);
            unStat.close();
            uneBdd.seDeconnecter();
        } catch (SQLException exp) {
            System.out.println("Erreur de requête : " + requete);
        }
    }
    
    
 	
    
public static ArrayList<Materiels> selectAllMateriels ()  //selection de tous les materiels
	{
		ArrayList<Materiels> lesMateriels = new ArrayList<Materiels>(); 
		String requete = "select * from Materiels ; ";
		try {
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaconnexion().createStatement(); 
			ResultSet desResultats = unStat.executeQuery(requete);
		
			while (desResultats.next()) //tant qu'il un resultat suivant
			{
				Materiels unMateriel = new Materiels (
						desResultats.getInt("idm"), 
						desResultats.getString("designation"), 
						desResultats.getString("DateAchat"),
						desResultats.getString("Etat")
					);
				//on ajoute le pilote dans la liste des pilotes 
				lesMateriels.add(unMateriel); 
				}
    		
    		unStat.close();
    		uneBdd.seDeconnecter();
    	}
    	catch (SQLException exp) {
    		System.out.println("Erreur de requete :"+requete);
    	}
    	return lesMateriels; 
    }	
				
 // SUPPRESSION D'UN Materiel
 	public static void deleteMateriels (int idm) {
 		String requete = "DELETE FROM Materiels WHERE idm = " + idm;
 		try {
 			uneBdd.seConnecter();
 			Statement unStat = uneBdd.getMaconnexion().createStatement();
 			unStat.execute(requete);
 			unStat.close();
 			uneBdd.seDeconnecter();
 		} catch (SQLException exp) {
 			System.out.println("Erreur de requête : " + requete);
 		}
 	}		
				
		
 	
 // SELECTION D'UN Materiel (SELECT WHERE)
 	public static Materiels selectWhereMateriels (int idm) {
 		Materiels unMateriel= null;
 		String requete = "SELECT * FROM Materiels WHERE idm = "+idm+";";
 		try {
 			uneBdd.seConnecter();
 			Statement unStat = uneBdd.getMaconnexion().createStatement();
 			ResultSet unResultat = unStat.executeQuery(requete);
 			if (unResultat.next()) {
 				unMateriel = new Materiels (
 						unResultat.getInt("idm"),
 						unResultat.getString("designation"),
 						unResultat.getString("DateAchat"),
 						unResultat.getString("Etat")
 						);
 			}
 			unStat.close();
 			uneBdd.seDeconnecter();
 		} catch (SQLException exp) {
 			System.out.println("Erreur de requête : " + requete);
 		}
 		return unMateriel;
 	}
 	
 	// EDITION D'UN Materiel
 	public static void updateMateriels(Materiels unMateriel) {
 		String requete = "UPDATE Materiels SET designation = '"
 				+ unMateriel.getDesignation() + "', DateAchat = '" 
 				+ unMateriel.getDateAchat() + "', Etat = '"
 				+ unMateriel.getEtat() + "' WHERE idm = "+unMateriel.getIdm()+";";
 		try {
 			uneBdd.seConnecter();
 			Statement unStat = uneBdd.getMaconnexion().createStatement();
 			unStat.execute(requete);
 			unStat.close();
 			uneBdd.seDeconnecter();
 		} catch (SQLException exp) {
 			System.out.println("Erreur de requête : " + requete);
 		}
 	}
 	
		
 // NOMBRE DE Materiels (COUNT())
  	public static int countMateriels () {
  		int nbMateriels= 0;
  		String requete = "SELECT count(*) as nb FROM Materiels;";
  		try {
  			uneBdd.seConnecter();
  			Statement unStat = uneBdd.getMaconnexion().createStatement();
  			ResultSet unResultat = unStat.executeQuery(requete);
  			if (unResultat.next()) {
  				nbMateriels = unResultat.getInt("nb");
  			}
  			unStat.close();
  			uneBdd.seDeconnecter();
  		} catch (SQLException exp) {
  			System.out.println("Erreur de requête : " + requete);
  		}
  		return nbMateriels;
  	}

				
				public static void insertLocation (Location uneLocation) {   //insertion des locations
					
        String requete = "INSERT INTO Location VALUES (null,'"
                + uneLocation.getIdprof() + "', '" 
                + uneLocation.getDATEL() + "', '"
                + uneLocation.getHeureL() + "','"
              + uneLocation.getDuree() + "');";
        try {
            uneBdd.seConnecter();
            Statement unStat = uneBdd.getMaconnexion().createStatement();
            unStat.execute(requete);
            unStat.close();
            uneBdd.seConnecter();
        } catch (SQLException exp) {
            System.out.println("Erreur de requête : " + requete);
        }
    }
    
    
				// selection de tous les Location
			    public static ArrayList<Location> selectAllLocation ()
			    {
			    	ArrayList<Location> lesLocations = new ArrayList<Location>(); 
			    	String requete = "select * from Location ; ";
			    	try {
			    		uneBdd.seConnecter();
			    		Statement unStat = uneBdd.getMaconnexion().createStatement(); 
			    		ResultSet desResultats = unStat.executeQuery(requete);
			    	
			    		while (desResultats.next()) //tant qu'il donne un resultat 
			    		{
			    			Location uneLocation = new Location (
			    					
			    					desResultats.getInt("idprof"), 
			    					desResultats.getString("DATEL"), 
			    					desResultats.getString("HeureL"),
			    					desResultats.getString("Duree")
			    					
			    			);
			    			
			    			lesLocations.add(uneLocation);  
			    		}
			    		
			    		unStat.close();
			    		uneBdd.seDeconnecter();
			    	}
			    	catch (SQLException exp) {
			    		System.out.println("Erreur de requete :"+requete);
			    	}
			    	return lesLocations; 
			    }

			    //SUPPRESSION D'une Location
			   	public static void deleteLocation (int idprof) {
			   		String requete = "DELETE FROM Location WHERE idprof = " + idprof;
			   		try {
			   			uneBdd.seConnecter();
			   			Statement unStat = uneBdd.getMaconnexion().createStatement();
			   			unStat.execute(requete);
			   			unStat.close();
			   			uneBdd.seDeconnecter();
			   		} catch (SQLException exp) {
			   			System.out.println("Erreur de requête : " + requete);
			   		}
			   	}
			    
    
    
    
	


 

			 // SELECTION D'une Location (SELECT WHERE)
			 	public static Location selectWhereLocation (int idprof) {
			 		Location uneLocation= null;
			 		String requete = "SELECT * FROM Location WHERE idm = "+idprof+";";
			 		try {
			 			uneBdd.seConnecter();
			 			Statement unStat = uneBdd.getMaconnexion().createStatement();
			 			ResultSet unResultat = unStat.executeQuery(requete);
			 			if (unResultat.next()) {
			 				uneLocation = new Location (
			 					unResultat.getInt("idprof"),
			 						unResultat.getString("DATEL"),
			 						unResultat.getString("HeureL"),
			 						unResultat.getString("Duree")
			 						);
			 			}
			 			unStat.close();
			 			uneBdd.seDeconnecter();
			 		} catch (SQLException exp) {
			 			System.out.println("Erreur de requête : " + requete);
			 		}
			 		return uneLocation;
			 	}
			 	
			 	// EDITION D'une location
			 	public static void updateLocation(Location uneLocation) {
			 		String requete = "UPDATE Location SET idprof = '"
			 				+ uneLocation.getIdprof() + "', DATEL = '" 
			 				+ uneLocation.getDATEL() + "', HeureL = '"
			 				+ uneLocation.getHeureL() + "' WHERE idprof = "+uneLocation.getIdprof()+";";
			 		try {
			 			uneBdd.seConnecter();
			 			Statement unStat = uneBdd.getMaconnexion().createStatement();
			 			unStat.execute(requete);
			 			unStat.close();
			 			uneBdd.seDeconnecter();
			 		} catch (SQLException exp) {
			 			System.out.println("Erreur de requête : " + requete);
			 		}
			 	}
			 	
					
			 // NOMBRE DE Location (COUNT())
			  	public static int countLocation () {
			  		int nbLocation= 0;
			  		String requete = "SELECT count(*) as nb FROM Location;";
			  		try {
			  			uneBdd.seConnecter();
			  			Statement unStat = uneBdd.getMaconnexion().createStatement();
			  			ResultSet unResultat = unStat.executeQuery(requete);
			  			if (unResultat.next()) {
			  				nbLocation = unResultat.getInt("nb");
			  			}
			  			unStat.close();
			  			uneBdd.seDeconnecter();
			  		} catch (SQLException exp) {
			  			System.out.println("Erreur de requête : " + requete);
			  		}
			  		return nbLocation;
			  	}

	// SELECTION DE LA VUE : vProf
				public static ArrayList<Profs> selectAllProfs () {
					ArrayList<Profs> lesProfs = new ArrayList<Profs>();
					String requete = "SELECT * FROM Profs;";
					try {
						uneBdd.seConnecter();
						Statement unStat = uneBdd.getMaconnexion().createStatement();
						ResultSet desResultats = unStat.executeQuery(requete);
						while (desResultats.next()) {
							Profs unProf = new Profs (
								
									desResultats.getString("Nom"),
									desResultats.getString("Prenom"),
									desResultats.getString("Adresse"),
									desResultats.getString("Diplome")
									);
							lesProfs.add(unProf);
						}
						unStat.close();
						uneBdd.seDeconnecter();
					} catch (SQLException exp) {
						System.out.println("Erreur de requête : " + requete);
					}
					return lesProfs;
				}


		   	
	
				
				
				
				
				
				
				
				
				
			   	
			   	
			   	
			   	
			   	
			   	
			   	
			   	
			   	
			   	
			   	
			   	
			   	


}














    
    
    
    
    
    
    
    
    
    


	


