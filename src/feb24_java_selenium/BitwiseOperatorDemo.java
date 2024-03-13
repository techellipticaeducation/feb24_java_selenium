package feb24_java_selenium;

public class BitwiseOperatorDemo {
public static void main(String[] args) {
	// AND OR
	//  AND  - & (all situation must be true) - bitwise, 
//	&& - Logical
//	true & true = true
//  true & false = false
//  false & true = false
//  false & false = false
	
	// OR | (any one is true then result is true) - Bitwise
	// || - Logical
//	true | true = true
//  true | false = true
//  false | true = true
//  false | false = false	
	
	System.out.println(TRUE() || TRUE()); // 10 seconds
	// Interview Question 
}

public static boolean TRUE() { // 5 seconds
	System.out.println("m1 - 5 seconds");
	return true;
}

public static boolean FALSE() { // 5 seconds
	System.out.println("m2  - 5 seconds");
	return false;
}



}
