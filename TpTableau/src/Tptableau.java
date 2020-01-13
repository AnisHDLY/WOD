import java.util.Scanner;

public class Tptableau {

	public static void main(String[] args) {
		//tptableau ();
		//testDoubleTableauv2();
		//Tpoccurence();
		//Tpreverse();
		//Testsplit();
		tpTraitementTextJacky();
		//tpTrie();
		
	}

	
	
	
	static void tpTraitementTextJacky() {
		Scanner clavierStr = new Scanner(System.in);
		System.out.print("Veuiller saisir une phrase : ");
		String saisie = clavierStr.nextLine();
		String resultat = traitementTextJacky(saisie);
		System.out.println("La nouvelle phrase est : " + resultat);
	}

	static String traitementTextJacky(String str) {

		String[] T1 = str.split(" "); // le tableau T1 contient les élements du
		String[] T2 = reverseString(T1);// Tableau retourné
		
		String str2 = assembleTableau(T2); // formation d'un string à partir du
											// tableau

		return str2.toUpperCase(); //traitement pour renvoyer le resultat
	}

	static String[] reverseString(String[] X) {
		String[] Y = new String[X.length];
		for (int i = 0; i < Y.length; i++) {
			Y[Y.length - i - 1] = X[i];
		}
		return Y;
	}

	static String assembleTableau(String[] T) {
		String Str = "";
		for (String s : T)
			Str += s + " ";
		return Str;
	}
						
				
	
	
	static void Testsplit(){
		
		String sepa =";";
		String str="aa;bb;cc dd-ee;ff";
		String [] tab= str.split (sepa);
		for (String s:tab)
			System.out.println(s);
	}
	
	
	static void Tpreverse(){
		int[] tab1 = { 10, 20, 30, 40,};
		int []tab2 = reverse(tab1);
		System.out.println("avant reverse");
		afficheTableau(tab1); 
		System.out.println("après reverse");
		afficheTableau(tab2);
	}
	
	static int [] reverse(int [] X){
		int[]Y= new int [X.length];
		for (int i=0; i<Y.length; i++){
			Y[i]= X[Y.length-i-1];	
	}
	return Y;		
	}
	
	
	static void Tpoccurence (){
		int[] tab = { 1, 2, 1, 3,5,2,0,1 };
		System.out.println("choisir un élement du tableau: \n"  );
		afficheTableau(tab); // methode surchargé auparavant
		Scanner clavier =new Scanner (System.in);
		int choix = clavier.nextInt();
		int reponse = occurence (tab, choix); 
		System.out.println("apparait : "+reponse+" fois");
	}	
	
	static int occurence (int []x, int y) {
		int j = 0; // compteur
		for (int i=0; i<x.length; i++) {
			if (x[i] ==y)  
			j++;
		}
			return j; 
		 
	}	
		
		
	
	
	static void testDoubleTableauv2() {
		int[] tab1 = { 10, 20, 30, 40 };
		afficheTableau(tab1);// 10 20 30 40
		int[] tab2=doubleTableau(tab1);
		afficheTableau(tab2);// 20 40 60 80
	}
	static int[] doubleTableau(int[] x) {
		int[] y = new int[x.length];
		for (int i = 0; i < x.length; i++)
			y[i] = x[i] * 2;
		return y;
	}
		
		
	
	static void afficheTableau(int[] x){
	for (int e:x)
		System.out.print(e +"\t");
		System.out.println();
}
	
	static void tpTableaujacky() {
		Scanner clavier = new Scanner(System.in);
		System.out.print("Veuillez saisir la taille du tableau (de chaine) souhaitée: ");
		int taille = clavier.nextInt();

		String[] Tab = new String[taille];
		Scanner clavierStr = new Scanner(System.in);
		for (int i = 0; i < Tab.length; i++) {
			System.out.print("Veuillez saisir l'élément n°" + (i + 1) + " du tableau:");

			Tab[i] = clavierStr.nextLine();

		}

		System.out.println("Voici un affichage du tableau demandé:");
		 for (int i = 0; i <Tab.length; i++)
		 System.out.println("element " + (i +1)+ " : " + Tab[i]);


	}
	
	
	}
		
	
	
	
	
	


