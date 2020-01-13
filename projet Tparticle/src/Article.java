
public class Article {
	
	private String marque;
	private int prix ;
	private String status ;
	
	private final int prixMin =0;
	private final int prixPivot =100;
	 
	


	public Article (String marque, int prix){ // constructeur
		this.marque=marque;
		setPrix(prix);
	}
	
	public Article (String marque){ // constructeur
		this.marque=marque;
	}	
	
	
	public int getPrix() {
			return prix;
		}
	
	public void  setPrix (int prix){
		if (prix > prixMin) {
			this.prix=prix;
		computeStatus();
		}
	}
	private void computeStatus(){
		if (prix <prixPivot)
			status ="pas cher";
			else
				status ="produit cher ";
	}
	
	
		
	
		
	
	
	public String toString() { // normalisé d'une maanière general
		String reponse = "MARQUE: " + marque;
		reponse += "PRIX : " + prix;
		reponse += "STATUT: " + status;
		return reponse;
}
}
		
