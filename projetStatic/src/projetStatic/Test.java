package projetStatic;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test4();

	}
	
	static void test4() {
		Personne p1 = new Personne("toto");
		Personne p2 = new Personne("titi");
		new Personne("titi");
		new Personne("titi");
		System.out.println(Personne.getCompteur());
		
	}	

	static void test3() {
		Personne p1 = new Personne("toto");
		Personne p2 = new Personne("titi");
		
		p1.setPrenom("abcd");
		System.out.println(p1);
		System.out.println(p2);
		
		Personne.setNom("durand");
		System.out.println(p1);
		System.out.println(p2);
			

	}

	static void test2() {
		double resultat = Traitement.calcul(10, 12, "+");
		System.out.println(resultat);

	}

	static void test1() {
		A.m1();
		A a = new A();
		a.m3(); // appeler une methode d instance
		a.m1(); // Random r = new Random(); appeler une methode d instance
		new A().m4(); // int x = r.nextInt(10);

	}

}
