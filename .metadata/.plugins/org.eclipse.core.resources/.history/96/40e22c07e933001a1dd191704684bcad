package model;

public class Personne {
	private String nom;
	private String prenom;
	private Adresse adresse;
	private Info info;

	public Adresse getAdresse() {
		return adresse;
	}
	// 1
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;

	}
	// 2
	public Personne(String nom, String prenom, Adresse adresse, Info info) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.info = info;
	}
	// 3
	public Personne(String nom, String prenom, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	// 4
	public Personne(String nom, String prenom, Info info) {
		this.nom = nom;
		this.prenom = prenom;
		this.info = info;
	}

	public String toString() {
		String response = "Personne [nom=" + nom + ", prenom=" + prenom;
		response += (adresse != null) ? "\nadresse=" + adresse.toString() : "";
		response += (info != null) ? "\ninfo=" + info.toString() : "";
		return response;
	}

}
