package user;

import model.A;
import model.B;
import model.C;
import model.D;

public class Test {

	public static void main(String[] args) {
		test5();

	}

	static void test5() {
		A a = new A();
		System.out.println(a.toString());

	}

	static void test4() {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		a.m();
		b.m();
		c.m();
		d.m();

	}

	static void test3() {
		C c = new C();
		c.m3();
		c.m();
		c.m1();

	}

	static void test2() {
		B b = new B();
		b.m1();
		b.m2();
	}

	static void test1() {
		A a = new A();
		a.m1();

	}

}
