package projetPersonnev1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//test1();
		//test2();
		test3();

	}

	static void test3() {
		Personne x = new Personne("toto: ", "titi: ", 10);
		Personne tab [] = { new Personne(),
				            new Personne("aa ", "bb "),
				            new Personne("aa ", "bb ", 10), 
				            x};
		for (Personne z : tab)
			System.out.println(z.getInfo() + "\n----------------------------");

	}

	static void test2() {
		Personne p = new Personne();
		System.out.println(p.getInfo());

	}

	static void test1() {
		Personne p = new Personne(); 
		p.nom = "dupond ";
		p.prenom = "toto ";
		p.age = 10;
		System.out.println(p.getInfo());

		

	}
}
