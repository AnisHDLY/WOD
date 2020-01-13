package projetStatic;

public class Personne {

	
	private static String nom= "dupond";
	private String prenom;
	private static final int ageMin=0; 
	private static int compteur; 
	
	
	//constructeur 
	
	public Personne( String prenom) {
		this.prenom = prenom;
		compteur++;
	}

	//methode toString on peut l a
		public String toString() {
			return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
		}
		
  // les accesseurs
	public static void setNom(String nom) {
		Personne.nom = nom;
	}

	public static int getCompteur() {
		return compteur;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	

	
	
}
