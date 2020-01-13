package tpParking;

public class Parking {
	private String nom;
	private Voiture[] tab;

	public int getCount() {
		int compteur = 0;
		for (Voiture v : tab)
			if (v != null)
				compteur++;
		return compteur;
	}

	public boolean quitter(String matricule) {
		boolean res = false;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] != null && tab[i].getInfoVoiture().getMatricule().equalsIgnoreCase(matricule));	
			res = true;
			break;
		}
		return res;
	}

	public boolean garer(Voiture v) {
		boolean res = false;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i]==null) {
			v.setVitesse(0);
			tab[i]=v; 
			res = true;
			break;
		}
		}
		return res;
	}

	public Parking(String nom, Voiture[] tab) {
		this.nom = nom;
		this.tab = tab;
	}

	@Override
	public String toString() {
		return "Parking [nom=" + nom + ", tab=" + Arrays.toString(tab) + "]";
	}

}
