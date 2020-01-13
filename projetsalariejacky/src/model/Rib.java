package model;

public class Rib {
	private String banque;
	private String numero;

	public Rib(String banque, String numero) {
		this.banque = banque;
		this.numero = numero;
	}

	public String toString() {
		return "Rib [banque=" + banque + ", numero=" + numero + "]";
	}

}
