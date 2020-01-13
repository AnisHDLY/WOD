package projetPersonnev1;

public class Personne {
	
	// attribu
	private String nom;
	private String prenom;// public: accessible depuis l exterieur
	private int age; // private: bloque l acces direct de l exterieur, non
						// accessible de l exterieur depuis une instance
	// variable globale
	private final int ageMax = 120;
	private final int ageMin = 0;
	// String status;
	// int ageMineur = 18;
	
	

	// setteur nom
	public void setNom(String nom){
	if (!nom.isEmpty())
		this.nom = nom;
	}

	// getteurprenom
		public String getPrenom() {
			return prenom.toLowerCase(); 	
	}
		

	public String getNom() {
			return nom;
		}

	// setteurage
	public void setAge(int age) {// externaliser l age = setter de l age
		if ((age >= ageMin) && ageMax < 120 && age > this.age)
			this.age = age;
	}

	
	// getteurage
	public int getAge() { // ne prend jamais de parametre entre ()
		return age;
	}

	
	public Personne() { // creation d une personne avec zero parametre
	}

	public Personne(String nom, String prenom) {// constructeur d initialisation

		this.nom = nom;
		this.prenom = prenom; // this renvoi � un attribu
	}

	public Personne(String nom, String prenom, int age) {// constructeur avc age													// en plus
		this.nom = nom;
		this.prenom = prenom;
		setAge(age);
		// this.age=age ;
	}

	public String toString() { // normalis� d'une maani�re general
		String reponse = "NOM: " + nom;
		reponse += "PRENOM : " + prenom;
		reponse += "AGE: " + age;
		// reponse += "\nSTATUS: ";
		// reponse += (age < ageMineur) ? "MINEUR " : "majeur"; //condotion
		// ternaire ? :

		return reponse;
	}
}
