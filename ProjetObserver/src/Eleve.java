
public class Eleve {
	private String nom;
	private int note;
	
	private Professeur p;
	
	
	public Eleve(String nom, int note) {
		this.nom = nom;
		this.note = note;
	}
	
public void notif() {
	p.getNote();
}

	
	public String toString() {
		return "la note de: "+ nom + "est:"  + note; 
	} 
	
	
	
	
	

}
