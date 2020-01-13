package projetCommande;

import java.util.Scanner;

public class TestCommande {

	public static void main(String[] args) {
		// test1();
		// test2();
		// test3();
		passerCommande();

	}

	static void passerCommande() {
		// Dessert
		Scanner sc3 = new Scanner(System.in);
		Desserts[] tab3 = Desserts.values();
		System.out.println("veuillez choisir votre dessert: ");
		for (Desserts d : tab3)
			System.out.println(d.name());
		String choixDessert = sc3.nextLine();
		sc3.close();

		Scanner sc4 = new Scanner(System.in);
		Plats[] tab4 = Plats.values();
		System.out.println("veuillez choisir votre plat: ");
		for (Plats d : tab4)
			System.out.println(d.name());
		String choixPlat = sc4.nextLine();

		Scanner sc5 = new Scanner(System.in);
		Boisson[] tab5 = Boisson.values();
		System.out.println("veuillez choisir votre plat: ");
		for (Boisson d : tab5)
			System.out.println(d.name());
		String choixBoisson = sc5.nextLine();
		sc5.close();

		System.out.println("veuillez choisir votre facture (simple ou d�taill�e): S ou D ");
		String choixFacture = new Scanner(System.in).nextLine();

		Commande c = new Commande("Anis", Boisson.valueOf(choixBoisson), Plats.valueOf(choixPlat),
				Desserts.valueOf(choixDessert));
		System.out.println("Prix Total:" + c.getPrixTotal());

		if (choixFacture == "S")
			System.out.println(c.toString());
		else
			System.out.println(c.toStringdetail());
	}

	static void test4() {
		// Dessert
		Scanner sc3 = new Scanner(System.in);
		Desserts[] tab3 = Desserts.values();
		System.out.println("veuillez choisir votre dessert: ");
		for (Desserts d : tab3)
			System.out.println(d.name());
		String choixd = sc3.nextLine();

	}

	static void test3() {
		// Dessert
		Scanner sc3 = new Scanner(System.in);
		Desserts[] tab3 = Desserts.values();
		System.out.println("veuillez choisir votre dessert: ");
		for (Desserts d : tab3)
			System.out.println(d.name());
		String choixd = sc3.nextLine();

	}

	static void test2() {
		// boisson
		Scanner sc2 = new Scanner(System.in);
		Boisson[] tab2 = Boisson.values();
		System.out.println("veuillez choisir votre boisson: ");
		for (Boisson b : tab2)
			System.out.println(b.name());
		String choixb = sc2.nextLine();

	}

	static void test1() {
		// Plats
		Scanner sc1 = new Scanner(System.in);
		Plats[] tab1 = Plats.values();
		System.out.println("Veullez choisir votre plat: ");
		for (Plats p : tab1)
			System.out.println(p.name());
		String choixp = sc1.nextLine();
	}

}
