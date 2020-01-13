package projetPersonnev1;

public class Test {

	public static void main(String[] args) {
		test1();
		test2();
		// test3();
		// test4();
		// test5 ();
		test6();
	}

	static void test6() {
		Personne p1 = new Personne();
		p1.nom = "dupond";
		p1.prenom = "titi";

		Personne p2 = new Personne();
		p2.nom = "durond";
		p2.prenom = "toto";

		Personne p3 = new Personne();
		p3.nom = "durond";
		p3.prenom = "titi";

		// System.out.println(p1.getInfo());
		// System.out.println(p2.getInfo());
		// System.out.println(p3.getInfo());

		// Personne[] tab=new Personne[3];
		Personne tab[] = { p1, p2, null, p3 };
		// for (Personne p :tab )
		// if (p != null)
		// System.out.println(p.getInfo());
		for (int i = 0; i < tab.length; i++)
			if (tab[i] != null)

				// System.out.println(tab[i].getInfo());
				tab[0].nom = "machine";
		tab[1].nom = "Anis";
		System.out.println(p1.getInfo());
		System.out.println(p2.getInfo());
	}

	static void test5() {
		Personne p1 = new Personne();
		p1.nom = "dupond";
		p1.prenom = "toto";

		Personne p2 = new Personne();
		p2 = p1;

		System.out.println(p2.getInfo());
		// p1 = null;
		// p2 = p1;
		System.out.println(p2.getInfo());
		System.out.println(p1.getInfo());
	}

	static void test4() {
		Personne p1 = new Personne();
		p1.nom = "dupond";
		p1.prenom = "toto";
		Personne p2 = p1; // copie de la reference
		p2.prenom = "titi";
		System.out.println(p1.getInfo());
	}

	static void test3() {

		Personne p;// 1) d�claration
		p = new Personne(); // 2 cr�ation d une instance � la classe Personne
		// 3) valeur par defaut

		// 4) valeur utilisateur
		p.nom = "dupond";
		p.prenom = "toto";
		// p=null; // pour liberer de l espace ou annuler p
		System.out.println(p.getInfo());

	}

	static void test2() {
		Personne p2 = new Personne();

		p2.nom = "dupond";
		p2.prenom = "toto";
		p2.age = 30;
		System.out.println(p2.getInfo());

	}

	static void test1() {
		Personne p = new Personne(); // cr�ation d'une personne constructeur

		p.nom = "dupond";
		p.prenom = "toto";
		p.prenom = "titi";
		p.age = 10;
		System.out.println(p.getInfo());

		p = null; // pour liberer de l espace ou annuler p
		// � suivre
	}
}
