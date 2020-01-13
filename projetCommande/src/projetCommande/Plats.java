package projetCommande;

public enum Plats {
	dujour(5), salade(3), riz(50); // ici il ya le prix partout doc ca sert a
									// rien de crer un constructeur vide

	private int prix;

	// Constructeurs
	private Plats(int prix) {
		this.prix = prix;
	}
	// getteurs

	public int getPrix() {

		return prix;
	}

	// toString
	public String toString() {
		return "Nom du plats: " + name() + " Prix: " + prix;
	}

}
