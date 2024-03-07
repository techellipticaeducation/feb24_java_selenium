package feb24_java_selenium;

public class CharDemo {
	public static void main(String[] args) {
//		2 type of 
		
//		ascii code - 1 byte
//		unicode code - 2 byte
		
		char c1 = ' ';
		System.out.println(c1);

		int c1AsciCode = c1;
		System.out.println(c1AsciCode);
		
		int i = 70;
		char jk = (char)i;
		System.out.println(jk);
		
		
		// for every language in world - unicode chart
		
		char b1 = '\u0935';
		char b2 = '\u0948';
		char b3 = '\u092D';
		System.out.println(b1 +""+ b2 + ""+b3+""+b1);
		
		
	}
}
