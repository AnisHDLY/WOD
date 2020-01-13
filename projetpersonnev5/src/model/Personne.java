package model;

public class Personne {

	private String nom;
	private String prenom;

	private Adress adress;
	private Info info;

	// constructeur
	public Personne(String nom, String prenom, Info info) {
		this.nom = nom;
		this.prenom = prenom;
		this.info = info;
	}

	public Personne(String nom, String prenom, Adress adress, Info info) {
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
		this.info = info;
	}

	public Personne(String nom, String prenom, Adress adress) {
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
	}

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	// Accesseurs
	public Adress getAdress() {
		return adress;
	}

	public String toString() {
		String reponse = nom + "    " + prenom;
		reponse += (adress != null) ? "\nadress=  " + adress.toString() : "";
		return reponse;

	}

}
