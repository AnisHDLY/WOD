package user;

import model.Adress;
import model.Personne;

public class TestPersonnev5 {

	public static void main(String[] args) {
		test1();

	}

	static void test1() {
		Adress adr = new Adress(161, "verdun", "94200");
		Adress adr1 = new Adress(162, "verdun", "94200");
		Personne p = new Personne("dupond", "toto");
		Personne p1 = new Personne("durant", "toto");

		// p.setAdress(new Adress(161, "verdun", "94200"));important
		p.setAdress(adr);

		adr1.setPersonne(p);

		System.out.println(p.getAdress().getCp());
		System.out.println(adr.getPersonne().getNom());
	}
}
