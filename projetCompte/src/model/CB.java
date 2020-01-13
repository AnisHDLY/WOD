package model;

public enum CB {
	Amex(5), MC(10), VISA(15);

	private int prix;

	private CB(int prix) {
		this.prix = prix;
	}

}
