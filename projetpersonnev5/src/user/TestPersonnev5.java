package user;

import model.Adress;
import model.Personne;

public class TestPersonnev5 {

	public static void main(String[] args) {
		// test1();
		// test2();
		// test3();
		// test4();
		test5();

	}

	static void test5() {
		Adress adr = new Adress(161, "verdun", "94200");
		Personne p = new Personne("dupond", "toto", adr);
		p.getAdress().setNumero(162);

		System.out.println(p);
	}

	static void test4() {
		Adress adr = new Adress(161, "verdun", "94200");
		Personne p = new Personne("dupond", "toto", adr);
		p.getAdress().setNumero(49);
		System.out.println(p);
	}

	static void test3() {
		Adress adr = new Adress(161, "verdun", "94200");
		System.out.println(adr);
		adr.setNumero(50);
		System.out.println(adr);
		adr.setCp("35000");
		System.out.println(adr);

	}

	static void test2() {
		Adress adr = new Adress(161, "verdun", "94200");
		Personne p = new Personne("dupond", "toto", adr);
		System.out.println(p);

	}

	static void test1() {
		Personne p = new Personne("dupond", "toto");
		System.out.println(p);
	}
}
