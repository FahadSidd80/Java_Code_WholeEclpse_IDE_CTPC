package pack2;
import pack1.*;
//import pack1.A;
//import pack1.C;// C is default class so it not visible in other package

public class B  {

	public static void main(String[] args) {
		A x = new A();
		x.m1();
		A.m1();
		
//		hello-- public class class A accessible anywhere
//		hello-- public class class A accessible anywhere
		
//		C c = new C();
//		c.m2();
	}

}
