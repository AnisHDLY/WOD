package projet1;

import java.util.Random;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// menu();
		// testFor();
		// tpBoucle();
		// tpBoucle2();
		// TpPuissance ();
		// testwhile () ;
		// dowhile ();
		testrandom();

	}

	public static void testrandom() {
		Random r = new Random();
		Scanner clavier= new Scanner (System.in);
		
		int nb = r.nextInt(10);
		int compteur= 0 ;
		System.out.println(res);
		System.out.println("saisir le chiffre � deviner entre 0 et 10:  ");
		
		int s=0; int i= 10;
		do {
		
		s+=i;
		i++;
		}
		while (i != res); 
		System.out.println("saisir un chiffre inferieur:  " );
		
		
		
		}
	     
		
	public static void dowhile (){
		int s=0; int i= 100;
		do {
		s+=i;
		i++;
		System.out.println("i= "+i);
		}while(true);
	}

	public static void testwhile() {
		int s = 0;
		int i = 0;
		while (i < 10) {
			s += i;
			i++;
		}
		System.out.println("i : " + i);

	}

	static void TpPuissance () {
		Scanner clavier = new Scanner(System.in);
		System.out.println("saisir puissance");
		String puissance = clavier.nextLine();
		System.out.println("tapper un nombre: ");
		
		
	}

	static void tpBoucle2() {
		Scanner clavier = new Scanner(System.in);
		Scanner clavier2 = new Scanner(System.in);

		System.out.println("saisir caract�re");
		String caract�re = clavier.nextLine();
		String resultat = "";
		System.out.println("saisir la hauteur");
		int hauteur = clavier.nextInt();
		System.out.println("saisir la largeur");
		int largeur = clavier.nextInt();

		for (int j = 0; j < hauteur; j++) {
			for (int i = 0; i < largeur; i++)
				resultat += caract�re + "\t";
			resultat += "\n";
			System.out.println("resultat");
		}
	}

	static void tpBoucle() {
		Scanner clavier = new Scanner(System.in);
		Scanner clavier2 = new Scanner(System.in);

		System.out.println("saisir caract�re");
		String caract�re = clavier.nextLine();
		System.out.println("saisir la hauteur");
		int hauteur = clavier.nextInt();
		System.out.println("saisir la largeur");
		int largeur = clavier.nextInt();

		for (int j = 0; j < hauteur; j++) {
			for (int i = 0; i < largeur; i++)
				System.out.print(caract�re + "\t"); // "\t" tabulation
			System.out.println("\n");
		}

	}

	static void testFor() {
		int x = 10;
		for (int i = 0; i < 10; i++) {
			x--;
			if (x == 5)
				break;
		}
		System.out.println(x);

		for (int i = 0; i < 10; i++) {
			if (i == 5)
				continue;
			System.out.println(i);
		}

	}

	static void menu() {

		System.out.println("1 testSwitch 2 tpage 3....");
		Scanner clavier = new Scanner(System.in);
		int saisie = clavier.nextInt();
		switch (saisie) {
		case 1:
			testSwitch();
			break;
		case 2:
			tpage();
			break;
		default:
			System.out.println("erreur de saisie");
		}
	}

	static void testSwitch() {

		System.out.print("Donner un nombre:\n");
		Scanner clavier = new Scanner(System.in);
		int nb = clavier.nextInt();
		switch (nb) {
		case 1:
			System.out.println("Lundi");
			System.out.println("debut de la semaine");
			break;
		case 2:
			System.out.println("Mardi");
			break;
		case 3:
			System.out.println("Mercredi");
			break;
		case 4:
			System.out.println("jeudi");
			break;
		case 5:
			System.out.println("vendredi");
			break;
		case 6:
			System.out.println("We");
			break;
		case 7:
			System.out.println("We");
			break;
		default:
			System.out.println("Autrement");
			break;
		}
	}

	static void m10() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("age?????");
		int age = clavier.nextInt();
		String reponse;
		if ((age < 18))
			System.out.println("mineur");
		else
			System.out.println("majeur");
		reponse = (age < 18) ? "mineur" : "majeur"; // re
		System.out.println("reponse");
	}

	static void m9() {

		int a = 10;
		int b = 10;
		if (a == b) {

		}
		System.out.println("afficher a");
	}

	static void testegaliteString() {
		String s1 = "toto";
		String s2 = "titi";
		// if (s1==s2)
		if (s1.equals(s2))
			System.out.println("ok"); // tu affiches
		else
			System.out.println("ko");

	}

	static void tpage() {
		Scanner clavier = new Scanner(System.in); //
		Scanner clavier2 = new Scanner(System.in);

		System.out.println("quel est votre age?");
		int age = clavier.nextInt();
		System.out.println("quel est votre nom?");
		String nom = clavier2.nextLine();

		int ageMin = 0;
		int ageMax = 120;
		int ageMineur = 18;
		int ageMajeur = 50;

		String status = nom + "\t" + age;
		if ((age >= 0) && (age < 18))
			status += " vous �tes mineur!";
		else if ((age >= 18) && (age < 50))
			status += " vous etes majeur!";
		else if ((age > 50) && (age < 120))
			status += " vous etes majeur senior!";
		else
			status += " erreur de saisie";

		System.out.println(status);

	}

	static void m8() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("age?????");
		int age = clavier.nextInt();
		if ((age < 18))
			System.out.println("mineur");
		else
			System.out.println("majeur");
		System.out.println("a bientot");

	}

	static void m7() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("age?????");
		int age = clavier.nextInt();
		if (age < 18) {
			System.out.println("mineur");
		}
		System.out.println("a bientot");

	}

	static void m6() {
		System.out.println("nom?????");
		Scanner clavier = new Scanner(System.in);
		String nom = clavier.nextLine();
		String s = "bienvenue " + nom;
		System.out.println(s);
	}

	static void m5() {
		int a = 5;
		int b;
		b = a++;
		System.out.println(a);
		System.out.println(b);
		b = ++a;
		System.out.println(a);
		System.out.println(b);
	}

	static void m4() {
		int a = 10;
		// a=a+20;
		a += 20;
		String s = "bonjour ";
		s += "toto";
		System.out.println(s);
	}

	static void m3() {
		String s1 = "bonjour";
		String s2 = "toto";
		String s3 = s1 + s2;
		System.out.println(s3);
		String s4 = "" + 2 + 0;
	}

	static void m1() {
		System.out.println("je suis m1");
		String str = "1";
		int a = Integer.parseInt(str);

		double b = 10.5;
		String c = "toto";
		char d = 'a';
		boolean e = false;

	}

	// cest la methode qui fait ....
	static void m2() {
		System.out.println("je suis m2");
		int x = 0;
		// System.out.println(x);
	}

}
