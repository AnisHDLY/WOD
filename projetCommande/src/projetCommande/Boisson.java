package projetCommande;

public enum Boisson {

	coca(2), eau(1), sans;

	private int prix;

	// toString
	public String toString() {
		return "Boisson: " + name() + " prix  " + prix; // quznd c est une
														// methode ca prend une
														// parenthese sinon c
														// est una var
	}

	// constructeurs
	private Boisson() {
	}

	private Boisson(int prix) {
		this.prix = prix;
	}

	// getteurs
	public int getPrix() {
		return prix;
	}

}
