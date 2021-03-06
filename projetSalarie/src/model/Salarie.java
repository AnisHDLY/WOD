package model;

public class Salarie {
	private int id;
	private String nom;
	private String prenom;
	private Status status;
	private Rib rib;

	public Salarie(int id, String nom, String prenom, Rib rib, int experience) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.rib = rib;
		this.status = new Status(experience);
	}

	public String toString() {
		return "Salarie [id=" + id + ", nom=" + nom + ", prenom=" + prenom+  "\n status=" + status + "\n rib=" + rib
				+ "]";
	}

}
