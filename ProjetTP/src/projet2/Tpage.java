package projet2;

import java.util.Scanner;

public class Tpage {

	public static void main(String[] args) {
		tpage();
	}

	static void tpage() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("age??");
		int age = clavier.nextInt();
		if (age < 0 && age > 120)
			System.out.println("erreur");
	}

}
