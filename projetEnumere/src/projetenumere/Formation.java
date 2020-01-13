package projetenumere;

public enum Formation {
	
	java(500, "Paris"),
	python(300, "Marseille"),
	cpp(100),
	html(0),
	csharp(5); // point virgule
	
	private int prix;
	private String lieu ="NA";
	
	//constructeur
	private Formation (int prix, String lieu){ // constructeur 
		this.prix=prix;
		this.lieu=lieu;
		}
	
	private Formation (int prix){ // constructeur par defaut
		this.prix=prix;
		}
		
		private Formation() {
		
		}

	//Accesseurs
	
	public int getPrix(){
		return prix;
	}

	public String getLieu() {
		return lieu;
	}
	
	public String toString (){ // on l a codé car par defaut le toString affiche JAVA tt court qui est le nom(name)
	return "nom:  " +name()+" lieu: "+lieu +" prix: "+ prix; //on a ajouter la methode name 
}
}
