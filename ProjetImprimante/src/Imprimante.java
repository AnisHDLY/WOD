
public class Imprimante {
	private String nom;

	public Imprimante(String nom) {
		this.nom = nom;
	}

	// methodes
	public void print(String impression) {
		System.out.println(impression+" " +nom);

	}
}
