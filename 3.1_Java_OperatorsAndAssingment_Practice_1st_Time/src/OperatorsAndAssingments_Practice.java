import java.util.ArrayList; 
	
public class OperatorsAndAssingments_Practice {
	//class Customer{
//	
//}
//class Test{
//	public static void main(String[] args)throws Exception {
//		Object O = Class.forName(args[0]).newInstance();
//		System.out.println("Object created for :"+O.getClass().getName());
////		System.out.println("Hello");
//- Other rest thing are thoery based and need setting for runnig in run time nad compile time seperately
//	}
//}
	public static void main(String[] args) {
//		Types of operators:-
//		1.Increment and decrement operators
//		2.Arithmetic operators
//		3.String concatenation operators
//		4.Relational operators
//		5.Equality operators
//		6.instanceOf operators
//		7.bitwise operators
//		8.short circuit operators
//		9.type cast operators
//		10.Assignment operators
//		11.conditional operators
//		12.new operators
//		13.[] operators
//		14.operator precedence
//		15.Evaluation order of operands
//		16.new vs newInstance()
//		17.instanceOf Vs isInstance()
//		18.ClassNotFoundException Vs NoClassDefFoundError

//		1. Increment & Decrement operators:-
//		Increment - Pre-Increment , y=++x;
//		Increment - Post-Increment, y=x++;
		
//		Decrement - Pre-Decrement , y=--x;
//		Decrement - Post-Decrement, y=x--;
		
//		int x= 10;
//		x++;
//		System.out.println(x);// 11
		
//		Pre Increment
//		int x= 10;
//		int y= ++x;// pre incr -- here y value = 11
//		System.out.println(x);// 11
//		System.out.println(y);// 11
		
//		Post Increment
//		int x= 10;
//		int y= x++;
//		System.out.println(y);// 10
//		System.out.println(x);// 11
//		
//		int x= 10;
//		int y= x+1;
//		System.out.println(x);// 10
//		System.out.println(y);// 11
		
//		Pre Decrement
//		int x= 10;
//		int y= --x;
//		System.out.println(y);// 9
//		System.out.println(x);// 9
		
//		Post Decrement
//		int x= 10;
//		int y= x--;
//		System.out.println(y);// 10
//		System.out.println(x);// 9
		
//		int x= 10;
//		int y= ++10;// Invalid argument to operation ++/--
//		System.out.println(x);
////		System.out.println(y);
//		int z = 10++;// Invalid argument to operation ++/--
//		System.out.println(z);
		
		
//		int x= 10;
//		int y= ++ (++x);// Invalid argument to operation ++/--
//		System.out.println(y);
		
//		final int x = 10;
//		x++;// The final local variable x cannot be assigned. 
////		It must be blank and not using a compound assignment
//		System.out.println(x);
		
		
//		final int x = 10;
//		x++;
//		System.out.println(x);// The final local variable x cannot be assigned. It must be blank and not using a compound assignment
		
//		int x = 10;
//		x++;
//		System.out.println(x);
		
//		int x= 10;
//		int y= x++;
//		int z = x;
//		z++;
//		
//		System.out.println(y);// 10
//		System.out.println(x);// 11
//		System.out.println(z);// 12
		
//		int x = 10;
//		int y = ++x;
//		int z= y;
//		System.out.println(z);// 11
//		z++;
//		System.out.println(y);// 11
//		System.out.println(x);// 11
//		System.out.println(z);// 12
	
//		int x= 10;
//		x++;
//		System.out.println(x);// 11
		
//		char ch = 'a';
//		ch++;
//		System.out.println(ch);// b
		
//		char ch = 'a';
//		ch++;
//		System.out.println(ch);// b
		
//		double d = 10.5;
//		d++;
//		System.out.println(d);// 11.5
		
//		double d = 10.5;
//		++d;
//		System.out.println(d);// 11.5
		
//		boolean b = true;
//		b++;// Type mismatch: cannot convert from boolean to int
//		System.out.println(b);
		
//		char ch = 'a';
//		char y = ch++;
//		System.out.println(ch);//b
//		System.out.println(y);//a
		
		
		
		
		
//		Diff Btwen b++ and b=b+1
		
//		byte b = 10;
//		byte a= 10;
//		byte c= a+b;// max(int,type of a, type of b)--> max(int,byte,byte)
//		System.out.println(c);//Type mismatch: cannot convert from int to byte
		
//		byte a = 10;
//		byte b = -1;
//		byte c= (byte)(a+b);
//		System.out.println(c);//9
		
		
//		byte b= 10;
//		byte a = 10;
//		byte c = a+b;// Type mismatch: cannot convert from int to byte
//		System.out.println(b);
		
//		int b = 10;
//		int a= 10;
//		int c = a+b; // max(int,type of a, type of b)--> max(int,int,int)
//		System.out.println(c);// 20
		
//		short a = 10;
//		short b = 10;
//		short c = a+b;
//		System.out.println(c);// Type mismatch: cannot convert from int to short
		
//		short a = 10;
//		short b = 10;
//		short c = (short)(a+b);
//		System.out.println(c);// 20
		
//		char ch = 'a';
//		char ch1 = 'b';
//		char chs  = ch + ch1;
//		System.out.println(chs);// Type mismatch: cannot convert from int to char
		
//		char ch = 'a';
//		char ch1 = 'b';
//		char chs  = (char)(ch + ch1);
//		System.out.println(chs);//Ã
		
//		char ch2 = 'Ã';
//		int in = ch2+0;
//		System.out.println(in);
		
		
//		char ch = 'a';
//		char ch1 = 'b';
//		int x = ch;
//		int y= ch1;
//		System.out.println(x);//97
//		System.out.println(y);//98
		
//		char x = 'a';
//		char y= 'b';
//		long l = x+y;
//		System.out.println(l);// 197
		
//		char x= 'a';
//		char y='b';
//		float f= x+y;
//		System.out.println(f);// 195.0
		
//		char x= 'a';
//		char y='b';
//		double d= x+y;
//		System.out.println(d);// 195.0
		
//		char ch = 'a';
//		double d = 10.5d;
//		double sum = ch +d;
//		System.out.println(sum);// 107.5
		
//		char ch = 'a';
//		double d = 10.5d;
//		int sum = (int)(ch +d);
//		System.out.println(sum);// 107
		
		
		
		
		
		
//		byte b= 10;
//		byte a = 10;
//		byte c = (byte)(a+b);// Type mismatch: cannot convert from int to byte
//		System.out.println(c);// 20
		
//		byte b= 10;
//		byte a = 20;
//		byte c = a + b;
//		System.out.println(c);// Type mismatch: cannot convert from int to byte
//		byte b = 10;
//		b= b+1;// Type mismatch: cannot convert from int to byte
//		System.out.println(b);
		
//		byte b= 10;
//		byte a = 20;
//		byte c = (byte)(a + b);
//		System.out.println(c);
		
//		byte b = 10;
//		b= (byte)(b+1);
//		System.out.println(b);// 11
		
//		byte b = 10;
//		b= (byte)(b+1+b);
//		System.out.println(b);// 21
		
//		byte b = 10;
//		b= (byte)(b+1+b-b+10-12);
//		System.out.println(b);// 9
		
//		byte b = 10;
//		b= (byte)(b+1);
//		System.out.println(b);// 11
		
//		byte b =20;
//		b= b+1;
//		System.out.println(b);
		
//		byte c = 20;
//		c= c++;
//		System.out.println(c);//20
		
		
//		int a = 10;
//		int c = 10;
//		byte z = (byte)(a+c);
//		System.out.println(z);
		
		
		
//		int x= 10;
//		int y = ++ (++x);// Invalid argument to operation ++/--
//		System.out.println(y);
		
//		int x= 10;
//		int y= ++ (++x);
//		System.out.println(y);// Invalid argument to operation ++/--
		
		
		
		
		
//		byte c = 20;
//		byte z = c++;
//		System.out.println(z);//20
		
//		byte b = 10;
//		b++;// (byte)b+1
//		System.out.println(b);// 11
		
//		byte b = 10;
//		b++;
//		System.out.println(b);//11
		
		
		
		
//		2. Arithematic Operator - (+,-,*,/,%)
		
//		byte b = 10;
//		byte c = 19;
//		byte sum = (byte)(b+c) ;
//		System.out.println(sum);// 29
		
		
//		byte b = 10;
//		short s = 19;
//		short sum = (short)(b+s);
//		System.out.println(sum);// 29
		
//		short s1 = 10;
//		short s2= 18;
//		short sum = (short)(s1+s2);
//		System.out.println(sum);// 28
		
//		byte b = 10;
//		long l = 19;
//		long sum = b+l;
//		System.out.println(sum);// 29  -- int to long conversion is possible 
		
//		long l = 10;
//		double d = 10.4;
//		double sum = l+d;
//		System.out.println(sum);// 20.4 -- int to double is possible and long is max among
		
		
//		float f = 10.4f;
//		long l = 10;
//		long sum = f+l;// Type mismatch: cannot convert from float to long
//		long sum = (long)(f+l);// 20-- ans in long
//		float sum = l+f;// 20.4
//		System.out.println(sum);
		
//		char ch = 'A';
//		char ch1 = 'B';
//		char sum = ch+ch1;// Type mismatch: cannot convert from int to char
//		int sum = ch+ch1;
//		System.out.println(sum);// 131
		
//		char ch = 'A';
//		double d = 10.5;
//		int sum = ch+d;// Type mismatch: cannot convert from double to int
//		char sum1 = ch+d;// Type mismatch: cannot convert from double to char
//		double sum = ch+d;// 75.5
//		System.out.println(sum);

//		System.out.println('a'+'b');//195
//		System.out.println('a'+10.5);// 107.5
//		System.out.println('a'+0.89);// 97.89
		
//		System.out.println(10/0);// java.lang.ArithmeticException: / by zero
		
//		System.out.println(10/0.0);// Infinity
//		System.out.println(-10/0.0);// -Infinity
		
//		System.out.println(10/0.0f);// Infinity
//		System.out.println(-10/0.0f);// -Infinity
		
//		System.out.println(10/0);// / by zero
		
//		System.out.println(10/0.0);// Infinity
//		System.out.println(10.0/0);// Infinity
//		System.out.println(-10.0/0);// -Infinity
		
		
		
//		 NaN- Not a Number
		
//		System.out.println(0/0);//  java.lang.ArithmeticException: / by zero
//		System.out.println(0/29);//0
		
//		System.out.println(0/0.0f);// NaN
//		System.out.println(-0/0.0f);// NaN
		
//		System.out.println(0/0.0);// NaN
//		System.out.println(-0/0.0);// NaN
	
//		System.out.println(0/0);//java.lang.ArithmeticException: / by zero
		
//		System.out.println(0.0/0);// NaN
//		
//		System.out.println(-0.0/0);// NaN
		
//		Summary
		
//		System.out.println(10/0); / by zero
//		System.out.println(10/0.0);// Infinity
//		System.out.println(0/0);// java.lang.ArithmeticException: / by zero
//		System.out.println(0.0/0);// NaN
		
//		System.out.println(10<Float.NaN);// false
//		System.out.println(10<=Float.NaN);// false
//		System.out.println(10>Float.NaN);// false
//		System.out.println(10>=Float.NaN);// false
//		System.out.println(10==Float.NaN);// false
//		System.out.println(Float.NaN == Float.NaN);// false
//		System.out.println(10 != Float.NaN);// true
//		System.out.println(Float.NaN != Float.NaN);// true
		
		// need to study further on NaN 
		
		
		
//		2. String Concatenation operator:(+) lecture 18
		
//		String a = "Fahad";
//		int b=10,c=20,d=30;
//		System.out.println(a+b+c+d);// Fahad102030
//		System.out.println(b+c+d+a);// 60Fahad
//		System.out.println(b+c+a+d);// 30Fahad30
//		System.out.println(b+a+c+d);// 10Fahad2030
		
//		System.out.println(a=a+b+c);//Fahad1020
//		System.out.println(a=b+c+d);// Type mismatch: cannot convert from int to String
//		System.out.println(b=a+c+d);// Type mismatch: cannot convert from String to int
//		System.out.println(b=b+c+d);// 60
		
//		4. relational Operator (<,<=,>,>=)
//		System.out.println(10<20);// true
//		System.out.println('a'<20);//false
//		System.out.println('a'<97.6);// true
//		System.out.println('a'<'A');// false
//		System.out.println(true>false);// The operator > is undefined for the argument type(s) boolean, boolean
		
//		System.out.println("fahad102">"fahad");//The operator > is undefined for the argument type(s) java.lang.String, java.lang.String
		
//		System.out.println(10<20<30);// The operator < is undefined for the argument type(s) boolean, int
		
//		5. Equality operator (==, !=)
		
		
	
		
		
//		--------Revision Practice -----------------------------------------------------------------------------
		
		
//		int x = 10;
//		int y=++x; // Pre-Increment
//		int z =x++; // 11 // Post-Increment
//		System.out.println(y); // 11 - OP
//		System.out.println(z); // 11
//		int m =x++; // 11
//		System.out.println(m); // 11
//		
//		int x= 10;
//		int y = ++x;
//		System.out.println(y);
//		int z = x++;
//		System.out.println(z);
//		int m = x++;
//		System.out.println(m);
		
		
		
//		int x=20;
//		int y= ++x; // Isi line me value incr ho gayi //Pre-Increment
//		System.out.println(y); // 21
//		System.out.println(x); // 21
//		
//		int x= 30;
//		int y= x++;
//		int z= ++x;
//		System.out.println(y); // 30
//		System.out.println(x); // 32
		
		
//		int x= 30;
//		int y= x++; // Post-Increment
//		System.out.println(y); // 30 Post-Increment
//		System.out.println(x); // 31 Post-Increment
//		int x= 90;
//		int y= x++;
//		System.out.println(x);// 91
//		int y= ++x; //91
//		System.out.println(y);// 90
		
		
//		int y=20;
//		int x= --y; //Pre-Decrement
//		System.out.println(x); // 19 Pre-Decrement 
//		System.out.println(y); //19  Pre-Decrement
		
//		int z= 20;
//		int x= z--; // Post-Decrement
//		System.out.println(x); // 20 Post-Decrement
//		System.out.println(z); // 19 Post-Decrement
		
//		int x= 10;
//		int y = x++;
//		System.out.println(y); // 10
//		System.out.println(x);// 11
//		int z= --x;
//		System.out.println(z); // 10
		
//		int x= 10;
//		int y= --x;
//		int z = x--;
//		System.out.println(y);
//		System.out.println(z);
//		System.out.println(x);
		
//		We cant apply incremnt and decrement operators on constant values.
//		int x = 10;
//		int y = ++10;
//		System.out.println(y);// Unresolved compilation problem: 
//		int x= 10;
//		int y= 10++:
//		System.out.println(y);
		//Invalid argument to operation ++/--
//		Nesting of INC/DEC operators is not allowed
		
//		int x= 10;
//		int y= ++(++x);
//		System.out.println(y); // Unresolved compilation problem: 
		//Invalid argument to operation ++/--
		
//		int x= 10;
//  	int y= ++(x);
//		int z= ++(++x); // neasting of increment and decrement operators is not allowed.
//		System.out.println(z);
//		++x means value not a variable.. here we required variable not a valuex.
		
		
//		For FINAL variables we cant apply incr/decr operators.
//		final int x = 10;
//		x++;// Unresolved compilation problem: 
//		int y= x++;// Unresolved compilation problem: 
//		System.out.println(y);// Unresolved compilation problem: 
		
//		final int x= 10;
//		int y = x++;
//		System.out.println(y);
		
		//The final local variable x cannot be assigned.
//		It must be blank and not using a compound assignment
		
//		final int x= 10;
//		x=11;
//		System.out.println(x);
		
		
		
//		final int x =10;
//		x=11;// Unresolved compilation problem: 
//		System.out.println(x);// The final local variable x cannot be assigned.
//		It must be blank and not using a compound assignment
		
		
//		int x = 10;
//		x++;
//		int y=x++;//10
//		System.out.println(y);// 11
//		System.out.println(x);// 12
		
		
		
		
//		int x = 10;
//		x++;
//		System.out.println(x);// 11
//		int y=x++;
//		System.out.println(y);// 11
//		System.out.println(x);// 12
//		System.out.println(y);// 11 // first assigned then increment.
//		
//		final int x= 10;
//		int y= x++;
//		System.out.println(y);
		
		
//		char ch = 'a';
//		ch++;
//		int y= ch;
//		System.out.println(ch); // b
//		System.out.println(y); //98
		
//		char ch = 'a';// a=97
//		ch++;
//		int y=ch;
//		System.out.println(ch);// b  becz value of a is 97 so after increment value becomes 98 which is value of b
//		System.out.println(y);// 98
		
//		double d= 10.9;
//		d++;
//		System.out.println(d);// 11.9
		
//		double d = 10.5;
//		d++;
//		System.out.println(d);// 11.5
		
//		boolean b = true;
//		b++;
//		System.out.println(b);// Type mismatch: cannot convert from boolean to int
		
//		boolean b = false;
//		b++;// b+1-- (false+1)  Type mismatch: cannot convert from boolean to int
//		System.out.println(b);
		
//		boolean b = false;
//		System.out.println(b);
		
		
		
//		operator ++ can not applied to boolean
//		?We can apply inc/decr operators for every primitive data type only except to boolean
//		
		//Date&Time=04:03PM,Wednesday,02/08/2023 START
//		
//		5. Diff btwn B++ & b=b+1 
		
//		If we applied any arithemetic operators between two variable a and b then
		//the result type is always	max of (int,type of a, type of b)
		
//		byte a = 10;
//		byte b = 20;
//		byte c = a+b;
//		System.out.println(c);// Type mismatch: cannot convert from int to byte
//		we can solve/handle it by usinf type casting
//		byte c = (byte)(a+b);
//		System.out.println(c);// 30
		
//		byte a = 10;
//		byte b = 20;
//		byte c = a+ b;// Type mismatch: cannot convert from int to byte
//		byte c= (byte) (a+b);
//		System.out.println(c);// 30
		
		
//		byte b = 10;
//		b= b+1;// Type mismatch: cannot convert from int to byte
//		System.out.println(b);//Type mismatch: cannot convert from int to byte
		
//		byte b =10;
//		b= b+1;
//		System.out.println(b);// Type mismatch: cannot convert from int to byte
		
//		byte b = 10;
//		b=(byte)(b+1);// using TypeCasting
//		System.out.println(b);// 11
		
//		byte b = 10;
//		b=(byte)(b+1);
//		System.out.println(b);// 11
		
//		byte b = 10;
//		b++;
//		System.out.println(b);//11

//		byte b = 10;
//		b++;// internal typecasting happen by default
//		System.out.println(b);// 11
//		NOTE:- In case of INcr/Decr operator internal TypeCasting perform automatically
//		
//		byte b = 10;
//		byte c = 20;
//		byte d =(byte) (b+c);
//		System.out.println(d);// 30
		
		
//		2.Arithmetic Opeartors:-(+,-,/,*,%)
//		If we apply any arithmetic opearators between a&b the result type is always
//		max(int,type of a , type of b)
//		
//		Fig: Typecasting flow
//		byte--->Short---->
//						----->int-->long-->		float-->double
//				char---->
		
//		byte + byte= int
//		byte + short= int
//		short + short=int
//		byte + long=long
//		long + double=double
//		float + long=float
//		char + char=int
//		char + double=double
		//Date&Time=04:23PM,Wednesday,02/08/2023 END
		
		//Date&Time=05:45PM,Wednesday,02/08/2023 START
//		System.out.println('a'+0.89);// 97.89-->a=97 (ASCII Value) -->97+0.89=97.89 double// char + double=double
//		byte b = 6;
//		byte c = 6;
//		System.out.println(b+c);// 12 jo ki int hai= byte + byte= int
//		System.out.println(32767+32767);// 65534 is int value short + short=int
//		System.out.println(127+32767);// 32894     byte + short= int
//		System.out.println(127+23717372);// 23717499 byte + long=long
//		System.out.println(1234531+10.3333);//1234541.3333 //long + double=double
//		System.out.println(212.332+932049832);// 9.32050044332E8 // float + long=float
//		System.out.println('a'+'a');// 194 char + char=int
//		System.out.println('a'+765.27);// 862.27  char + double=double
		
//		Infinity:-
//		In integral arithmetic(byte,short,int ,long) there is no way to represent infinity if infinity is a result then we will get AE: in integral arithmetic
//		
//		System.out.println(10/0);// Exception in thread "main" java.lang.ArithmeticException: / by zero
//		
//		System.out.println(10/0);/ by zero
	
//		But in floating point arithmetic (float & double) there is a way to represent infinity
//		for this float & double classes conatins the following two constatnt.
//		POSITIVE_INFINITY
//		NEGATIVE_iNFINITY
//		Hence even though result is infinity we wont get nay arithmetic exception in floating point arithmetic
//		
//		eg:-
//		System.out.println(10/0.0);// Infinity 10/float/double
//		System.out.println(10.0/0);// Infinity float/double/0
		
//		System.out.println(10/0.0);
//		System.out.println(10.0/0.0);
//		System.out.println(10/-0.0);
//		System.out.println(-10/0.0);
		
//		NaN:-(Not a number)
//		In integral arithmetic(byte,short,int ,long) there is no way to represent undefined result 
//		if undefined is a result then we will get AE: in integral arithmetic
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		
//		System.out.println(0/0);// Exception in thread "main" java.lang.ArithmeticException: / by zero
//		
//		System.out.println(0/0);// / by zero
		
//		But in floating point arithmetic (float & double) there is a way to represent undefined result
//		for this float & double classes contains NaN constant.
//		Hence if the result is undefined we won't get any AE. in floating point arithmetic
//		
//		System.out.println(0.0/0);// NaN
//		System.out.println(-0/0.0); // NaN
//		System.out.println(10/0);//  java.lang.ArithmeticException: / by zero
//		System.out.println(-10/0);// java.lang.ArithmeticException: / by zero
//		System.out.println(10/-0);// java.lang.ArithmeticException: / by zero
//		System.out.println(10.0/0);// Infinity
//		System.out.println(10.0/-0);// Infinity
//		System.out.println(-10.0/-0);// -Infinity
//		System.out.println(-10.0/0);// -Infinity
//		System.out.println(10.0/-0.0);// -Infinity
//		System.out.println(-10.0/-0.0); // Infinity
//		System.out.println(0.0/-0);// NaN
//		System.out.println(-0.0/0);// NaN
//		System.out.println(-0.0/-0);// NaN
//		System.out.println(-1.0/-0);// -Infinity
		
//		for any x value including NaN the following expression return false
//		int x =0;
//		System.out.println(x<NaN); // NaN cannot be resolved to a variable
//		System.out.println(x<=NaN); // NaN cannot be resolved to a variable
//		System.out.println(x>NaN); // NaN cannot be resolved to a variable
//		System.out.println(x>=NaN);  // NaN cannot be resolved to a variable
//		System.out.println(x==NaN);// NaN cannot be resolved to a variable
		
//		for any x value including NaN the following expression return true
//		System.out.println(x!=NaN);// x cannot be resolved to a variable
		//NaN cannot be resolved to a variable
		
//		System.out.println(10<float.NaN); // Syntax error on token "float", invalid Expression
		
//		System.out.println(10<Float.NaN); // false
//		System.out.println(10<=Float.NaN);// false
//		System.out.println(10>Float.NaN);// false
//		System.out.println(10>=Float.NaN);// false
//		System.out.println(10==Float.NaN);// false
//		System.out.println(Float.NaN==Float.NaN);// false
//		System.out.println(10!=Float.NaN);// true
//		System.out.println(Float.NaN!=Float.NaN);// true
		
//		System.out.println(10<Float.NaN);// false
		
		
//		3.String concatenation operators
		
//		The only overloaded operator in java is (+) operator. 
//		Sometime it is said arithmetic addition operators 
//		and sometime it is said string concatenation opeartors.
		
		
//		Case1:-
//		If atleast one argument is String type  then
//		(+) operator access String concatenation operator.
		
//		Case2:-
//		If both argument is number type  then
//		(+) operator access arithmetic addition operator.
		
//		eg1:-
//		String a = "fahad";
//		int b=10, c=20, d=10;
//		System.out.println(a+b+c+d);// fahad102010 String concatenation operator
//		System.out.println(b+c+d+a);//40fahad this expression has same operator then order of precedence is from left to right so it start add value from left and concat with a. So it use both String concatenation operator and arithmetic addition operator 
//		System.out.println(b+c+a+d);// 30fahad10 this expression has same operator then order of precedence is from left to right so it start add value from left and concat with a. So it use both String concatenation operator and arithmetic addition operator 
//		System.out.println(b+a+c+d);// 10fahad2010
		
		
//		String a = "fahad";
//		int b=10,c=20,d=10;
//		System.out.println(a+b+c+d);//
//		System.out.println(b+c+d+a);
//		System.out.println(b+c+a+d);
//		System.out.println(b+a+c+d);
		
//		eg2:-
//		String a = "fahad";
//		int b=10, c=20, d=30;
//		a=b+c+d;
//		System.out.println(a); // Type mismatch: cannot convert from int to String
//		a=a+b+c;
//		System.out.println(a);// fahad1020
//		b=a+c+d;
//		System.out.println(b);// Type mismatch: cannot convert from String to int
//		b=b+c+d;
//		System.out.println(b);// 60
		
//		String a= "fahad";
//		int b=10, c=20, d=30;
////		a=b+c+d;
////		System.out.println(a);//Type mismatch: cannot convert from int to String
//		a=a+b+c;
////		System.out.println(a);
////		b=a+c+d;
//		b=b+c+d;
//		System.out.println(b);//60
		
		
		
//		4.Relational operators (<,<=,>,>=)
//		We can apply relational operator for every primitive type except boolean.
//		eg:-
//		System.out.println(10<20);// true
//		System.out.println('a'<20);// false
//		System.out.println('a'<97.6); //true
//		System.out.println('a'>'A'); // true
//		System.out.println(true>false);// The operator > is undefined for the argument type(s) boolean, boolean
//		
//		System.out.println(10<20);// true
//		System.out.println('a'<20);// false
//		System.out.println('a'<97.6);// true
//		System.out.println('a'>'A');// true
//		System.out.println(true<false);
		
//		System.out.println(10<=10);// true
//		System.out.println(10>=10);// true
		
		
		
//		 We cannot apply relational operators for object/Non-Primitive types
//		eg
//		System.out.println("durga123">"durga");// The operator > is undefined for the argument type(s) java.lang.String, java.lang.String
		
//		System.out.println("fahad">"fahad");
		
//		Nesting of relational operator is not allowed otherwise we will get CTE.
//		System.out.println(10<20<30);// The operator < is undefined for the argument type(s) boolean, int
		
//		System.out.println(10<20>30);// The operator > is undefined for the argument type(s) boolean, int
		
//		5.Equality operators (==, !=)  //Date&Time=3:43PM,Friday,02/10/2023
//		we can use == operator for address comparison
		
//		we can  apply equality operator for every primitive type including boolean also.
		
//		System.out.println(10==20);// false
//		System.out.println('a'=='b'); // false
//		System.out.println('a'==97.0); //true
//		System.out.println(false==false);// true
//		System.out.println(true==true);// true
//		System.out.println('a'=='A');// false
//		System.out.println('a'==97);// true
//		System.out.println(127==127);// true
//		System.out.println("fahad"=="fahad");// true
//		System.out.println("fah"=="abd");// false// yahan address compare nahi ho raha.
		
//		System.out.println(10==10);
//		System.out.println(10==20);
//		System.out.println('a'==97.0);
//		System.out.println('a'==97);
//		System.out.println('a'=='a');
//		System.out.println(false==false);// true
//		System.out.println('a'=='A');// false
//		System.out.println("fahad"=="fahad");// true
//		System.out.println("fah"=="abd");// false
		
//		we can apply equality operator for object type also
//		for object references r1 and r2 , r1== r2 iff both reference pointing to the same object
//		(reference comparison or address comparison)
		
//		Thread t1 = new Thread();
//		Thread t2 = new Thread();
//		Thread t3=t1;
//		System.out.println(t1==t3);// true
//		System.out.println(t1==t2);// false
		
//		Thread t1 = new Thread();
//		Thread t2 = new Thread();
//		Thread t3 = t1;
//		System.out.println(t1==t3);// true
//		System.out.println(t1==t2);// false
		
//		Thread t1 = new Thread();
//		Object O = new Object();
//		String S = new String("durga");
//		System.out.println(t1==O);// false
//		System.out.println(O==S);// false
//		System.out.println(S==t1);// Incompatible operand types String and Thread
		
//		Thread t1 = new Thread();
//		Object O = new Object();
//		String S = new String("durga");
//		System.out.println(t1==O);
//		System.out.println(O==S);
//		System.out.println(S==t1);// Incompatible operand types String and Thread
		
		
		
//		!= operators
//		we can use != operator for address comparison
//		System.out.println(10!=20);// true
//		System.out.println('a'!='b'); // true
//		System.out.println('a'!=97.0); //false
//		System.out.println(false!=false);// false
//		System.out.println(true!=true);// false
//		System.out.println('a'!='A');// true
//		System.out.println('a'!=97);// false
//		System.out.println(127!=127);// false
//		System.out.println("fahad"!="fahad");// false
//		System.out.println("fah"!="abd");// true
		
//		Thread t1 = new Thread();
//		Object O = new Object();
//		String S = new String("durga");
//		System.out.println(t1!=O);// true
//		System.out.println(O!=S);// true
//		System.out.println(S!=t1);// Incompatible operand types String and Thread
		
		// In general we can use == operator for address comparison 
//		and .equals() method for content comparison.
		
//		eg:
//		String S1 = new String("durga");
//		String S2= new String("durga");
//		System.out.println(S1==S2);//false // this compare address of variable/object
//		System.out.println(S1.equals(S2));// true// this method compare content of variable/objects
		
//		String S1 = new String("fahad");
//		String S2 = new String("fahad");
//		System.out.println(S1==S2);// false - address compare ho raha
//		System.out.println(S1.equals(S2)); // content/value compare ho rahi
//		
		
		
//		for any object reference r == null is always false
//		but null == null is always true
		
//		String s = new String("durga");
//		System.out.println(s==null);// flase
//		
//		String s = new String("durga");
//		System.out.println(s==null);// flase-- address compare and not matched so result is false.
		
//		String n = null;
//		System.out.println(n==null);// true.
//		System.out.println(null==null);// true
		
		
//		String n = null;
//		System.out.println(n==null);// true
//		System.out.println(null==null);// true
		
//		Lecture 19:- 
//		6.instanceOf operators
		//Date&Time=01:03PM,Friday,02/10/2023
//		We  can use instanceof operator to check whether given object is of particular type or not.
		
//		Syntax:-
//		r instance X -- r is object reference  X is class or interface name
//		Thread t = new Thread();
//		System.out.println(t instanceof Thread);// true
//		System.out.println(t instanceof Object);  // true
//		System.out.println(t instanceof Runnable);// true
		
//		Thread t = new Thread();
//		System.out.println(t instanceof Thread);
//		System.out.println(t instanceof Object);
//		System.out.println(t instanceof Runnable);
		
//		int[] l = new int[9];
//		System.out.println(l[0]);
//		Object o = new l.get[0];
		
	
//		 ArrayList<String> l = new ArrayList<String>(); 
//		// Create an ArrayList object
//		 Object O = new l.get[0];
		
//		for any class or interface X null instanceof X  is always false
//		System.out.println(null instanceof Thread); // false
//		System.out.println(null instanceof Runnable);// false
		
		
//		Thread t = new Thread();
//		System.out.println(t instanceof String);// Incompatible conditional operand types Thread and String
		
//		System.out.println(null instanceof Thread);// false
//		System.out.println(null instanceof Object);// false
//		System.out.println(null instanceof Runnable);// false
		
		
		
//		7.bitwise operators (&, |, ^)
//		 & -- And,  returns true iff both arguments are true
//		 | -- OR  returns true iff atleast one arguments are true
//		 cap symbol - ^ -- Exor, exclusive OR, X-OR, returns true iff both arguments are different
		
//		eg :- 
//		System.out.println(true & false);// false
//		System.out.println(true | false);// true
//		System.out.println(true ^ false); // true
		
//		System.out.println(true & false); // false
//		System.out.println(true | false);// true
//		System.out.println(true ^ false);// true
//		System.out.println(true ^ true);// false	
//		System.out.println(false ^ false);// false
		
		
//		we can apply these for integral types also
//		System.out.println(4&5);// 4
//		System.out.println(4|5);// 5
//		System.out.println(4^5);// 1
		
//		System.out.println( 4 & 5);
//		System.out.println(4 |5);
//		System.out.println(4 ^ 5);
		
//		System.out.println(100 & 101);// 100
//		System.out.println(11 & 11); // 11
		
//		System.out.println(~4);// -5
		
//		System.out.println(~5);// -6
		
//		System.out.println(~38); // -39
		
		
		 
		
//		bitwise complement operators (~):- tild symbol
//		We can apply for only integral type not for boolean type OW CTE.
//		System.out.println(~true);  // The operator ~ is undefined for the argument type(s) boolean
//		System.out.println(~4);// -5
		
//		Boolean complement operator : (!)--
//		We can apply this operator only for boolean type but not for integarl types.
//		System.out.println(!8);// The operator ! is undefined for the argument type(s) int
//		System.out.println(!false);// true
//		System.out.println(!true);// false
		
//		System.out.println(!10);
//		System.out.println(!true);
//		System.out.println(!false);
		
		
		
//		Note :-
//		&,|,^-- applicable for both boolean & integral
//		~ -- applicable for only integral but not for boolean
//		!  applicable only for boolean but not for integral
		
		
		
//		8.short circuit operators :(&&, ||)
		
//		These are exactly same as bitwise operators(&,|) except only following differences.
		
//				$,|		|		&&,||
//		-------------------------------				
//		1.Both argument	|	1. second argument		
//		should be evalu	|		evaluation is optional	
//		ated always.	|			
//		
//		2.relatively	|	2.relatively performance
//		performance 	|	high
////	low
//		
//		3.applicable	|	3. applicable only for boolean but not
//		for both boolean |	for integral
//		and integral types|
						
//		Note:- 1. x&&y == y will be evaluated iff x is true i.e. if x is false then y will not be evaluated.
		
//		2.  x||y - y will be evaluated iff x is false i.e. if x is true then y will not be evaluated.
			
//		eg_
//		int x= 10;
//		int y=15;
//		if(++x<10 & ++y>15) {
//			x++;
//		}else {
//			y++;
//		}
//		System.out.println(x+"..."+y);// 11...17
		
//		int x = 10;
//		int y=15;
//		if(++x<10 & ++y>15) {
//			x++;
//		}else {
//			y++;
//		}
//		System.out.println(x+"..."+y);
		
//		int x= 10;
//		int y=15;
//		if(++x<10 && ++y>15) {
//			x++;
//		}else {
//			y++;
//		}
//		System.out.println(x+"..."+y);// 11...16
		
//		int x= 10;
//		int y=15;
//		if(++x<10 | ++y>15) {
//			x++;
//		}else {
//			y++;
//		}
//		System.out.println(x+"..."+y);// 12...16
		
//		
//		int x= 10;
//		int y=15;
//		if(++x<10 || ++y>15) {
//			x++;
//		}else {
//			y++;
//		}
//		System.out.println(x+"..."+y);// 12...16
		
		
//		int x = 10;
//		int y=15;
//		if(++x<10 && ++y>15) {
//			x++;
//		}else {
//			y++;
//		}
//		System.out.println(x+"..."+y);// 11...16

//		int x = 10;
//		int y=15;
//		if(++x<10 | ++y>15) {
//			x++;
//		}else {
//			y++;
//		}
//		System.out.println(x+"..."+y);// 
		
//		int x = 10;
//		int y=15;
//		if(++x<10 || ++y>15) {
//			x++;
//		}else {
//			y++;
//		}
//		System.out.println(x+"..."+y);// 12...16
		
//		int x = 10;
//		int y=15;
//		if(++x<10 || ++y>15) {
//			x++;
//		}else {
//			y++;
//		}
//		System.out.println(x+"..."+y);
		
		
//		eg:- 2-
		
//		int x= 10;
//		if(++x<10 && (x/0>10)) {
//			System.out.println("Hello !!");
//		}else {
//			System.out.println("Hii !!");
//		}// o/p:- Hii
//		
//		int x= 10;
//		if(++x<10 & (x/0>10)) {
//			System.out.println("Hello !!");
//		}else {
//			System.out.println("Hii !!");
//		}// : / by zero
		
//		int x= 10;
//		if(++x<10 && (x/0>10)) {
//			System.out.println("Hello !!");
//		}else {
//			System.out.println("Hii !!");
//		}
		
//		int x= 10;
//		if(++x<10 & (x/0>10)) {
//			System.out.println("Hello !!");
//		}else {
//			System.out.println("Hii !!");
//		}
		
		
//		int x= 10;
//		if(++x<10 & (x/2>10)) {
//			System.out.println("Hello !!");
//		}else {
//			System.out.println("Hii !!");
//		}
		
//		int x= 10;
//		if(++x<10 | (x/0>10)) {
//			System.out.println("Hello !!");
//		}else {
//			System.out.println("Hii !!");
//		}
		
		
//		int x= 10;
//		if(++x<10 | (x/2>10)) {
//			System.out.println("Hello !!");
//		}else {
//			System.out.println("Hii !!");
//		}
		
//		int x= 10;
//		if(++x<10 || (x/0>10)) {
//			System.out.println("Hello !!");
//		}else {
//			System.out.println("Hii !!");
//		}
		
//		9.type cast operators
		
//		1. Implicit typecasting
//		2. Explicit Typecasting
		
//		1.Implicit:
//		Compiler is responsible to perform ITC.
//		whenever we are assinging smaller Datatype value to bigger datatype variable ITC will be performed.
//		It is also known as widening and upcasting
//		There is no loss of information in this typecasting
//		The following are various possible conversion where ITC will be performed.
		
//		Fig: Typecasting flow : ITC
//		byte--->Short---->
//						----->int-->long-->float-->double
//				char---->
		
//		eg:-
//		int x='a'; 
//		System.out.println(x);// 97// compiler convert char to int automatically by ITC
//		int x= 'a';
//		System.out.println(x);// 97
//		
//		double d = 10;
//		System.out.println(d);// 10.0
		
//		long l = 10;
//		System.out.println(l);// 10
		
		
//		float f = 10;
//		System.out.println(f);// 10.0
		
		
//		double d = 10;
//		System.out.println(d);// 10.0  compiler convert int to double automatically by ITC
		
//		double d = 'a';
//		System.out.println(d);// 97.0
		
//		long l = 'a';
//		System.out.println(l);// 97
		
//		float f = 'a';
//		System.out.println(f);// 97.0
		
		
		
//		2.Explicit Type casting:
//		Programmer is responsible to perform ETC.
//		whenever we are assinging bigger Datatype value to smaller datatype variable then  ETC will be required.
//		It is also known as narrowing and downcasting
//		There may a chance of loss of information in this typecasting
		
//		The following are various possibilities  where ETC will  required.
		
//		Fig: ETC
//		byte<---Short<----
//						<-----int<--long<--float<--double
//				char<----
		
//		L---R -- Implicit TypeCasting
//		R---L -- Explicit Typecasting
		
//		eg:-
//		int x = 130;
//		byte b = x;
//		System.out.println(b);// Type mismatch: cannot convert from int to byte
		
//		int x = 130;
//		byte b = (byte) x; //  cannot convert from int to byte
//		System.out.println(b);// -126
		
		
//		int x = 130;
//		byte b = (byte)x;
//		System.out.println(b);// -126
		
//		whenever we are assingnig bigger D.T value to smaller D.T variable by ETC The MSB will be lost
//		We have to consider only LSB
		
//		int x= 150;
//		short s = (short)x;
//		System.out.println(s);// 150
//		
//		int x = 150;
//		short s = (short)x;
//		System.out.println(s);// 150
		
//		byte  b = (byte)x;
//		System.out.println(b);// -106
		
//		int x = 150;
//		byte b= (byte)x;
//		System.out.println(b);// -106
		
//		int x = 509;
//		byte b = (byte)x;
//		System.out.println(b);// -3
		
//		int x = 509;
//		short s = (short)x;
//		System.out.println(s);// 509
		
		
		
		
		
//		Float to integral value -- digit after decimal point lost
//		double d = 130.456;
//		int x = (int)d;
//		System.out.println(x);// 130
//		byte b = (byte)d;
//		System.out.println(b);// -126
		
//		double d = 130.456;
//		int x = (int)d;
//		System.out.println(x);// 130
		
//		double d = 130.456;
//		byte b = (byte)d;
//		System.out.println(b);// -126
		
//		float f = 130.456f;
//		int x = (int)f;
//		System.out.println(x);// 130
		
		
//		Lecture 21: 10.Assignment operators : 
//		Three types
//		1.Simple assingment
//		2.chained 
//		3.compound
		
//		1.Simple:-   int x= 10;
//		int x = 10;
//		literal value 10 assigned to  var x
		
//		2.chained:-  
//		int a,b,c,d;
//		a=b=c=d=20;
//		System.out.println(a+".."+b+"..."+c+"..."+d);// 20..20...20...20
		
		
//		int a,b,c,d;
//		a=b=c=d=10;
//		System.out.println(a+".."+b+".."+c+".."+d);//10..10..10..10

//		We can't performed chain assingment directly at the time of declaration
//		eg:-
//		 int a =b=c=d=20;
//		 System.out.println(a+".."+b+"..."+c+"..."+d);// b cannot be resolved to a variable
//			c cannot be resolved to a variable
//			d cannot be resolved to a variable
//		 at OperatorsAndAssignment.main(OperatorsAndAssignment.java:555)
		
//		int b,c,d;
//		int a=b=c=d=20;
//		System.out.println(a+".."+b+"..."+c+"..."+d);// 20..20...20...20
//		int b,c,d;
//		int a=b=c=d=20;
//		System.out.println(a+".."+b+"..."+c+"..."+d);//20..20...20...20
		
//		3.Compound Assignment Operator:-
//		Sometime assignment operator mixed with some other operator then we called that operator is CAO.
		
//		int a= 20;
//		a+=30;// -- a=a+30
//		System.out.println(a);// 50
		
//		int a = 20;
//		a+=30;// -- a=a+30;
//		System.out.println(a);// 50

//		The following are all possible compound assingment operator in java
		
//		+=		&=		>>= right shift operator
//		-=		|=		>>>= unsigned right shift operator
//		*=		^=		<<= left shift operator
//		/=
//		%=   Total === 11
		
//		in case of CAO internal T.C will performed automatically
//		 byte b = 10;
//		 b=b+1;  // max(int,byte,int)
//		 System.out.println(b);// Type mismatch: cannot convert from int to byte
		 
//		byte b =10;
//		b=b+1;// cannot convert from int to byte
//		System.out.println(b);
//		
		
//		byte b = 10;
//		b++;
//		System.out.println(b);// 11

//		 byte b = 10;
//		 b++;
//		 System.out.println(b);// 11
		 
//		 byte b = 10;
//		 b+=1;  // += CAO internal TC is performed.
//		 System.out.println(b);//11
		
//		byte b =10;
//		b+=1; // b=b+1 
//		System.out.println(b);// 11

//		byte b = 127;
//		b+=1;
//		System.out.println(b);//-128
		
//		byte b =127;
//		b+=1;
//		System.out.println(b);// -128
		
//		byte b = 127;
//		b+=127;
//		System.out.println(b);//-2
		
//		byte b =127;
//		b+=129;
//		System.out.println(b);//0
		
//		byte b =127;
//		b+=130;
//		System.out.println(b);//1

//		byte b = 127;
//		b+=3;
//		System.out.println(b);//-126
		
//		int a,c;
//		int b=20; // simple
//		int d; // simple only declared
//		a=c=d=20; //chained 
//		a+= b-= c*= d/= 2; // compound
//		System.out.println(a+"..."+b+"..."+c+"..."+d);// -160...-180...200...10
		
//		int a,c;
//		int b=20;
//		int d;
//		a=c=d=20;//chained
//		a+= 10;
//		b-=5;
//		c*=4;
//		d/=7;
//		System.out.println(a+"..."+b+"..."+c+"..."+d);//30...15...80...2
		
//		int a=10;
//		a+=a+10;
//		System.out.println(a);//30
		
//		int a=10;
//		a+=a+=a+=a-+a-+30;
//		System.out.println(a);
		
//		int a=10;
//		a+=12+12;
//		System.out.println(a);//34

//		int a,b,c,d,e,f,g,h;
//		a=b=c=d=e=f=g=h=10;
//		a+=10;
//		b-=10;
//		c/=10;// return quotient
//		d*=10;
//		e%=10; // return reminder
//		
//		f&=10; // f&10==> 10&10 = Ans 10 - 1010&1010==1010=10
//		g|=10; // 
//		h^=10;// x-OR cap 
//		
//		System.out.println(a); // 20
//		System.out.println(b); // 0
//		System.out.println(c); // 1
//		System.out.println(d); // 100
//		System.out.println(e); /// 0
//		System.out.println(f); // 10
//		System.out.println(g);// 10
//		System.out.println(h); // 0
		
		
//		11.conditional operators: (? :) Ternary operator
//		The only possible ternary operator in java is conditional operator
//		Syntax : 
//		int  x= (10<20)? 30:40;
		
//		is same as in if else condition
//		if(10<20) {
//			System.out.println("30"); // 30
//		}else {
//			System.out.println("40");
//		}
//		System.out.println(x);// 30
//		
//		int x=  (10<20) ? 30 :40;
//		System.out.println(x);//30
		
//		int  x;
//		if(20<30) {
//			x=10;
//		}
//		else {
//			x=20;
//		}
//		System.out.println(x);// 10
		
		
//		neasting of conditional operator is also possible
		
//		 int x = (10>20)?30 :(40>50)?60:70;
//		 System.out.println(x);// 70
//		is same as 
//		if(10>20) {
//			System.out.println("30"); 
//		}else if(40>50) {
//			System.out.println("60");
//		}else {
//			System.out.println("70");// 70
//		}
		
		
//		int x =(10>20)?30 : (40>90)? 40 : 60;
//		System.out.println(x);// 60
		
//		int x= (10>=30)?30:40;
//		System.out.println(x);//40
		
		
//		int x= (10<10) ? 10 : (10>30) ? 20 : (10<=5) ? 30 : (10>=60)? 40 : (10==10) ? 50 :60;
//		System.out.println(x);// 50
		
		
//		int x= (10<10) ? 10 : (10>30) ? 20 : (10<=5) ? 30 : (10>=60)? 40 : (10==20) ? 50 :60;
//		System.out.println(x);// 60
			
		
//		int x= (10<10) ? 10 : (10>30) ? 20 : (10<=5) ? 30 : (10>=60)? 40 : (10!=10) ? 50 :(97.0==97) ?  60  :70;
//		System.out.println(x);// 60
		
//		int x= (10<10) ? 10 : (10>30) ? 20 : (10<=5) ? 30 : (10>=60)? 40 : (10!=10) ? 50 :(97.1==97) ?  60  :70;
//		System.out.println(x);// 70
		
		
		
//		System.out.println(10!=10);//falase
		
		
//		a++, ++a -- unary operator because only one operand is there i.e "a"
//		a+b -- binary operator because two  operand is there i.e "a" and "b"
//		(c)?b:d; ternary operator because three  operand is there i.e "a" , "b" and "c"
		
//		c,b,d are 3 operand
		
//		if(true&&false) {
//			System.out.println("Hii");
//		}
//		else
//		{
//			System.out.println("Hello");
//		}
//		// hello
		
//		if(10>20 && 30<40) {
//			System.out.println("Hii");
//		}else {
//			System.out.println("Hello");
//		}// Hello
		
		
//		if(true && true && true) {
//			System.out.println("Hello");
//		}else
//		{
//			System.out.println("Hello");
//		}// Hello
//		
//		if(true & true & true) {
//			System.out.println("Hello");
//		}else
//		{
//			System.out.println("Hello");
//		}// Hello
		
//		if(10<20 && 30<60 && 40<80 && 50<90 && 60<90) {
//			System.out.println("Hello");
//		}else {
//			System.out.println("Hii");
//		}// Hello
		
//		12.new operators  -- theory only
//		we can use this new operator to create object of class
//		eg:- Test t = new Test();
//		After creating an object constructor will be executed to perform
//		initialization of object not for creation of object
		
//		
//		basically after creation of test class object by using new keyword constructor immideately execute (automatically) and perform initialization of created object
//		so, The  role of constructor is to perform initialization of object not creation of object.
		
		
		
//		13.[] operators -- theory only
		
//		we  can use this operator to declare and create arrays only
//		eg:- 
//		int[] x = new int[10];
//		In general other than arrays we are not going to use this operator anywhere else
		
//		int[] x = new int[10];
		
//		Lecture 22: //		
//		
//		14.operator precedence
		
//		Java operator precedence chart
		
//		1. unary operator
//		[],x++,x--
//		++x,--x,~,|
//		new, <type>
		
//		2.Arithmetic Operator
//		*,/,%
//		+,-
		
//		3.Shift operator
//		>>,>>>,<<
		
//		4.Comparision operator
//		<,<=,>,>=,instanceof
		
//		5.equality operator:
//		==, !=
		
//		6. Bitwise operator
//		&,^,|
		
//		7.Short Circuit operator
//		&&, ||
		
//		8.conditional operator
//		? : 
		
//		9.Assignment operator
//		=, +=, -=, *=     .args.clone(). all  11 CAO
		
//		15.Evaluation order of operands
		
//		If we apply any operator  on operand all operand will evaluated from left to right
		
//		System.out.println(m1(1)+m1(2)*m1(3)/m1(4)+m1(5)*m1(6)); // 32
//		 1+2*3/4+5*6
//		 1+6/4+5*6
//		 1+1+30
//		 2+30
//		 32
		
//		System.out.println(m1(1)+m1(2)*m1(3)/m1(4)+m1(5)*m1(6));
//		
//		System.out.println(m1(1)+m1(2)*m1(3)/m1(4)+m1(5)*m1(6)*m1(7)/m1(8)+m1(9)-m1(10));// 27
//	    1+2*3/4+5*6*7/8+9-10
//		1+6/4+5*6*7/8+9-10
//		1+1+5*6*7/8+9-10
//		1+1+30*7/8+9-10
//		1+1+210/8+9-10
//		1+1+26+9-10
//		2+26+9-10
//		28+9-10
//		37-10
//		27
		
//		If multiple operator has same precedence then it execute from left to right
//		and right to left accrdng to associativity.
		
//		For more detail : See Java operator precedence table
		
//		Lecture 23 : 
//		16.new vs newInstance()
//		1.new : - We can use this new operator to create an object , if we know classname at the beggining
//		eg:- 
//		Test t = new Test();
//		Student S = new Student();
//		Customer C = new Customer();
		
//		2. newInstance():- is a method in Class.class we can use newInstance method to create object, 
//		if we don't know class name at begining and it is available dynamically at runtime from
//		CLA,file,database.
//		eg: above
//		17.instanceOf Vs isInstance()
//		18.ClassNotFoundException Vs NoClassDefFoundError
//		both above 17 & 18 point are theory based and interview question only 
		
		
		
		


	}
//	public static int m1(int i) {
//	System.out.println(i);// 1,2,3,4,5,6
//	System.out.println(i);//1,2,3,4,5,6.7,8,9,10
//	return i;
//}
	
//	public static int m1(int i) {
//		System.out.println(i);
//		return i;
//	}

}
