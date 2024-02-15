
public class TypeOfVariable_In_Java {

	
//	String bookname = "Let us C";
//	String Author;
//	float price;
//	
//	
//	static String colname;
//	static int salary;
//	static double tax;
//	static char symbol;
//	static String countryName= "India";
//	static String cityName;
//	
//	static int x = 10;
//	int y =20;
//	
//	int z= 0;
//	static int p = 30;
//	
//	
//	int l =10; // instance - primitive
//	int[] a = new int[3];// instance - reference
//	
//	static String s = "durga";// static- reference
//	static int m = 10; // static - primitive

	
//	int[] x1;
//	int[] x = new int[3];// instance-reference -- array declare,create, but not initialized
	
//	static int[] x1;
//	static int[] z = new int[3]; // static - reference --array declare,create, but not initialized
	
	public static void main(String[] args) {
//		Based upon type of value represneted by variable.
//		1.Primitive
//		2.Non-Primitive/reference variable
		
//		int x= 10; // Primitive
//		TypeOfVariable_In_Java s = new TypeOfVariable_In_Java();// Non-Primitive/reference variable
		
//		Based upon position of declaration and behaviour.
		
//		1. Instance
//		2. Static
//		3. Local -- ctrl+alt+downarrow -- ctrl +D in VS 
		
//		1. Instance
		
//		System.out.println(bookname);//Cannot make a static reference to the non-static field bookname
//		
//		TypeOfVariable_In_Java obj = new TypeOfVariable_In_Java();
//		System.out.println(obj.bookname);// null
//		System.out.println(obj.Author);// null
//		System.out.println(obj.price);// 0.0
//
//		TypeOfVariable_In_Java obj1 = new TypeOfVariable_In_Java();
//		System.out.println(obj.bookname);// null
//		System.out.println(obj.Author);// null
//		System.out.println(obj.price);// 0.0
		
		
//		TypeOfVariable_In_Java obj = new TypeOfVariable_In_Java();
//		obj.m1();// null
//		 m1();
//		obj1.m1();// Let us C


		
//		2. Static variables
		
//	    System.out.println(colname);// null
//		System.out.println(countryName);// India
		
//		3 ways to access static variable
//		TypeOfVariable_In_Java obj = new TypeOfVariable_In_Java();
//		System.out.println(countryName);// India
//		System.out.println(TypeOfVariable_In_Java.countryName);// India
//		System.out.println(obj.countryName);// India
		
//		System.out.println(countryName);// India-- access from static area
		
//		obj.m1();// India
		
//		System.out.println(salary); // 0
//		System.out.println(tax);// 0.0
//		System.out.println(cityName);// null in string case
//		System.out.println(symbol);// blank space -- char type me
		
		
//		TypeOfVariable_In_Java t1 = new TypeOfVariable_In_Java();
//		t1.x=888;
//		t1.y=999;
//		System.out.println(t1.x+ ".........." + t1.y);// 888..........999
//		TypeOfVariable_In_Java t2 = new TypeOfVariable_In_Java();
//		System.out.println(t2.x+"........."+t2.y);//888.........20
//		
//		TypeOfVariable_In_Java t3 = new TypeOfVariable_In_Java();
//		System.out.println(t3.x+"......."+t3.y);// 888.......20
//		
//		TypeOfVariable_In_Java t4 = new TypeOfVariable_In_Java();
//		t4.y=90;
//		System.out.println(t4.x+"......."+t4.y);//888.......90
//		
//		TypeOfVariable_In_Java t5 = new TypeOfVariable_In_Java();
//		System.out.println(t5.x+"......."+t5.y);// 888.......20
//		
//		TypeOfVariable_In_Java t6 = new TypeOfVariable_In_Java();
//		t6.x= 909;
//		System.out.println(t6.x+"...."+t6.y);// 909....20
//		t6.y=987;
//		System.out.println(t6.x+"...."+t6.y);// 909....987
		
//		Local variable : temporary/stack/automatic variable
		
//		int i=0;
//		for(int j=0; j<3; j++) {
//			i=i+j;
////			System.out.println(i+"...."+j);
////			0....0
////			1....1
////			3....2
//
//		}
//		System.out.println(i+"...."+j);// j cannot be resolved to a variable
		
//		try {
//			int j = Integer.parseInt("Ten");
//		}
//		catch(NumberFormatException e) {
//			j=10;// j cannot be resolved to a variable
//			
//		}
//		System.out.println(j);// j cannot be resolved to a variable
		
//		int j;
//		try {
//			 j = Integer.parseInt("Ten");
//		}
//		catch(NumberFormatException e) {
//			j=10;
//			
//		}
//		System.out.println(j);		// 10
		
		
//		int x;
//		System.out.println("I am not using local variable");//I am not using local variable
		
//		int x;
//		System.out.println(x);// The local variable x may not have been initialized
		
//		int x;
//		if(args.length > 0) {
//			x=10;
//			
//		}
//		System.out.println(x);// The local variable x may not have been initialized
		
//		int x=0;
//		if(args.length > 0) {
//			x=10;
//			
//		}
//		System.out.println(x);// 0
//		
		
//		int x;
//		if(args.length > 0) {
//			x=10;
//		}else {
//			x=20;
//		}
//		System.out.println(x);// 20
		
		
//		final int z= 30;
//		System.out.println(z);// 30
//		
//		public int x= 10;// Illegal modifier for parameter x; only final is permitted
//		private int x1=10;
//		protected int x2= 20;
//		static int x3= 19;
//		transient int x4= 19;
//		volatile int x5 =30;// Illegal modifier for parameter x5; only final is permitted
		
//		final int x6 =20;
//		
//		int k = 10;// local - primitive
//		int[] y = new int[3]; // local - reference
		
//		TypeOfVariable_In_Java t = new TypeOfVariable_In_Java();
//		System.out.println(t.x1);// null
//		System.out.println(t.x1[0]);// Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "t.x1" is null
									// at TypeOfVariable_In_Java.main(TypeOfVariable_In_Java.java:191)
		
		
//		TypeOfVariable_In_Java obj = new TypeOfVariable_In_Java();
//		System.out.println(obj.x);// [I@3fee733d -- class name of 1-D Array
//		System.out.println(obj.x[0]); // 0
//		System.out.println(obj.x[1]); // 0
//		System.out.println(obj.x[2]); // 0
		
		
//		TypeOfVariable_In_Java t = new TypeOfVariable_In_Java();
//		System.out.println(x1);// null
//		System.out.println(x1[0]);// Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "TypeOfVariable_In_Java.x1" is null
//									at TypeOfVariable_In_Java.main(TypeOfVariable_In_Java.java:216)
		
		
//		System.out.println(z);// [I@3fee733d
//		System.out.println(z[0]);// 0
//		System.out.println(z[1]);// 0
//		System.out.println(z[2]);// 0
		
		
//		int[] x;
//		System.out.println(x);
//		System.out.println(x[0]);
//		The local variable x may not have been initialized
//		The local variable x may not have been initialized
		
//		int[] x = new int[3];
//		System.out.println(x);// [I@3fee733d
//		System.out.println(x[0]);// 0
//		System.out.println(x[1]);// 0
//		System.out.println(x[2]);// 0
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	

		
		
		
		
		
		
		
		
		
		

	}
	
//	public  void m1() {
//		System.out.println(countryName);
//	}
	
//	public static void m1() {
//		TypeOfVariable_In_Java obj = new TypeOfVariable_In_Java();
//		System.out.println(obj.bookname);
//	}
	
//	public void m1() {
//		System.out.println(bookname); // need to study furhter for clear concepts
//	}

}
