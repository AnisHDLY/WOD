package Model;

public class B extends A {

	public void m2() {
		System.out.println("je suis m4 de B");
		m1();
		// m3();
		m2();// m2 est protected donc on peyt l appeler de l interieur mais pas
				// de l exterieur (test)
	}

}
