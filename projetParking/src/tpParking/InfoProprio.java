package tpParking;

public class InfoProprio {
	private String nom;
	private String prenom;

	
	public InfoProprio(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}



	public String getNom() {
		return nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public String toString() {
		return "InfoProprio [nom=" + nom + ", prenom=" + prenom + "]";
	}
	

	
}
