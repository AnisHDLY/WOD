package model;

public class Info {
	
	private int poids;
	private double taille;
	
	public Info(int poids, double taille) {
		this.poids = poids;
		this.taille = taille;
	}


	public String toString() {
		return "Info [poids=" + poids + ", taille=" + taille + "]";
	}
	
	
	
}
