package user;

import model.Rib;
import model.Salarie;

public class TestSalarié {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rib r = new Rib("CA", "abcd12");
		Salarie s = new Salarie(1, "aa", "bb", r, 6);
		System.out.println(s);

	}
}
