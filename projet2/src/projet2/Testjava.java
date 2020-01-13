package projet2;

import java.util.Scanner;

public class Testjava {

	public static void main(String[] args) {
		
		//m1();// appel de la methode
		//hello("toto"); 
		//hello("titi"); 
		//testhello ();
		//testinfo ();
		//TpCalculSalaire (); 
		//Testswap();
		//Testsomme(); 
		//Testadd();
		//Testaffiche(); 
		testCalculJacky();
	}
	
	static void Testaffiche(){  // le test affiche va appeler une methode qui s appelle affiche en dessous
		
		affiche("toto");
		affiche("String nom");
	}
	
	static String affiche(String nom){
		System.out.println("hello"+ nom);
		return "a bientot"; 
	}
	
	static void affiche(){
		System.out.println("hello");
		
	}
	
	//static void affiche(String nom){
		//System.out.println("hello"+ nom);
	//}
	
	static void affiche(String nom, String prenom){
		System.out.println("hello nom: " +nom+ "prenom: "+ prenom);
	}
	
	//static void affiche(String nom, String adresse){
		//System.out.println("hello nom: " +nom+ "adresse: "+ adresse);
	//}
	
	static void Testadd(){
		int resultat= add(10,15);
		System.out.println("resultat:  "+ resultat);
		System.out.println("resultat:  "+add(15,15)); //deuxieme methode
	}
	
	static int add(int a, int b){
		int res= a+b;
		return res; // une methode pour retourner
		//System.out.println("res: "+res);
		
	}
	static void Testsomme(){
		somme (10,15);
		somme (12,15);
		
	}
	static void somme(int a, int b){
		int res= a+b;
		System.out.println("res: "+res);
		
	}
	
	static void Testswap(){
		int x=10; 
		int y=15; 
		System.out.println("x:   " +x+ "y: " + y);
		swap(x,y); 
		System.out.println("x:   " +x+ "y:  " + y);
		
	}
	static void swap(int a, int b) {
		
	}
	
	static void TpCalculSalaire(){
		
		Scanner c=new Scanner(System.in);	
		Scanner c2 = new Scanner(System.in);
		System.out.println("Saisir le nom");
		//saisir nom
		String nom = c.nextLine().toUpperCase();
		//saisir salaire brut annuel
		System.out.println("Saisir le salaire brut annuel");
		double salaire = c2.nextDouble();
	
		//Afiche le nom et le salaire mensuel net
		//Appel de la méthode CalculSalaire
		CalculSalaire(nom,salaire);
		
		
	}
	//Dev
	static void CalculSalaire(String nom, double salaire){
	
		//Calcul Salaire(nom, salaire)divisé par 12 - 23%
		double sal = (salaire-(salaire*0.23))/12;
		System.out.println("Monsieur "+ nom+" votre salaire net est de :"+sal);
	}
	
	
	
		
	static void testinfo () {
		String  nom, prenom ;	int age ;
		Scanner clavier = new Scanner (System.in);
		Scanner clavier1 = new Scanner (System.in);
		
		prenom = clavier.nextLine();
		System.out.println("donner votre nom: ");
		nom = clavier.nextLine();
		System.out.println("donner votre prenom: ");
		age = clavier1.nextInt ();
		System.out.println("Donner votre age: ");
		
		
	}
	static void info (String nom, String prenom, int age) {
		String resultat ="Nom:  " +nom.toUpperCase() + "\t" ;
	     resultat +="Prenom: "+ prenom.toLowerCase() + "\n" ;
	     resultat +="Age:    "  + age + "\n" ; 
	     resultat +="Statut: " + ((age<18)? "mineur": "majeur") ;
	     System.out.println( resultat);
	}
	
		static void hello(String nom) { // x est un parametre
			String reponse ="hello\t"+nom; 
		    System.out.println("reponse");
		    
	}
		static void testhello () {
			hello ("toto");
			String s= "titi";
			String nom = "abc"; 
			hello (s);
			hello (nom); 
		}

	static void m1() {  // la signature void = zero de valeur de retour
			System.out.println("m1");
			
			
		}
	
	
	static void testCalculJacky() {
		Scanner clavier = new Scanner(System.in);
		System.out.print("Veuillez saisir les deux opérandes\n 1er opérande :");
		double op1 = clavier.nextDouble();
		System.out.print("2ème opérande  (autre que 0 pour la division):");
		double op2 = clavier.nextDouble();

		Scanner clavierstr = new Scanner(System.in);
		System.out.println(
				"Veuillez choisir  dans la liste suivante l'opérateur voulu:\n +/add\t -/sous\t */mult\t / div");
		String operateur = clavierstr.nextLine();
		double r= calcul(op1, op2, operateur);
		String str="le résultat de l'opération : " + op1 + " " + operateur + "" + op2 + " = " + r;
		System.out.println(str);
	}

	static double calcul(double op1, double op2, String operateur) {
		double resultat=0 ;
		switch (operateur) {
		case "+":
		case "add":
			resultat = op1+op2;
			break;
		case "-":
		case "sous":
			resultat = sous(op1, op2);
			break;
		case "*":
		case "mult":
			resultat = mult(op1, op2);
			break;
		case "/":
		case "div":
			resultat = div(op1, op2);
			break;

		}

		return resultat;

	}

	static double sous(double a, double b) {
		return a - b;
	}

	static double mult(double a, double b) {
		return a * b;
	}

	static double div(double a, double b) {
		return a / b;
	}

	static double add(double a, double b) {
		double res = a + b;
		return res;
	}



}


