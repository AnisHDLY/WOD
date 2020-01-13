package projetenumere;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// testSemaine();
		// testCivilit�();
		// testCivilit�v2();
		// testFormationv1();
		// testFormationv2();
		// testFormationv3();
		// testFormationv4();
		testFormationv5();
	}

	static void testFormationv5() {

		Scanner sc = new Scanner(System.in);
		Formation[] tab = Formation.values(); // afficher le tab de tte les
												// formation

		System.out.println("choisir depuis la liste");
		for (Formation f : tab)
			System.out.println(f.name() + "\t");
		String choix = sc.nextLine();
		// Formation x = Formation.valueOf(choix); // valueof
		// System.out.println(x);
	}

	static void testFormationv4() {

		Formation f = Formation.java;
		System.out.println(f.toString());
		System.out.println(f.name());
	}

	static void testFormationv3() {

		Formation f = Formation.java;
		System.out.println(f.getPrix());
		System.out.println(Formation.python + " " + Formation.python.getLieu() + " " + Formation.python.getPrix());
	}

	static void testFormationv2() {

		Formation f = Formation.java;
		System.out.println(f.getPrix());
		System.out.println(Formation.python + " " + Formation.python.getLieu() + " " + Formation.python.getPrix());
	}

	static void testFormationv1() {

		System.out.println(Formation.java);
		Formation f = Formation.python;
		System.out.println(f.toString());
		System.out.println(f.name());
	}

	static void testCivilit�v2() {
		Civilit� mrbis = Civilit�.mr;
		String str = Civilit�.mr.toString();
		System.out.println(str);
	}

	static void testCivilit�() {
		System.out.println(Civilit�.mr);
		System.out.println(Civilit�.mr);
	}

	static void testSemaine() {
		System.out.println(Semaine.we);
	}

}