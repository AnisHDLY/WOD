package User;

import Model.*;

public class Test {

	public static void main(String[] args) {
		test1();

	}

	static void test1() {
		Groupe g = new Groupe("CGI", 10);
		Personne p1= new Personne (1, "dupond", "aaa", 10);
		Personne p2= new Personne (2, "dupond", "aaa", 10); 
		Personne p3= new Personne (5, "dupond", "aaa", 10); 
		g.ajouter(p1);
		g.ajouter(p2);
		g.getCount();
		boolean b=g.ajouter(p3);
		System.out.println(g);
		// if (b)
		// System.out.println("p3 ok");
		// else
		// System.out.println("p3 ko");
		//

	}

}
