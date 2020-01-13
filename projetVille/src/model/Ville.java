package model;

public class Ville {
	private String Ville;
	private String capitale;
	private String pays;
	private double nbrhabitant;
	private String categorie;
	private Boolean isCapital;  //commence par is si c est un attribu de type boolean
	
	private final String regle = "0-1-petit;1-3-moyen;3-10-grand";
	private final double nbremin;
	private final double nbremax;
	
	public Ville(String ville, String capitale, String pays, double nbrhabitant) {
		Ville = ville;
		this.capitale = capitale;
		this.pays = pays;
		this.nbrhabitant = nbrhabitant;
	}


	
		
	
}
