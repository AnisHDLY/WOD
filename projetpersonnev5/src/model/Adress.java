package model;

public class Adress {

	private int numero;
	private String rue;
	private String cp;

	public Adress(int numero, String rue, String cp) {
		this.numero = numero;
		this.rue = rue;
		this.cp = cp;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String toString() {
		return "Adress numero=" + numero + ", rue=" + rue + ", cp=" + cp + "";
	}

}
