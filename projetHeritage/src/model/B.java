package model;

public class B extends A {

	public void m2() {
		System.out.println("je suis m2) de B ");
	}

	public void m() {
		System.out.println("je suis m de B ");
	}

	public String toString() {
		return super.toString() + " c est la toString de B ";
	}

}
