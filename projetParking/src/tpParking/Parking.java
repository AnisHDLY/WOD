package tpParking;

import java.util.Arrays;

public class Parking {
	private String nom;
	private Voiture tab[];

	// constructeur

	public Parking(String nom, int taille) {
		this.nom = nom;
		tab = new Voiture[taille];
	}

	@Override
	public String toString() {
		String res = "\t" + nom + "\n";
		for (Voiture v : tab)
			if (v != null)
				res += v.toString() + "\n";
		return res;
	}

	public boolean garerv(Voiture v) {
		boolean reponse = false;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == null)
				v.setVitesse(0);
			tab[i] = v;
			reponse = true;
			break;
		}
		return reponse;
	}

	public boolean quitterv(String matricule) {
		boolean reponse = false;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] != null && tab[i].getInfoVoiture().getMatricule().equalsIgnoreCase(matricule)) {
				tab[i] = null;
				reponse = true;
				break;
			}

		}
		return reponse;
	}

	public int getCountv() {
		int compteur = 0;
		for (Voiture v : tab) {
			if (v != null)
				compteur++;
		}
		return compteur;
	}
	
	public int getCountm(String marque){
		int compteur=0;
		for (Voiture v:tab)
			if (v!=null && v.getInfoVoiture().getMarque().equalsIgnoreCase(marque)){
				compteur++;
			}		
		return compteur;
	}

	public int getCount() {
		int compteur = 0;
		for (Voiture v : tab)
			if (v != null)
				compteur++;
		return compteur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Voiture[] getTab() {
		return tab;
	}

	public void setTab(Voiture[] tab) {
		this.tab = tab;
	}

	public boolean quitter(String matricule) {
		boolean res = false;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] != null && tab[i].getInfoVoiture().getMatricule().equalsIgnoreCase(matricule))
				;
			res = true;
			break;
		}
		return res;
	}

	public boolean garer(Voiture v) {
		boolean res = false;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == null) {
				v.setVitesse(0);
				tab[i] = v;
				res = true;
				break;
			}
		}
		return res;
	}

}
