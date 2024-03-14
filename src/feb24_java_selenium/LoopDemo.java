package feb24_java_selenium;

public class LoopDemo {
	public static void main(String[] args) {
		// while / do.while and for
		
		// while - first check condition , it execute its body
//		int i = 20;
//		while( i <= 10) {
//			System.out.println(i);
//			i++;
//		}
		
		
		// first execution , then condition
		// at-least it will execute once
		
//		int j = 20;
//		do {
//			System.out.println(j);
//			j++;
//		}while(j <= 10);
	
	 // for loop
//		for(int i = 0 ; i <= 10 ; i++) {
//			System.out.println("Hello");
//		}
//		+ arithmatic
//		+ unary operator
//		+ append
		// primary nature is arithmatic, if string got involved , append
		System.out.println(10+20+30); // 60
		System.out.println(10+20+""+30); // 3030 , 60
		System.out.println(10+""+20+30); // 1050 
		
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println("5 * " + i + " = " + (5*i));
		}
		
		
		
		
	}
}
