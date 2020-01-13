package user;

import model.Rib;
import model.Salarie;

public class Test {

	public static void main(String[] args) {
		Rib r=new Rib("CA", "abcd12");
		Salarie s=new Salarie(1, "aa", "bb", r, 6);
		System.out.println(s);

	}

}
