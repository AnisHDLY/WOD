package projetCommande;

public enum Desserts {

	fruit(3), gateau(4), sans();

	private int prix;

	// constucteurs
	private Desserts() {
	}

	private Desserts(int prix) {
		this.prix = prix;
	}

	// toString
	public String toString() {
		return "Dessert:  " + name() + " prix: " + prix;
	}

	// getteurs
	public int getPrix() {
		return prix;
	}

}
