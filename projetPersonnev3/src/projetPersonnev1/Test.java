package projetPersonnev1;

public class Test {

	public static void main(String[] args) {
		//test1();
		//test2();
		//test3();
		//test3(); 
		test4();
			
	}
	
	static void test4() {
		Personne p = new Personne("dupond ","toto " );// cr�ation d'une personne [newPersonne()]=constructeur
		System.out.println(p);
		p.setNom("durant");
		System.out.println(p.getNom());
		//System.out.println(p);
		//p.setNom("");
		//System.out.println(p);
	}	
										
		
	
	static void test3() {
		Personne p = new Personne("dupond ","toto " ); // cr�ation d'une personne [new
										// Personne()]=constructeur
		p.setAge (10);
		System.out.println(p.getAge());
		System.out.println(p);
		
		//String str= p+""; //appel implecite
		
		System.out.println(p.toString());// appel explicite
		
		new Personne(); // instance anonyme
	}
	
	
	static void test2() {
		Personne p = new Personne("dupond ","toto ", 10 ); // cr�ation d'une personne [new
										// Personne()]=constructeur
		
		System.out.println(p.toString());
		System.out.println(p);
		p.setAge (10);
		//String str= p+""; //appel implecite
		
		System.out.println(p.toString());// appel explicite
		
		new Personne(); // instance anonyme
	}

	static void test1() {
		Personne p = new Personne("dupond ","toto ", 10 ); // cr�ation d'une personne [new
										// Personne()]=constructeur
		
		System.out.println(p.toString());
		System.out.println(p);
		p.setAge (10);
		//String str= p+""; //appel implecite
		
		System.out.println(p.toString());// appel explicite
		
		new Personne(); // instance anonyme

	}
}
