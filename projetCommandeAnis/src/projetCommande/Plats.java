package projetCommande;

public enum Plats {
	dujour(5),
	salade(3),
	riz(50)
	
	private int prix;

	private Plats(int prix) {
		this.prix = prix;
	}

	
	
}
