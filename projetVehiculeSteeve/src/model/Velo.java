package model;

public class Velo extends Vehicule{

	// constructeur
	public Velo(String marque, int prix) {
		super(marque, prix);
	}

	// methode
	public String avancer() {
		return super.avancer() + " � 2 roues";

	}
}
