package projetCommande;

public class Commande {

	private String client;
	private Boisson boisson;
	private Plats plat;
	private Desserts dessert;
	private int prixTotal;

	// toString
	public String toString() {
		return "Commande client=" + client + "\n boisson=" + boisson + "\n plat=" + plat + "\n Dessert=" + dessert;
	}

	public String toStringdetail() {
		return "Commande client=" + client + "\n boisson=" + boisson.name() + " ,Prix=" + boisson.getPrix() + "\n plat="
				+ plat.name() + " ,Prix=" + plat.getPrix() + " \n Dessert=" + dessert.name() + " ,Prix="
				+ dessert.getPrix() + " \n prixTotal=" + prixTotal;
	}

	// constructeurs

	public Commande(String client, Boisson boisson, Plats plat, Desserts dessert) {
		this.client = client;
		this.boisson = boisson;
		this.plat = plat;
		this.dessert = dessert;
		calculerPrixtotal();
		// x=1
		// y=2
		// x=Y/
	}

	private int calculerPrixtotal() {
		this.prixTotal = dessert.getPrix() + plat.getPrix() + boisson.getPrix();
		return this.prixTotal;
	}

	public int getPrixTotal() {
		return this.prixTotal;
	}
}
