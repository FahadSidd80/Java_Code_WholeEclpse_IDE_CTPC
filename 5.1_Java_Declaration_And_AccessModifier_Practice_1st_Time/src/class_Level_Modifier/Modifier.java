package class_Level_Modifier;
// //only public, abstract & final are permitted

class defaultdclass{ // Top level class
	
}

final class f { // Top level class
	
}

abstract class ab {// Top level class
	
}


strictfp class strfp{ // Top level class
	
}


public class Modifier { // Top level class

	private class A{ // internal class
		
	}
	
	protected class B {  // internal class
		
	}
	
	static class C{ // internal class
		
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");

	}

}



//private class Modifier {// Illegal modifier for the class Modifier; 
//only public, abstract & final are permitted
//
//	public static void main(String[] args) {
//		
//		System.out.println("Hello");
//	}
//
//}


