package projetCommande;

public class Client {
	private String nom;
	private String prenom;

	// toString
	public String toString() {
		return "Personne nom=" + nom + ", prenom=" + prenom;
	}

	// Constructor
	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	// getteur

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

}
