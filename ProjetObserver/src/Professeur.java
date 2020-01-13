
public class Professeur {
	private String nom;
	private double note;
	Eleve tab[] = new Eleve[10];
	
	public Professeur(String nom) {
		this.nom = nom;
	}
	
	
	public double getNote() {
		return note;
	}



	private void notifAll () {
		for (Eleve x: tab) {
			if (x =! null)
				x.notif();
		}
		
		
	}
	


}
