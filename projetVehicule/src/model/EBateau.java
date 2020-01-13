package model;

public enum EBateau {
	petit(2), moyen(10), grand(50);
	private int longueur;

	// constructor
	private EBateau(int longueur) {
		this.longueur = longueur;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

}
