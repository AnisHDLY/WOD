package Model;

public class Personne {
	
	private String nom; 
	private String prenom; 
	private int age;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public String toString() {
		return "nom=" + nom + ", prenom=" + prenom + ", age=" + age + "";
	}
	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getAge() {
		return age;
	}
	
	
	
}


