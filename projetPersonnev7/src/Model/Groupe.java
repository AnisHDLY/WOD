package Model;

public class Groupe {
	private String nom;
	private Personne[] tab;

	public Groupe(String nom, int taille) {
		this.nom = nom;
		tab = new Personne[taille];
	}

	public boolean retirer(int id) {
		boolean res = false;
		for (int i = 0; i < tab.length; i++)
			if (tab[i] != null && id == tab[i].getId()) {
				res = true;
				break;
			}
		return res;

	}

	public boolean ajouter(Personne p) {
		boolean res = false;
		for (int i = 0; i < tab.length; i++)
			if (tab[i] == null) {
				tab[i] = p;
				res = true;
				break;
			}
		return res;
	}

	public String toString() {
		String reponse = "Groupe [nom= " + nom;
		for (Personne p : tab)
			if (p != null)
				reponse += "\n" + p;
		return reponse;
	}

	public int getCount() {
		// chercher le nombre de personne au sein fu tableau
		int compteur = 0; // compteur
		for (Personne p : tab)
			if (p != null)
				compteur++;
		return compteur;
	}

	public int getCount(String nom) {
		// rechercher le nombre de personne du mm nom au sein du tableau
		int compteur = 0; // compteur
		for (Personne p : tab)
			if (p != null && p.getNom().equalsIgnoreCase(nom))// il faut
																// externaliser
																// un getteur
																// car ne nom
																// est ds la
																// classe
																// personne
				compteur++;
		return compteur;
	}

}
