package model;

public class Personne {

	
	private String nom;
	private String prenom;
	private Adress adress;
	
	
	
	public Adress getAdress() {
		return adress;
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



	public String toString() {
		String reponse=nom+"    "+prenom;
		reponse+= (adress!=null)?  "\nadress=" + adress.toString():"" ;
		return reponse;
		
	}
	
	
	
}
