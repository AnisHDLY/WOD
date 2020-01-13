package tpParking;

public class Voiture {

	private double vitesse;
	private double calculFlash;
	public final double vitesseMin = 0;
	public final double vitesseMax = 300;
	public final int vitesseFlash = 120;

	private InfoProprio infoProprio;
	private InfoVoiture infoVoiture;

	// Constructeur

	public Voiture(InfoProprio infoProprio, String matricule, String marque) {
		this.infoProprio = infoProprio;
		this.infoVoiture = new InfoVoiture(matricule, marque);
	}

	// Methode

	public void SetVitesse(double vitessesaisie) {

		if (vitessesaisie >= vitesseMin && vitessesaisie < vitesseMax) {
			if (vitessesaisie <= vitesseFlash && vitessesaisie > vitesseFlash)
				calculFlash++;
		}
		this.vitesse = vitessesaisie;
	}

	// Accesseurs

	public double getCalculFlash() {
		return calculFlash;
	}

	public void setVitesse(double vitesse) {
		this.vitesse = vitesse;
	}

	public InfoVoiture getInfoVoiture() {
		return infoVoiture;
	}

	public InfoProprio getInfoProprio() {
		return infoProprio;
	}

	// toString
	public String toString() {
		String res = "Voiture vitesse=" + vitesse + "\n, flash=" + calculFlash;
		if (infoVoiture != null)
			res += ", " + infoVoiture.toString();
		if (infoProprio != null)
			res += ", " + infoProprio.toString();
		return res;

	}
}
