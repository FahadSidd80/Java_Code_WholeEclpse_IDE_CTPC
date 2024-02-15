
public class Var_arg_Method {
	
//	public static void m1(int... x1) {
//		System.out.println("Var arg methods !!");
//	}
//	
//	public static void m2(int... x) {
//		System.out.println("The no of arguments " + x.length);
//	}
//	
//	public static void sum(int... x) {
//		int total = 0;
//		for(int x1:x) {
//			total = total + x1;
//		}
//		System.out.println("The som of values in array x1 " + total);
//	}
	
//	public static void m1(int[] x) {
//		
//	}
//	
//public static void m2(int []x) {
//		
//	}
//
//public static void m3(int x[]) {
//	
//}
//	public static void m1(int... x) {
//		
//	}
//	
//	public static void m2(int 	...x) {
//		
//	}
	// Syntactical mistake/errors
//	public static void m3(int 	x...) {
//		
//	}
//	public static void m4(int.. 	x.) {
//		
//	}
//	public static void m5(int. 	..x) {
//		
//	}
//	public static void m6(int. 	x..) {
//		
//	}
	
//	public static void m1(int x, int... y) {
//		
//	}
//	public static void m2(String s, double... d) {
//		
//	}
	
//	public void m1(double d, String... S) {
//		
//	}
//	public void m2(String... S, char ch) {
//		
//	}
	
//	public void m1(int...x,double... d) {
//		
//	}
	
//	public static void m1(int... x) {// signature m1(int[])
//		
//	}
//	public static void m1(int[] d) {// signature m1(int[])
//		
//	}
//	public static void m1(int d) {
//		
//	}
//	public static void m2(int d) {
//		
//	}
//	
//	public static void m1(double... d) {
//		
//	}

//	public void m1(int i) {
//		
//	}
//	
//	public int m1(int i) {
//		return 10;
//	}
//	
//	public int m1(int... i ) {
//		return 10;
//	}
//	
//	public static void m1(long... x) {
//		System.out.println("Var arg method-- since 1.5v onward have less priority");
//	}
	
//	public static void m1(int x) {
//		System.out.println("General method since 1.0V -- so have hight priority");
//	}
	
//	public static void m1(int[] x) {
//		System.out.println("1-D int array");
//	}
//	public static void m1(byte[] x) {
//		System.out.println("1-D byte array");
//	}
//	
	
//	public static void m1(int[] x) {
////		System.out.println("Print pass value of m1 " + x[0]);
////		System.out.println("Print pass value of m1 " + x[1]);
////		System.out.println("Print pass value of m1 " + x[2]);
////		System.out.println("Print pass value of m1 " + x[3]);
//		
////		for(int x1: x) {
////			System.out.println(x1);
////		}
//	}
	
//	public static void m1(int... x) {
//		System.out.println("Var - arg methods");
//		for(int x1 : x) {
//			System.out.println("print all value in x1 : "+ x1);
//		}
//	}
//	public static void m1(String... s) {
//		System.out.println("Var - arg methods");
//		for(String x1 : s) {
//			System.out.println("print all value in x1 : "+ x1);
//		}
//	}
	
//	public static void m1(int... x) {
//		for(int x1 : x) {
//			System.out.println(x1);
//		}
//	}
//	
//	public static void m1(int[] x) {
//		for(int x1 : x) {
//			System.out.println(x1);
//		}
//	}

//	public static void m1(int... x) {
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
//		System.out.println(x[3]);
//		for(int x1: x) {
//			System.out.println(x1);
//			
//		}
//	}
//	public static void m1(int[]... x) {
////		for(int x1[] : x) {
////			System.out.println(x[0][0]);
////			System.out.println(x1[0]);
////			System.out.println(x1[1]);
////			System.out.println(x1[2]);
////		}
//		for(int x1[] : x) {
//			System.out.println(x[0][0]);
//			for(int x2 : x1) {
//				System.out.println(x2);
//			}
//			
//		}
//	}
//	
	
	public static void main(String[] args) {
//		public static void main(String... args) {
//		m1();  // Var arg methods !!
//		m1(10);// Var arg methods !!
//		m1(10,20,30);  // Var arg methods !!
//		m1(10,34,45,67);// Var arg methods !!
		
		
//		m2();// The no of arguments 0
//		m2(10);// The no of arguments 1
//		m2(10,20,30);  // The no of arguments 3
//		m2(10,34,45,67);//The no of arguments 4
		
//		int[] x = new int[3] ;
//		
//		System.out.println(x.length);
		
//		sum();
//		sum(10,20);
//		sum(10,20,30);
//		sum(10,20,30,40);
		
//		int[] x = {10,20};
//		int total = 0;
//		for(int x1 : x) {
//			total = total+x1;
//			
//		}
//		System.out.println("The sum od values in  x1 "+ total);// 30
		
		
//	m1();// Var arg method
//	m1(10,20);// Var arg method
//	m1(10);// General method
		
		
//		m1();
//		m1(10);
//		m1(10,20,30);
//		m1(12l);
//		m1(90);
		
//		
//		m1(new int[] {10});
//		m1(new int[] {});
//		m1(new int[] {10,20,30});
//		m1(new int[] {120_23,23_2,3223_21});
		
//		m1();
//		m1(10);
//		m1(10,20,30);
//		m1(new int[] {10});
//		m1(new int[] {10,20,30});
//		m1(new int[] {120,121_21,12_121});
//		m1(new int[] {1210_00,00_00});
		
		
//		m1("");
//		m1(10);
//		m1(10,20,30);
//		m1(new int[] {10});
//		m1(new int[] {10,20,30});
//		m1(new int[] {120,121_21,12_121});
//		m1(new int[] {1210_00,00_00});
//		m1(new String[] {"Fahad","Ali","Siddiqui","","__"});
		
//		m1(10,20,30,40);
		
//		int[] a = {10,20,30,40};
//		int[] b = {90,70,60,20};
//		
//		m1(a,b);
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
