package feb24_java_selenium;

public class UnaryOperatorDemo {
public static void main(String[] args) {
	// unary operator only require one operand
	// + , - , ++ , -- , ! , ~
	//	++ increment operator (always increase value by 1)
	// pre  increment ++i [first increase then assign]
	// post increment i++ [first assign then increase]
	
	int i = 10;
	int j = i++ + ++i + i-- + ++i;
	//      10  +  12 + 12  + 12
	
	System.out.println("i -> "+ i);
	System.out.println("j -> " + j);
	
	boolean b1 = false;
	System.out.println(!b1);
	
	int m1  = ~-10;  // 10 -> +10 , -1
	System.out.println(m1);
	
}
}
