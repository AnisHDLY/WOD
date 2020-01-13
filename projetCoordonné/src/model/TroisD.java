package model;

public class TroisD extends DeuxD {

	private int z;

	public TroisD(int a, int b, int z) { // on doit remettre les attribus en
		// super (); constructeur implicite // protected
		// this.x=x;
		// this.y=y;// ou super(x,y) constructeur de la m�re
		super(a, b);
		this.z = z;
	}

	public String toString() {
		return super.toString() + " z" + z; // "DeuxD [x=" + x + ", y=" + y +
											// "]";
	}

}
