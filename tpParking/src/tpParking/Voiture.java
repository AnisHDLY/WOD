package tpParking;

public class Voiture {

	private double vitesse;
	public final double vitesseMin = 0;
	public final double vitesseMax = 300;
	public final int vitesseFlash = 120;
	private double flash;

	private InfoProprio infoProprio;
	private InfoVoiture infoVoiture;

	// methode

	public void setVitesse(double vitesse) {
		// test des bornes min et max de la vitesse

	}

	// Accesseurs
	public double getFlash() {
		return flash;
	}

	public void setVitesse(double vitesse) {
		this.vitesse = vitesse;
	}

	public InfoVoiture getInfoVoiture() {
		return infoVoiture;
	}

	// Constructeur
	public Voiture(InfoProprio infoProprio, String marque, String matricule) {
		this.vitesse = 0;
		this.flash = 0;
		this.infoProprio= infoProprio;
		this.infoVoiture= new InfoVoiture (marque, matricule);
		
		
		
	}

	// toString
	public String toString() {
		return "Voiture [vitesse=" + vitesse + ", vitesseMin=" + vitesseMin + ", vitesseMax=" + vitesseMax
				+ ", vitesseFlash=" + vitesseFlash + ", flash=" + flash + ", infoProprio=" + infoProprio
				+ ", infovoiture=" + infovoiture + "]";
	}

}
