package projet_traitement;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
	}
	
	static void testCalculJacky() {
		Scanner clavier = new Scanner(System.in);
		System.out.print("Veuillez saisir les deux op�randes\n 1er op�rande :");
		double op1 = clavier.nextDouble();
		System.out.print("2�me op�rande  (autre que 0 pour la division):");
		double op2 = clavier.nextDouble();

		Scanner clavierstr = new Scanner(System.in);
		System.out.println(
				"Veuillez choisir  dans la liste suivante l'op�rateur voulu:\n +/add\t -/sous\t */mult\t / div");
		String operateur = clavierstr.nextLine();
		double r= Traitement.calcul(op1, op2, operateur); // introduire la nvlle classe prefixer calcul par la classe Traitemnt
		String str="le r�sultat de l'op�ration : " + op1 + " " + operateur + "" + op2 + " = " + r;
		System.out.println(str);
	}

	
	


}

