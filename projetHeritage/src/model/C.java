package model;

public class C extends A {

	public void m3() {
		System.out.println("je suis m3 de C ");
	}

	public void m() {
		System.out.println("je suis m de C ");
		super.m1();// super fait appel a la methode de m�re et monter un cran
	}

}
