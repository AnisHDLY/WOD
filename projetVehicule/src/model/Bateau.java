package model;

public class Bateau extends Vehicule {
	private String marque;
	private int prix;
	private EBateau ebateau;

	public Bateau(String marquevehicule, int prix, String marque, int prix2, EBateau ebateau) {
		super(marquevehicule, prix);
		this.marque = marque;
		prix = prix2;
		this.ebateau = ebateau;
	}

	public String toString() {
		return "Bateau [marque=" + marque + ", prix=" + prix + ", EBateau=" + EBateau + "]";
	}

}
